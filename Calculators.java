import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculators implements ActionListener {
    boolean isOperatorClicked = false;
    JFrame jf;
    String oldValue;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton minusButton;
    JButton addButton;
    JButton clearButton;

    public Calculators() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);
        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.addActionListener(this);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(threeButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.addActionListener(this);
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(divButton);

        mulButton = new JButton("x");
        mulButton.setBounds(330, 230, 80, 80);
        mulButton.addActionListener(this);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(mulButton);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        minusButton.addActionListener(this);
        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(minusButton);

        addButton = new JButton("+");
        addButton.setBounds(330, 430, 80, 80);
        addButton.addActionListener(this);
        addButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(addButton);

        clearButton = new JButton("CLR");
        clearButton.setBounds(430, 430, 120, 80);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(clearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton || e.getSource() == eightButton || e.getSource() == nineButton
                || e.getSource() == fourButton || e.getSource() == fiveButton || e.getSource() == sixButton
                || e.getSource() == oneButton || e.getSource() == twoButton || e.getSource() == threeButton
                || e.getSource() == zeroButton || e.getSource() == dotButton) {
            handleNumberButtonClick(e);
        } else if (e.getSource() == equalButton) {
            handleEqualButtonClick();
        } else if (e.getSource() == addButton || e.getSource() == minusButton || e.getSource() == mulButton
                || e.getSource() == divButton) {
            handleOperatorButtonClick(e);
        } else if (e.getSource() == clearButton) {
            handleClearButtonClick();
        }
    }

    private void handleNumberButtonClick(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (isOperatorClicked) {
            displayLabel.setText(clickedButton.getText());
            isOperatorClicked = false;
        } else {
            displayLabel.setText(displayLabel.getText() + clickedButton.getText());
        }
    }

    private void handleEqualButtonClick() {
        String expression = displayLabel.getText();
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        try {
            Object result = engine.eval(expression);
