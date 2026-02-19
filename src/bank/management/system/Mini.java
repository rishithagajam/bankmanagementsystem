package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Vector;

public class Mini extends JFrame implements ActionListener {

    String pin;
    JButton button;

    Mini(String pin) {
        this.pin = pin;

        getContentPane().setBackground(new Color(236, 161, 239));
        setSize(600, 600);
        setLocation(20, 20);
        setLayout(null);

        // Title
        JLabel label2 = new JLabel("Student Bank");
        label2.setFont(new Font("System", Font.BOLD, 15));
        label2.setBounds(150, 20, 200, 20);
        add(label2);

        // Card Number
        JLabel label3 = new JLabel();
        label3.setBounds(20, 60, 350, 20);
        add(label3);

        try {
            DBconnection c = new DBconnection();
            ResultSet resultSet = c.statement.executeQuery(
                    "select * from login where pin = '" + pin + "'");
            while (resultSet.next()) {
                label3.setText("Card Number : " +
                        resultSet.getString("card_number").substring(0, 4) +
                        "XXXXXXXX" +
                        resultSet.getString("card_number").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ---- TABLE for transactions ----
        String[] columns = {"Date", "Type", "Amount"};
        Vector<Vector<String>> data = new Vector<>();

        int balance = 0;

        try {
            DBconnection c = new DBconnection();
            ResultSet resultSet = c.statement.executeQuery(
                    "select * from bank where pin = '" + pin + "'");

            while (resultSet.next()) {
                Vector<String> row = new Vector<>();
                row.add(resultSet.getString("date"));
                row.add(resultSet.getString("type"));
                row.add(resultSet.getString("amount"));
                data.add(row);

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



        JPanel txPanel = new JPanel();
        txPanel.setLayout(new BoxLayout(txPanel, BoxLayout.Y_AXIS));
        txPanel.setBackground(new Color(236, 161, 239));
        txPanel.setBounds(20, 90, 560, 280);

        try {
            DBconnection c = new DBconnection();
            ResultSet resultSet = c.statement.executeQuery(
                    "select * from bank where pin = '" + pin + "'");

            while (resultSet.next()) {
                String date   = resultSet.getString("date");
                String type   = resultSet.getString("type");
                String amount = resultSet.getString("amount");

                JLabel txLabel = new JLabel(
                        String.format("%-32s %-12s %-10s", date, type, amount)
                );
                txLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
                txPanel.add(txLabel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        add(txPanel);


        // Balance label
        JLabel label4 = new JLabel("Your Total Balance is Rs " + balance);
        label4.setFont(new Font("Arial", Font.BOLD, 13));
        label4.setBounds(20, 390, 300, 20);
        add(label4);

        // Exit button
        button = new JButton("Exit");
        button.setBounds(20, 500, 100, 25);
        button.addActionListener(this);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new Mini("");
    }
}