package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class Controller {

    @FXML


    public TextField display;

    @FXML

    public Button button1;

    @FXML

    public Button button2;

    @FXML

    public Button button3;

    @FXML

    public Button button4;

    @FXML

    public Button button5;

    @FXML

    public Button button6;

    @FXML

    public Button button7;

    @FXML

    public Button button8;

    @FXML

    public Button button9;

    @FXML

    public Button button0;

    @FXML

    public Button buttonSum;

    @FXML

    public Button buttonEqual;

    @FXML

    public Button buttonMulti;

    @FXML

    public Button buttonDev;

    @FXML

    public Button buttonMinus;

    @FXML

    public Button buttonDot;

    @FXML

    public Button buttonAC;

    @FXML

    public Button buttonRoot;

    @FXML

    public Button buttonCos;

    @FXML

    public Button buttonSin;

    @FXML

    public Button buttonPowerMinusOne;

    @FXML

    public Button buttonTan;

    @FXML

    public Button buttonLn;

    @FXML

    public Button buttonShift;


    float memo = 0;

    int operation = -1;

    @FXML
    public void processNumpad(ActionEvent event) {

        if (event.getSource() == button1) {

            display.setText(display.getText() + "1");

        }

        else if (event.getSource() == button2) {

            display.setText(display.getText() + "2");

        }

        else if (event.getSource() == button3) {

            display.setText(display.getText() + "3");

        }

        else if (event.getSource() == button4) {

            display.setText(display.getText() + "4");

        }

        else if (event.getSource() == button5) {

            display.setText(display.getText() + "5");

        }

        else if (event.getSource() == button6) {

            display.setText(display.getText() + "6");

        }

        else if (event.getSource() == button7) {

            display.setText(display.getText() + "7");

        }

        else if (event.getSource() == button8) {

            display.setText(display.getText() + "8");

        }


        else if (event.getSource() == button9) {

            display.setText(display.getText() + "9");

        }



        else if (event.getSource() == button0) {

            display.setText(display.getText() + "0");

        }

        else if (event.getSource() == buttonDot) {

            display.setText(display.getText() + ".");

        }


        else if (event.getSource() == buttonAC) {

            memo = 0;
            operation = 0;
            display.setText(" ");
            buttonCos.getStyleClass().clear();
            buttonSin.getStyleClass().clear();
            buttonTan.getStyleClass().clear();
            buttonCos.getStyleClass().add("button");
            buttonSin.getStyleClass().add("button");
            buttonTan.getStyleClass().add("button");
            buttonCos.setText("cos");
            buttonSin.setText("sin");
            buttonTan.setText("tan");
        }

        else if (event.getSource() == buttonSum) {

            memo = Float.parseFloat(display.getText());
            operation = 1;
            display.setText(" ");

        }

        else if (event.getSource() == buttonMulti) {

            memo = Float.parseFloat(display.getText());
            operation = 2;
            display.setText(" ");

        }

        else if (event.getSource() == buttonDev) {

            memo = Float.parseFloat(display.getText());
            operation = 3;
            display.setText(" ");
        }

        else if (event.getSource() == buttonMinus) {

            memo = Float.parseFloat(display.getText());
            operation = 4;
            display.setText(" ");
        }

        else if (event.getSource() == buttonRoot) {

            memo = Float.parseFloat(display.getText());
            Double Root = Math.sqrt(memo);

            DecimalFormat format = new DecimalFormat("#.000");
            String formattedText = format.format(Root);
            display.setText(formattedText);

        }

        else if (event.getSource() == buttonCos)  {

            if (operation != 5) {
                  memo = Float.parseFloat(display.getText());
                  Double Cos = Math.cos(Math.toRadians(memo));
                  DecimalFormat format = new DecimalFormat("#0.000");
                  String formattedText = format.format(Cos);
                  display.setText(formattedText);
                  }

            if (operation == 5) {

                memo = Float.parseFloat(display.getText());
                Double ArcCos = Math.acos(memo)*180/Math.PI;
                System.out.println(ArcCos);
                DecimalFormat format1 = new DecimalFormat("#0.000");
                String formattedText1 = format1.format(ArcCos);
                display.setText(formattedText1);
            }

        }


        else if (event.getSource() == buttonSin) {

            if (operation != 5) {
                memo = Float.parseFloat(display.getText());
                Double Sin = Math.cos(Math.toRadians(memo));
                DecimalFormat format = new DecimalFormat("#0.000");
                String formattedText = format.format(Sin);
                display.setText(formattedText);
            }

            if (operation == 5) {

                memo = Float.parseFloat(display.getText());
                Double ArcSin = Math.asin(memo)*180/Math.PI;
                System.out.println(ArcSin);
                DecimalFormat format1 = new DecimalFormat("#0.000");
                String formattedText1 = format1.format(ArcSin);
                display.setText(formattedText1);
            }
            
        }

        else if (event.getSource() == buttonTan) {

            if (operation != 5) {
                memo = Float.parseFloat(display.getText());
                Double Tan = Math.tan(Math.toRadians(memo));
                DecimalFormat format = new DecimalFormat("#0.000");
                String formattedText = format.format(Tan);
                display.setText(formattedText);
            }

            if (operation == 5) {
                memo = Float.parseFloat(display.getText());
                Double ArcTan = Math.atan(memo)*180/Math.PI;
                DecimalFormat format = new DecimalFormat("#0.000");
                String formattedText = format.format(ArcTan);
                display.setText(formattedText);
            }
        }

        else if (event.getSource() == buttonLn) {

            memo = Float.parseFloat(display.getText());
            Double Ln = Math.log(memo);

            DecimalFormat format = new DecimalFormat("#0.000");
            String formattedText = format.format(Ln);
            display.setText(formattedText);
        }

        else if (event.getSource() == buttonShift) {

                operation = 5;
                buttonCos.getStyleClass().add("buttonShift");
                buttonSin.getStyleClass().add("buttonShift");
                buttonTan.getStyleClass().add("buttonShift");
                buttonCos.setText("Cos-1");
                buttonSin.setText("Sin-1");
                buttonTan.setText("Tan-1");
        }


        else if (event.getSource() == buttonPowerMinusOne) {

            memo = Float.parseFloat(display.getText());
            Float Power = 1/memo;

            DecimalFormat format = new DecimalFormat("#0.000");
            String formattedText = format.format(Power);
            display.setText(formattedText);

        }

        else if (event.getSource() == buttonEqual) {

            Float theSecondOpearand = Float.parseFloat(display.getText());

            switch (operation) {

                case 1:
                    Float Sum = memo + theSecondOpearand;
                    display.setText(String.valueOf(Sum));
                    break;
                case 2:
                    Float Multi = memo * theSecondOpearand;
                    display.setText(String.valueOf(Multi));
                    break;
                case 3:
                    Float dev = memo / theSecondOpearand;
                    display.setText(String.valueOf(dev));
                    break;
                case 4:
                    Float Minus = memo - theSecondOpearand;
                    display.setText(String.valueOf(Minus));
                    break;
            }

        }
    }


    }




