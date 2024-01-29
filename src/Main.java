import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //1 create a frame
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        //2 create a panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255,0,0));
        panel.setBackground(Color.BLUE);
        //3 create components
        JLabel label = new JLabel("hello world");
        JButton button = new JButton("Push me");
        JTextField textField = new JTextField(10);
        JColorChooser colorChooser = new JColorChooser(Color.blue);
        // add an image
        ImageIcon icon = new ImageIcon("images/PNG 2/2C.png");

        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);
        //4 add components to panel
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(picLabel);

        //5 add panel to frame
        frame.add(panel);
        //6 make the frame visible
        frame.setVisible(true);

    }
}