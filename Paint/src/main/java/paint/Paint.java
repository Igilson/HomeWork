package paint;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paint extends JFrame implements MouseMotionListener, ActionListener {
    private int x = 0;
    private int y = 0;
    Container container;


    public Paint() {

        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);


        container = getContentPane();
        container.addMouseMotionListener(this);
        container.setLayout(new BorderLayout());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int res = JOptionPane.showConfirmDialog(Paint.this,
                "Are you sure you want to close the application?",
                "", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(x + 8, y + 30, 7, 7);
    }


    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        x = mouseEvent.getX();
        y = mouseEvent.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

}




