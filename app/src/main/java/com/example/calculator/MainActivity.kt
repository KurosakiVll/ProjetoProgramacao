package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvDisplay: TextView
    private var operand1: Double? = null
    private var pendingOp: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDisplay = findViewById(R.id.tvDisplay)

        // Números y punto
        val btnIds = listOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3,
            R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7,
            R.id.btn8, R.id.btn9, R.id.btnDot
        )
        for (id in btnIds) {
            findViewById<Button>(id).setOnClickListener { v ->
                val b = v as Button
                tvDisplay.append(b.text)
            }
        }

        val opIds = listOf(
            R.id.btnAdd to "+",
            R.id.btnSub to "−",
            R.id.btnMul to "×",
            R.id.btnDiv to "÷"
        )
        for ((id, op) in opIds) {
            findViewById<Button>(id).setOnClickListener {
                performOp(op)
            }
        }

        findViewById<Button>(R.id.btnEq).setOnClickListener {
            performOp("=")
        }

        findViewById<Button>(R.id.btnClear).setOnClickListener {
            tvDisplay.text = ""
            operand1 = null
            pendingOp = null
        }
    }

    private fun performOp(op: String) {
        val value = tvDisplay.text.toString().toDoubleOrNull()
        if (value != null) {
            if (operand1 == null) {
                operand1 = value
            } else {
                operand1 = when (pendingOp) {
                    "+" -> operand1!! + value
                    "−" -> operand1!! - value
                    "×" -> operand1!! * value
                    "÷" -> if (value != 0.0) operand1!! / value else Double.NaN
                    else -> value
                }
            }
        }
        tvDisplay.text = if (op == "=") {
            val result = operand1.toString()
            operand1 = null
            pendingOp = null
            result
        } else {
            pendingOp = op
            ""
        }
    }
}
