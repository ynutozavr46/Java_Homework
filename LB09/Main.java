package LB09;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Main() {
        setBounds(100, 100, 350, 220);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label1 = new JLabel("Введіть густину:");
        label1.setBounds(40, 30, 100, 20);

        textField1 = new JTextField();
        textField1.setBounds(150, 30, 150, 20);

        JLabel label2 = new JLabel("Введіть об'єм:");
        label2.setBounds(40, 60, 100, 20);

        textField2 = new JTextField();
        textField2.setBounds(150, 60, 150, 20);

        JLabel label3 = new JLabel("Результат:");
        label3.setBounds(40, 90, 100, 20);

        textField3 = new JTextField();
        textField3.setBounds(150, 90, 150, 20);
        textField3.setEditable(false);

        JButton btnCalculate = new JButton("Обчислити");
        btnCalculate.setBounds(150, 120, 150, 30);
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double p = Double.parseDouble(textField1.getText());
                double v = Double.parseDouble(textField2.getText());
                double f = p * v * 9.8;
                textField3.setText(Double.toString(f) + " H");
            }
        });

        contentPane.add(label1);
        contentPane.add(textField1);
        contentPane.add(label2);
        contentPane.add(textField2);
        contentPane.add(label3);
        contentPane.add(textField3);
        contentPane.add(btnCalculate);
    }
}
