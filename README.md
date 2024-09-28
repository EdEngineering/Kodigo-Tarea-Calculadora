# Calculator Project

This is a console-based calculator application implemented in Java. It supports various mathematical operations including addition, subtraction, multiplication, division, square root, and exponentiation.

## Features

- Addition
- Subtraction
- Multiplication
- Division (with error handling for division by zero)
- Square Root (with input validation)
- Exponentiation of two numbers

## Project Structure

```
calculator-project
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   └── calculator
│   │   │   │       ├── Calculator.java
│   │   │   │       ├── CalculatorApp.java
│   │   │   │       └── exceptions
│   │   │   │           └── CalculatorException.java
│   │   └── resources
│   └── test
│       ├── java
│       │   ├── com
│       │   │   └── calculator
│       │   │       └── CalculatorTest.java
│       └── resources
├── .gitignore
├── build.gradle
└── README.md
```

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd calculator-project
   ```
3. Build the project using Gradle:
   ```
   ./gradlew build
   ```

## Usage

To run the calculator application, execute the following command:
```
java -cp build/libs/calculator-project.jar com.calculator.CalculatorApp
```

Follow the prompts to perform calculations.

## Exception Handling

The application includes exception handling for invalid operations, such as:
- Division by zero
- Invalid input formats

## Testing

Unit tests for the Calculator class are located in `src/test/java/com/calculator/CalculatorTest.java`. Use the following command to run the tests:
```
./gradlew test
```

## License

This project is licensed under the MIT License.