
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{
JTextField display = new JTextField();


    double num1, num2, result;
    String operator;




    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();// Gets the text of the button

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.charAt(0) == '.') { //If button is digit or '.'
            display.setText(display.getText() + command); //Add digit

        } else if (command.equals("C")) {
            display.setText(""); //Clear display

        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());

            switch (operator) {

                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result)); // Show result
        } else { // If the button is an operator

            operator = command; // Store the operator in the operator variable
            num1 = Double.parseDouble(display.getText()); // Get text from display and store it as double num1
            display.setText("");
        }
    }



    }

