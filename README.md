A simple calculator application developed in Kotlin for Android. It supports basic addition, subtraction, multiplication, and division, with a layout based on ConstraintLayout and GridLayout.

📋 Features

Clean and minimalist interface.

Basic operations: +, −, ×, ÷.

Decimal point handling.

Clear (C) button to reset input.

Simple architecture: single Activity.

🛠️ Technologies & Dependencies

Language: Kotlin

Minimum Android SDK: 21 (Lollipop)

ConstraintLayout: For main layout design.

GridLayout (androidx.gridlayout): For button organization.

📥 Prerequisites

Android Studio 4.0 or higher.

JDK 8 or higher.

An Android device or emulator with API level 21+.

⚙️ Installation & Usage

Clone this repository:

git clone https://github.com/your_username/android-calculator.git
cd android-calculator

Open Android Studio and select Open an existing project, then navigate to the project folder.

Wait for Gradle to sync.

Connect a device or launch an emulator.

Click Run (▶️) or press Shift+F10 to build and deploy the app.

🔨 Project Structure

app/
├─ src/main/
│  ├─ java/com/example/calculator/
│  │   └─ MainActivity.kt      # Calculator logic
│  ├─ res/
│  │   ├─ layout/
│  │   │   └─ activity_main.xml # UI layout
│  │   ├─ values/
│  │   │   └─ styles.xml       # Style definitions (CalcButton, Spacer)
│  │   └─ ...                  # Other resources (colors, strings)
│  └─ AndroidManifest.xml      # Activity declaration
└─ build.gradle

🚀 How to Use

Enter numbers and operators by tapping the buttons.

Press = to calculate the result.

Tap C to clear the current input.
