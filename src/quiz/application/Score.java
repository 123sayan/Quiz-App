
package quiz.application;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    JButton again;
    Score(String name,int score)
    {
        setLayout(null);
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        //heading
        JLabel heading=new JLabel("Thank You "+ name +" for playing the quiz");
        heading.setBounds(50,30,700,80);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(new Color(0,0,225,225));
        add(heading);
        
        //score
        JLabel userscore=new JLabel("Your score is " + score+" /100");
        userscore.setBounds(400,200,700,80);
        userscore.setFont(new Font("Arial",Font.BOLD,30));
        userscore.setForeground(new Color(0,0,225,225));
        add(userscore);
        
        //button
        again=new JButton ("Play again");
        again.setBounds(450, 400, 150, 30);
        again.setBackground(new Color(0,225,225));
        again.setFont(new Font("Tahoma",Font.PLAIN,20));
        again.setForeground(Color.white);
        again.addActionListener(this);
        add(again);
        //frame discription
        setTitle("Quiz App");
        setBounds(200,100,750,550);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==again)
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args)
    {
        new Score("User",0);
    }
    
}
