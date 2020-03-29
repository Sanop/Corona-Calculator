package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    public TextField txtNumbers;
    public Label lblCalculation;
    public JFXButton btn1;
    public JFXButton btn2;
    public JFXButton btn3;
    public JFXButton btn4;
    public JFXButton btn5;
    public JFXButton btn6;
    public JFXButton btn7;
    public JFXButton btn8;
    public JFXButton btn9;
    public JFXButton btnAdd;
    public JFXButton btnSub;
    public JFXButton btnMul;
    public JFXButton btn00;
    public JFXButton btn0;
    public JFXButton btnDot;
    public JFXButton btnDiv;
    public JFXButton btnEquel;
    public JFXButton btnC;
    public static double result;
    public static String symbol;
    public Label lblTotal;

    public void initialize(){
        txtNumbers.setAlignment(Pos.CENTER_RIGHT);
        lblCalculation.setAlignment(Pos.CENTER_RIGHT);
        lblTotal.setAlignment(Pos.CENTER_RIGHT);
    }

    public void btn1OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+1);
    }

    public void btn2OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+2);
    }

    public void btn3OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+3);
    }

    public void btn4OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+4);
    }

    public void btn5OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+5);
    }

    public void btn6OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+6);
    }

    public void btn7OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+7);
    }

    public void btn8OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+8);
    }

    public void btn9OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+9);
    }

    public void btnAddOnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        String text1 = lblCalculation.getText();
        if(text.trim().isEmpty()){
            if(text1.trim().isEmpty()){
                txtNumbers.requestFocus();
            }else{
                int length = text1.length();
                String substring = text1.substring(0, length - 1);
                String s = substring + "+";
                lblCalculation.setText(s);
                txtNumbers.requestFocus();
                symbol = "+";
            }
        }else{
            if(text1.trim().isEmpty()){
                String s = text1 + text + "+";
                lblCalculation.setText(s);
                txtNumbers.clear();
                txtNumbers.requestFocus();
                double i = Double.parseDouble(text);
                result = result+i;
                System.out.println(result);
                lblTotal.setText(result+"");
                symbol = "+";
            }else {
                String s = text1 + text + "+";
                lblCalculation.setText(s);
                txtNumbers.clear();
                txtNumbers.requestFocus();
                int i = Integer.parseInt(text);
                switch (symbol) {
                    case "+":
                        result = result + i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                    case "-":
                        result = result - i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                    case "*":
                        result = result * i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                    case "/":
                        result = result / i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                }
                symbol = "+";
            }
        }
    }

    public void btnSubOnAction(ActionEvent event) {
        String numbers = txtNumbers.getText();
        String label = lblCalculation.getText();
        if(numbers.trim().isEmpty()){
            if(label.trim().isEmpty()){
                txtNumbers.requestFocus();
            }else{
                int length = label.length();
                String substring = label.substring(0, length - 1);
                String s = substring + "-";
                lblCalculation.setText(s);
                txtNumbers.requestFocus();
                symbol = "-";
            }
        }else{
            if(label.trim().isEmpty()){
                String s = label + numbers + "-";
                lblCalculation.setText(s);
                txtNumbers.clear();
                txtNumbers.requestFocus();
                double i = Double.parseDouble(numbers);
                result = result-i;
                System.out.println(result);
                lblTotal.setText(result+"");
                symbol = "-";
            }
            String s = label + numbers + "-";
            lblCalculation.setText(s);
            txtNumbers.clear();
            txtNumbers.requestFocus();
            int i = Integer.parseInt(numbers);

            switch (symbol){
                case "+":
                    result = result + i;
                    System.out.println(result);
                    lblTotal.setText(result+"");
                    break;
                case "-":
                    result = result - i;
                    System.out.println(result);
                    lblTotal.setText(result+"");
                    break;
                case "*":
                    result = result * i;
                    System.out.println(result);
                    lblTotal.setText(result+"");
                    break;
                case "/":
                    result = result / i;
                    System.out.println(result);
                    lblTotal.setText(result+"");
                    break;
            }
            symbol = "-";
        }

    }

    public void btnMulOnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        String text1 = lblCalculation.getText();
        if(text.trim().isEmpty()){
            if(text1.trim().isEmpty()){
                txtNumbers.requestFocus();
            }else{
                int length = text1.length();
                String substring = text1.substring(0, length - 1);
                String s = substring + "x";
                lblCalculation.setText(s);
                txtNumbers.requestFocus();
                symbol = "*";
            }
        }else{
            if(text1.trim().isEmpty()){
                String s = text1 + text + "x";
                lblCalculation.setText(s);
                txtNumbers.clear();
                txtNumbers.requestFocus();
                double i = Double.parseDouble(text);
                result = result*i;
                System.out.println(result);
                lblTotal.setText(result+"");
                symbol = "*";
            }else {
                String s = text1 + text + "x";
                lblCalculation.setText(s);
                txtNumbers.clear();
                txtNumbers.requestFocus();
                int i = Integer.parseInt(text);
                switch (symbol) {
                    case "+":
                        result = result + i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                    case "-":
                        result = result - i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                    case "*":
                        result = result * i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                    case "/":
                        result = result / i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                }
                symbol = "*";
            }
        }
    }

    public void btn00OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+"00");
    }

    public void btn0OnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+"0");
    }

    public void btnDotOnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        txtNumbers.setText(text+".");
    }

    public void btnDivOnAction(ActionEvent event) {
        String text = txtNumbers.getText();
        String text1 = lblCalculation.getText();
        if(text.trim().isEmpty()){
            if(text1.trim().isEmpty()){
                txtNumbers.requestFocus();
            }else{
                int length = text1.length();
                String substring = text1.substring(0, length - 1);
                String s = substring + "/";
                lblCalculation.setText(s);
                txtNumbers.requestFocus();
                symbol = "/";
            }
        }else{
            if(text1.trim().isEmpty()){
                String s = text1 + text + "/";
                lblCalculation.setText(s);
                txtNumbers.clear();
                txtNumbers.requestFocus();
                double i = Double.parseDouble(text);
                result = result/i;
                System.out.println(result);
                lblTotal.setText(result+"");
                symbol = "/";
            }else {
                String s = text1 + text + "/";
                lblCalculation.setText(s);
                txtNumbers.clear();
                txtNumbers.requestFocus();
                double i = Double.parseDouble(text);
                switch (symbol) {
                    case "+":
                        result = result + i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                    case "-":
                        result = result - i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                    case "*":
                        result = result * i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                    case "/":
                        result = result / i;
                        System.out.println(result);
                        lblTotal.setText(result+"");
                        break;
                }
                symbol = "/";
            }
        }
    }

    public void btnEquelOnAction(ActionEvent event) {
        if(txtNumbers.getText().trim().isEmpty()){
            txtNumbers.requestFocus();
        }else{
            String text = lblCalculation.getText();
            String substring = text.substring(0, text.length() - 1);
            String s = substring + "=";
            double i = Double.parseDouble(txtNumbers.getText());
            switch (symbol){
                case "+":
                    result = result + i;
                    System.out.println(result);
                    lblTotal.setText(result+"");
                    break;
                case "-":
                    result = result - i;
                    System.out.println(result);
                    lblTotal.setText(result+"");
                    break;
                case "*":
                    result = result * i;
                    System.out.println(result);
                    lblTotal.setText(result+"");
                    break;
                case "/":
                    result = result / i;
                    System.out.println(result);
                    lblTotal.setText(result+"");
                    break;
            }
            lblCalculation.setText(s);
            lblTotal.setText(result+"");
            txtNumbers.clear();
        }

    }

    public void btnNumbersOnAction(ActionEvent event) {
    }

    public void btnCAction(ActionEvent event) {
        String text = txtNumbers.getText();
        if(text.trim().isEmpty()){
            txtNumbers.requestFocus();
            lblTotal.setText("");
            symbol = "";
            result = 0.0;
        }else{
            int length = text.length();
            String substring = text.substring(0, length - 1);
            System.out.println(substring);
            txtNumbers.setText(substring);
        }
    }
}
