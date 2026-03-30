import java.awt.*;
import java.awt.event.*;

public class SimpleCalculatorAWT extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button addBtn, subBtn, mulBtn, divBtn;

    SimpleCalculatorAWT() {
        l1 = new Label("Number 1:");
        l2 = new Label("Number 2:");
        l3 = new Label("Result:");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t3.setEditable(false);

        addBtn = new Button("+");
        subBtn = new Button("-");
        mulBtn = new Button("*");
        divBtn = new Button("/");

        setLayout(new GridLayout(5, 2, 5, 5));

        add(l1); add(t1);
        add(l2); add(t2);
        add(addBtn); add(subBtn);
        add(mulBtn); add(divBtn);
        add(l3); add(t3);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);

        setTitle("Simple Calculator");
        setSize(300, 250);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == addBtn) {
                result = num1 + num2;
            } else if (e.getSource() == subBtn) {
                result = num1 - num2;
            } else if (e.getSource() == mulBtn) {
                result = num1 * num2;
            } else if (e.getSource() == divBtn) {
                if (num2 == 0) {
                    t3.setText("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
            }

            t3.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            t3.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculatorAWT();
    }
}