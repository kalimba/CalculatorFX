# CalculatorFX

A simple JavaFX calculator application built with Java 21 and Maven. It provides a desktop calculator with number buttons, arithmetic operators, decimal support, and a clear button.

## Features

- Basic arithmetic operations: addition, subtraction, multiplication, and division
- Decimal input support
- Clear button for resetting the calculator
- JavaFX GUI built with FXML and CSS
- Maven-based project setup

## Project structure

```text
CalculatorFX/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ggast/calculator/
│   │   │       ├── App.java
│   │   │       ├── CalculatorController.java
│   │   │       ├── CalculatorModel.java
│   │   │       └── module-info.java
│   │   ├── resources/
│   │   │   ├── css/
│   │   │   │   └── style.css
│   │   │   └── fxml/
│   │   │       └── calculator.fxml
├── pom.xml
├── LICENSE
├── README.md
└── .gitignore
```

## Requirements

- Java 21+
- Maven
- JavaFX dependencies managed by Maven

## Run the application

1. Open a terminal in the project root.
2. Run:

```bash
mvn clean javafx:run
```

This will build the project and launch the JavaFX calculator.

## Build the project

To compile the project without running it:

```bash
mvn clean package
```

## Notes

This project uses the JavaFX Maven plugin and the OpenJFX dependencies configured in `pom.xml`.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
