
package quiz.application;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules implements ActionListener{
    JFrame j=new JFrame();
    String name;
    JButton jb,jc;
    Rules(String name)
    {
        this.name=name;
        j.setLayout(null);
        //frame structure
        j.setSize(880, 700);
        j.setLocation(300, 10);
        j.getContentPane().setBackground(Color.WHITE);
        
        //heading
        JLabel heading=new JLabel("Welcome "+ name +" to simple mind");
        heading.setBounds(50,10,700,80);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(new Color(0,0,225,225));
        j.add(heading);
        
        //Rules
        JLabel rules=new JLabel();
        rules.setBounds(20,90,600,490);
        rules.setFont(new Font("Times New Roman ",Font.PLAIN,20));
        rules.setText(
                 "<html>"+ 
                "1.Participation: Only allow single participation." + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        j.add(rules);
        
        //Play
        jb=new JButton("Play");
        jb.setBounds(250, 580, 100,30 );
        jb.setFont(new Font("Arial",Font.BOLD,18));
        jb.setForeground(new Color(0,225,225));
        jb.addActionListener(this);
        j.add(jb);
        
        //back
        jc=new JButton("Back");
        jc.setBounds(400, 580, 100, 30);
        jc.setFont(new Font("Arial",Font.BOLD,18));
        jc.setForeground(new Color(0,225,225));
        jc.addActionListener(this);
        j.add(jc);
        
        j.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb)
        {
            new Questions(name);
            j.setVisible(false);
        }
        else if(e.getSource()==jc)
        {
            new Login();
            j.setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new Rules("User");
    }
}
