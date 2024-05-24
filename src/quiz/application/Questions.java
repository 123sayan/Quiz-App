
package quiz.application;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Questions extends JFrame implements ActionListener {
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    String userans[][]=new String [10][1];
    String name;
   // JFrame j=new JFrame();
    JButton next,lifeline ,submit;
    JLabel no,qn;
    JRadioButton  op1,op2,op3,op4;
    ButtonGroup group;
    
    public static int timer=20;
    public static int ans_flag=0;
    public static int count=0;
    public static int score=0;
    
    Questions(String name)
    {
        this.name=name;
        setLayout(null);
        //insert image
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image=new JLabel(i);
        image.setBounds(0, 0, 1200, 300);
        add(image);
        //numbering 
        no=new JLabel();
        no.setBounds(50, 250, 400, 200);
        no.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(no);
        //questions
        qn=new JLabel();
        qn.setBounds(100, 250, 700, 200);
        qn.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(qn);
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        //answers
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        op1=new JRadioButton();
        op1.setBounds(180, 420, 600, 30);
        op1.setBackground(Color.WHITE);
        op1.setFont(new Font("Dailog",Font.PLAIN,18));
        add(op1);
        
        op2=new JRadioButton();
        op2.setBounds(180, 450, 600, 30);
        op2.setBackground(Color.WHITE);
        op2.setFont(new Font("Dailog",Font.PLAIN,18));
        add(op2);
        
        op3=new JRadioButton();
        op3.setBounds(180, 480, 600, 30);
        op3.setBackground(Color.WHITE);
        op3.setFont(new Font("Dailog",Font.PLAIN,18));
        add(op3);
       
        op4=new JRadioButton();
        op4.setBounds(180, 510, 600, 30);
        op4.setBackground(Color.WHITE);
        op4.setFont(new Font("Dailog",Font.PLAIN,18));
        add(op4);
        
        //grouping the button so that only one option is selected
        group=new ButtonGroup();
        group.add(op1);
        group.add(op2);
        group.add(op3);
        group.add(op4);
        
        //next button
        next=new JButton("Next");
        next.setBounds(950, 430, 200, 25);
        next.setFont(new Font("Tahoma",Font.PLAIN,20));
        next.setBackground(new Color(0,225,225));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        //lifeline button
        lifeline=new JButton("50-50 LifeLine");
        lifeline.setBounds(950, 480,200, 25);
        lifeline.setFont(new Font("Tahoma",Font.PLAIN,20));
        lifeline.setBackground(new Color(0,225,225));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        //submit button
        submit=new JButton("Submit");
        submit.setBounds(950, 530, 200, 25);
        submit.setFont(new Font("Tahoma",Font.PLAIN,20));
        submit.setBackground(new Color(0,225,225));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        //Frame design
        setSize(1200, 700);
        setLocation(100, 10);
        getContentPane().setBackground(Color.WHITE);
        
        start(count);
        
       setVisible(true);
           
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        String time="Time left -"+ timer+" seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.ITALIC,20));
        if(timer>0)
        {
            g.drawString(time, 940, 400);
        }
        else
        {
            g.drawString("Times up !!", 940, 400);
        }
        timer --;
        
        try
        {
            Thread.sleep(1080);
            repaint();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        if(ans_flag==1)
        {
            ans_flag=0;
            timer =20;
        }
        else if(timer<0)
        {
            timer =20;
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);
            if(count==8)
            {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9)   //submit button  submit automatically even if submit button is not clicked
            {
                 if(group.getSelection()==null)
                {
                    userans[count][0]="";
                }
                else 
                {
                    userans[count][0]=group.getSelection().getActionCommand();
                }
                 for(int i=0;i<userans.length;i++)
                 {
                     if(userans[i][0].equals(answers[i][1]))
                     {
                         score =score+10;
                     }
                     else
                     {
                         score+=0;
                     }
                     setVisible(false);
                         
                 }
                 new Score(name,score);
            }
            else//next button 
            {
                if(group.getSelection()==null)
                {
                    userans[count][0]="";
                }
                else 
                {
                    userans[count][0]=group.getSelection().getActionCommand();
                }
                count ++;
                start(count);
            }
        }
    }
    public void start(int count)
    {
        no.setText(""+ (count+1)+" .");
        qn.setText(questions[count][0]);
        op1.setText(questions[count][1]);
        op1.setActionCommand(questions[count][1]);
        op2.setText(questions[count][2]);
        op2.setActionCommand(questions[count][2]);
        op3.setText(questions[count][3]);
        op3.setActionCommand(questions[count][3]);
        op4.setText(questions[count][4]);
        op4.setActionCommand(questions[count][4]);
        group.clearSelection();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==next)
        {
            repaint();
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);
            ans_flag=1;
            if(group.getSelection()==null)
            {
                userans[count][0]="";
            }
            else 
            {
                userans[count][0]=group.getSelection().getActionCommand();
            }
            
            if(count==8)
            {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }
        else if(e.getSource()==lifeline)
        {
            if(count==2 || count==4 ||count==6 || count==8 ||count==9)
            {
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            else
            {
                op1.setEnabled(false);
                op4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
        else if(e.getSource()==submit)
        {
            ans_flag=1;
            if(group.getSelection()==null)
            {
                userans[count][0]="";
            }
            else 
            {
                userans[count][0]=group.getSelection().getActionCommand();
            }
            for(int i=0;i<userans.length;i++)
            {
                if(userans[i][0].equals(answers[i][1]))
                {
                    score =score+10;
                }
                else
                {
                    score+=0;
                }
                setVisible(false);    
            }
            //score frame
            new Score(name,score);
        }
    }
    public static void main(String[] args)
    {
        new Questions("User");
    }
}
