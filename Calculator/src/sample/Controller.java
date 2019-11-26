package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Statement;

public class Controller {

    double a,b,result;
    int opMod;
    int counter = 2;
    static StringBuilder sb = new StringBuilder();
    // Buttons for numbers
    @FXML
    Button btnOne = new Button();
    @FXML
    Button btnTwo = new Button();
    @FXML
    Button btnThree = new Button();
    @FXML
    Button btnFour = new Button();
    @FXML
    Button btnFive = new Button();
    @FXML
    Button btnSix = new Button();
    @FXML
    Button btnSeven = new Button();
    @FXML
    Button btnEight = new Button();
    @FXML
    Button btnNine = new Button();
    @FXML
    Button btnZero = new Button();
    // Buttons for functions
    @FXML
    Button btnClear = new Button();
    @FXML
    Button btnSign = new Button();
    @FXML
    Button btnPercentage = new Button();
    @FXML
    Button btnDivide = new Button();
    @FXML
    Button btnMultiply = new Button();
    @FXML
    Button btnMinus = new Button();
    @FXML
    Button btnAdd = new Button();
    @FXML
    Button btnEquals = new Button();
    @FXML
    Button btnFloat = new Button();

    // Text Screen
    @FXML
    TextField txtNumber = new TextField();

    public void pressBtnOne(ActionEvent event)
    {
        txtNumber.setText(txtNumber.getText()+ "1");
    }
    public void pressBtnTwo(ActionEvent event)
    {
        txtNumber.setText(txtNumber.getText()+ "2");
    }
    public void pressBtnThree(ActionEvent event)
    {
        txtNumber.setText(txtNumber.getText()+ "3");
    }
    public void pressBtnFour(ActionEvent event)
    {
        txtNumber.setText(txtNumber.getText()+ "4");
    }
    public void pressBtnFive(ActionEvent event)
    {
        txtNumber.setText(txtNumber.getText()+ "5");
    }
    public void pressBtnSix(ActionEvent event) { txtNumber.setText(txtNumber.getText()+ "6"); }
    public void pressBtnSeven(ActionEvent event)
    {
        txtNumber.setText(txtNumber.getText()+ "7");
    }
    public void pressBtnEight(ActionEvent event)
    {
        txtNumber.setText(txtNumber.getText()+ "8");
    }
    public void pressBtnNine(ActionEvent event)
    {
        txtNumber.setText(txtNumber.getText()+ "9");
    }
    public void pressBtnZero(ActionEvent event)
    {
        txtNumber.setText(txtNumber.getText()+ "0");
    }
    public void pressBtnClear(ActionEvent event)
    {
        txtNumber.clear();
        btnFloat.setDisable(false);
    }

    public void pressBtnAdd(ActionEvent event)
    {
        a = Double.valueOf(txtNumber.getText());
        txtNumber.clear();
        opMod = 1;
        btnFloat.setDisable(false);
    }
    public void pressBtnMinus(ActionEvent event)
    {
        a = Double.valueOf(txtNumber.getText());
        txtNumber.clear();
        opMod = 2;
        btnFloat.setDisable(false);
    }
    public void pressBtnMultiply(ActionEvent event)
    {
        a = Double.valueOf(txtNumber.getText());
        txtNumber.clear();
        opMod = 3;
        btnFloat.setDisable(false);
    }
    public void pressBtnDivide(ActionEvent event)
    {
        a = Double.valueOf(txtNumber.getText());
        txtNumber.clear();
        opMod = 4;
        btnFloat.setDisable(false);
    }
    public void pressBtnPercentage(ActionEvent event)
    {
        a = Integer.valueOf(txtNumber.getText());
        txtNumber.clear();
        opMod = 5;
        btnFloat.setDisable(false);
    }
    public void pressBtnSign(ActionEvent event)
    {
        int a=-1;
        int savedValue = Integer.parseInt(txtNumber.getText());
        int r=savedValue*a;

        String str= String.valueOf(r);
        txtNumber.setText(str);
    }
    public void pressBtnFloat(ActionEvent event)
    {
        txtNumber.setText(txtNumber.getText() + ".");
        btnFloat.setDisable(true);
    }
    public void pressBtnEquals(ActionEvent event)
    {
        b = Double.valueOf(txtNumber.getText());
        if(opMod == 1)
        {
            result = a + b;
        }
        if(opMod == 2)
        {
            result = a - b;
        }
        if(opMod == 3)
        {
            result = a * b;
        }
        if(opMod == 4)
        {
            result = a / b;
        }
        if(opMod == 5)
        {
            result = (a * b)/100;
        }

        String strResult = String.valueOf(result);
        txtNumber.setText(strResult);
        btnFloat.setDisable(false);
    }



}
