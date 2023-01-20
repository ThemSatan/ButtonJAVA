import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class HelloDemo extends JFrame{
    private JTextField txtPain;
    private JButton btnClick;
    private JPanel panelMain;


    public HelloDemo() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick,"'"+txtPain.getText()+"' luul cringgggg");
            }
        });
    }

    public static void main(String[] args) {
    HelloDemo h = new HelloDemo();
    h.setContentPane(h.panelMain);
    h.setTitle("Astumassa Floppien Aikakauteen");
    h.setSize(300,200);
    h.setVisible(true);
    h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
