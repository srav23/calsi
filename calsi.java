import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calsi extends Applet implements ActionListener
{
    Button b1[]=new Button[10];
    Button b2[]=new Button[6];
    TextField result;
    String op[]={"+","-","*","/","=","C"};
    String str1="";
    int val1=0,val2=0;
    String operation;
    @Override
    public void init()
    {
        super.init();
        GridLayout g=new GridLayout(5,4);
        setLayout(g);
        int k=0;
        for(int i=0;i<10;i++)
        {
            b1[i]=new Button();
            add(b1[i]);
            b1[i].setLabel(""+k++);
            b1[i].addActionListener(this);
        }
        for(int i=0;i<6;i++)
        {
            b2[i]=new Button();
            add(b2[i]);
            b2[i].setLabel(op[i]);
            b2[i].addActionListener(this);
        }
        result=new TextField();
        add(result);
        result.setText("0");

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String str=e.getActionCommand();
        if(str.equals("+"))
        {
            String s=result.getText();
            val1=Integer.parseInt(s);
            result.setText("0");
            str1="";
            operation=str;
        }
        else if(str.equals("-"))
        {
            String s=result.getText();
            val1=Integer.parseInt(s);
            result.setText("0");
            str1="";
            operation=str;
        }
        else if(str.equals("*"))
        {
            String s=result.getText();
            val1=Integer.parseInt(s);
            result.setText("0");
            str1="";
            operation=str;
        }
        else if(str.equals("/"))
        {
            String s=result.getText();
            val1=Integer.parseInt(s);
            result.setText("0");
            str1="";
            operation=str;
        }
        else if(str.equals("="))
        {
            String s=result.getText();
            val2=Integer.parseInt(s);
            if(operation.equals("+"))
            {
                int res=val1+val2;
                result.setText(""+res);
            }
            if(operation.equals("-"))
            {
                int res=val1-val2;
                result.setText(""+res);
            }
            if(operation.equals("*"))
            {
                int res=val1*val2;
                result.setText(""+res);
            }
            if(operation.equals("/"))
            {
                int res=val1/val2;
                result.setText(""+res);
            }
        }
        else if(str.equals("C"))
        {
           result.setText("0");
           str1="";
        }
        else
        {
            result.setText(str1.concat(str));
            str1=result.getText();

        }


    }
}