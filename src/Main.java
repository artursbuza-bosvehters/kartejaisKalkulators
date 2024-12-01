import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        JFrame frame = new JFrame("CalculatorApp");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        frame.add(buttonPanel, BorderLayout.SOUTH);

        calc.display.setEditable(false);
        calc.display.setFont(new Font("calcFont", Font.BOLD, 70));
        calc.display.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(calc.display);





        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                ".", "0", "=", "+",
                "C"
        };

        for (String text : buttons){
            JButton button = new JButton(text);
            buttonPanel.add(button);
            button.addActionListener(calc);

        }




    }
}
