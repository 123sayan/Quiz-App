package quiz.application;
import javax.swing.*;
import java.awt.*;

public class All extends JFrame{
    All()
    {
        setLayout(null);
        
        TextField t=new TextField();
        t.setBounds(20, 20, 200, 100);
        t.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(t);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i);
        image.setBounds(50,20,400,300);
        add(image);
        
        
        setSize(1000, 500);
        setLocation(200,50);
        getContentPane().setBackground(new Color(0,225,225));
       setVisible(true); 
    }
    
    public static void main(String args[])
    {
        new All();
    }
    
}
