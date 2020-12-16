import javax.swing.*;

public class JavaCalculator {


    public static void main(String[] args) {
        JFrame f = new JFrame();
        final JLabel label = new JLabel();
        label.setBounds(80, 225, 200, 50);
        JLabel l1 = new JLabel("Число 1:");
        l1.setBounds(20, 20, 80, 30);
        JLabel l2 = new JLabel("Число 2:");
        l2.setBounds(20, 75, 80, 30);
        JLabel l3 = new JLabel("Операция:");
        l3.setBounds(20, 125, 80, 30);
        JLabel l4 = new JLabel("Результат:");
        l4.setBounds(20, 225, 80, 30);
        JButton b1 = new JButton("Посчитать");
        b1.setBounds(50, 175, 225, 30);
        JTextField tf1 = new JTextField();
        tf1.setBounds(100, 20, 175, 30);
        JTextField tf2 = new JTextField();
        tf2.setBounds(100, 75, 175, 30);
        JTextField tf3 = new JTextField();
        tf3.setBounds(100, 125, 175, 30);
        JTextField tf4 = new JTextField();
        tf4.setBounds(100, 225, 175, 30);
        f.add(l1);
        f.add(label);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(b1);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.setSize(350, 350);
        f.setLayout(null);
        f.setVisible(true);
        b1.addActionListener(e -> {
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            String s3 = tf3.getText();

            int a = Integer.parseInt(s1);
            double b = Integer.parseInt(s2);
            double d = 0;
            if (e.getSource() == b1 && s3.equals("+")) {
                d = a + b;
            } else if (e.getSource() == b1 && s3.equals("-")) {
                d = a - b;
            } else if (e.getSource() == b1 && s3.equals("*")) {
                d = a * b;
            } else if (e.getSource() == b1 && s3.equals("/")) {
                d = a / b;
            }


            String result = String.valueOf(d);
            tf4.setText(result);

        });
    }
}
