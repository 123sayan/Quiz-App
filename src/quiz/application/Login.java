
package quiz.application;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener {
    JButton jb,jc;
    JTextField jfield;
    JFrame j=new JFrame("Quiz App");
    Login()
    {
        j.setLayout(null);        
        //image imput
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel l=new JLabel(i);
        l.setBounds(-10, -10,601,500);
        j.add(l);
         
         //heading
        JLabel heading=new JLabel("");
        heading.setBounds(780, 50, 300, 50);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(32,172,170));
        j.add(heading);
        
        //name section
        JLabel name=new JLabel("Enter your name ");
        name.setBounds(800,100 , 300, 100);
        name.setFont(new Font("French Script MT",Font.BOLD,40));
        name.setForeground(Color.BLUE);
        j.add(name);
        
        //text field
         jfield =new JTextField();
        jfield.setBounds(735, 200, 300, 25);
        jfield.setFont(new Font("Times New Roman",Font.ITALIC,20));
        j.add(jfield);
        
        //play button
         jb=new JButton("Rules");
        jb.setBounds(735, 250, 100,30 );
        jb.setFont(new Font("Arial",Font.BOLD,18));
        jb.setForeground(new Color(0,225,225));
        jb.addActionListener(this);
        j.add(jb);
        
        //clear button
        jc=new JButton("Exit");
        jc.setBounds(935, 250, 100, 30);
        jc.setFont(new Font("Arial",Font.BOLD,18));
        jc.setForeground(new Color(0,225,225));
        jc.addActionListener(this);
        j.add(jc);
        
        
        //frame details
        j.setSize(1200, 500);
        j.setLocation(100, 150);
        j.getContentPane().setBackground(Color.white);
        
        j.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb)
        {
            String name=jfield.getText();
            j.setVisible(false);
            if(name=="")
            { 
                new Rules("User");
            }
            else
            {
                new Rules(name);
            }
        }
        else if(e.getSource()==jc)
        {
            j.setVisible(false);
        }
        
    }
    public static void main(String[] args)
    {
        new Login();
    }
}
