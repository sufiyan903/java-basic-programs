import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculatorfinal implements ActionListener {
    boolean isOperatorClicked = false;
    String oldValue;
    char operator;

    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton, oneButton, twoButton, threeButton,
            dotButton, zeroButton, equalButton, divButton, mulButton, minusButton, plusButton, clearButton;

    public Calculatorfinal() {
        jf = new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(400, 150);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        jf.add(displayLabel);

        sevenButton = createButton("7", 30, 130);
        eightButton = createButton("8", 130, 130);
        nineButton = createButton("9", 230, 130);
        fourButton = createButton("4", 30, 230);
        fiveButton = createButton("5", 130, 230);
        sixButton = createButton("6", 230, 230);
        oneButton = createButton("1", 30, 330);
        twoButton = createButton("2", 130, 330);
        threeButton = createButton("3", 230, 330);
        dotButton = createButton(".", 30, 430);
        zeroButton = createButton("0", 130, 430);
        equalButton = createButton("=", 230, 430);
        divButton = createButton("/", 330, 130);
        mulButton = createButton("x", 330, 230);
        minusButton = createButton("-", 330, 330);
        plusButton = createButton("+", 330, 430);
        clearButton = createButton("CLR", 430, 430, 120, 80);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JButton createButton(String label, int x, int y) {
        JButton button = new JButton(label);
        button.setBounds(x, y, 80, 80);
        button.addActionListener(this);
        button.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(button);
        return button;
    }

    private JButton createButton(String label, int x, int y, int width, int height) {
        JButton button = new JButton(label);
        button.setBounds(x, y, width, height);
        button.addActionListener(this);
        button.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(button);
        return button;
    }

    public static void main(String[] args) {
        new Calculatorfinal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton || e.getSource() == eightButton || e.getSource() == nineButton
                || e.getSource() == fourButton || e.getSource() == fiveButton || e.getSource() == sixButton
                || e.getSource() == oneButton || e.getSource() == twoButton || e.getSource() == threeButton
                || e.getSource() == dotButton || e.getSource() == zeroButton) {
            handleDigitButtonClick(e);
        } else if (e.getSource() == equalButton) {
            handleEqualButtonClick();
        } else if (e.getSource() == divButton || e.getSource() == mulButton || e.getSource() == minusButton
                || e.getSource() == plusButton) {
            handleOperatorButtonClick(e);
        } else if (e.getSource() == clearButton) {
            handleClearButtonClick();
        }
    }

    private void handleDigitButtonClick(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (isOperatorClicked) {
            displayLabel.setText(clickedButton.getText());
            isOperatorClicked = false;
        } else {
            displayLabel.setText(displayLabel.getText() + clickedButton.getText());
        }
    }

    private void handleEqualButtonClick() {
        String newValue = displayLabel.getText();
        float oldValueF = Float.parseFloat(oldValue);
        float newValueF = Float.parseFloat(newValue);
        float result = 0;

        switch (operator) {
            case '+':
                result = oldValueF + newValueF;
                break;
            case '-':
                result = oldValueF - newValueF;
                break;
            case 'x':
                result = oldValueF * newValueF;
                break;
            case '/':
                if (newValueF != 0) {
                    result = oldValueF / newValueF;
                } else {
                    displayLabel.setText("Error");
                    return; // exit the method, as dividing by zero is undefined
                }
                break;
        }

        displayLabel.setText(result + "");
    }

    private void handleOperatorButtonClick(ActionEvent e) {
        isOperatorClicked = true;
        oldValue = displayLabel.getText();
        operator = e.getActionCommand().charAt(0);
    }

    private void handleClearButtonClick() {
        displayLabel.setText("");
        isOperatorClicked = false;
    }
}
