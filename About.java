import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {
    About(){
        setBounds(400, 100, 600, 500);
        setLayout(null);
        ImageIcon i1 = new ImageIcon((ClassLoader.getSystemResource("icons/windows.png")));
        Image i2= i1.getImage().getScaledInstance(300,60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel((i3));
        headerIcon.setBounds(70,40,400,80);
        add(headerIcon);
        ImageIcon i4 = new ImageIcon((ClassLoader.getSystemResource("icons/notepad.png")));
        Image i5= i4.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel Icon = new JLabel((i6));
        Icon.setBounds(50,180,50,50);
        add(Icon);
        JLabel text= new JLabel("<html> This is my first ever Java Project.<br> This helps me learning the different form of use of the java language.<br>All the Rights and soul Owner of this project is only ABHAY KUMAR GUPTA.<br>This Project is made under the help of the CODE FOR INTERVIEW(an youtube channel)<html>");
        text.setBounds(150,100,500,200);
        text.setFont(new Font("SAN_SERIF",Font.ITALIC,12));
        add(text);
        JButton b1 = new JButton("OK");
        b1.setBounds(150,350,120,25);
        b1.addActionListener(this);
        add(b1);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent as){
        this.setVisible(false);
    }
    public static void main(String[] args){
        new About();
    }
}
