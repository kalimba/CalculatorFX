package com.ggast.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField display;

    private final CalculatorModel model = new CalculatorModel();

    private double firstNumber;

    private String operator;

    private boolean startNewNumber = true;

    @FXML
    private void handleNumber(ActionEvent event) {

        Button button = (Button) event.getSource();

        if (startNewNumber) {

            display.clear();

            startNewNumber = false;

        }

        if (display.getText().equals("0")) {

            display.setText(button.getText());

        } else {

            display.appendText(button.getText());

        }

    }

    @FXML
    private void handleDecimal() {

        if (!display.getText().contains(".")) {

            display.appendText(".");

        }

    }

    @FXML
    private void handleOperator(ActionEvent event) {

        Button button = (Button) event.getSource();

        firstNumber = Double.parseDouble(display.getText());

        operator = button.getText();

        startNewNumber = true;

    }

    @FXML
    private void handleEquals() {

        double secondNumber = Double.parseDouble(display.getText());

        double result = 0;

        try {

            switch (operator) {

                case "+":
                    result = model.add(firstNumber, secondNumber);
                    break;

                case "-":
                    result = model.subtract(firstNumber, secondNumber);
                    break;

                case "×":
                    result = model.multiply(firstNumber, secondNumber);
                    break;

                case "÷":
                    result = model.divide(firstNumber, secondNumber);
                    break;

            }

            if (result == (long) result) {

                display.setText(String.valueOf((long) result));

            } else {

                display.setText(String.valueOf(result));

            }

        } catch (ArithmeticException e) {

            display.setText(e.getMessage());

        }

        startNewNumber = true;

    }

    @FXML
    private void handleClear() {

        display.setText("0");

        firstNumber = 0;

        operator = "";

        startNewNumber = true;

    }

}