import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame implements ActionListener {


    JTextField  t;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,div,mul,equal,clear;
    double num1,num2,result;
    char op;
    Main(){
       setBounds(600,100,100,100);
        t=new JTextField();

        JPanel p=new JPanel();


        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");

        add=new JButton("+");
        sub=new JButton("-");
        div=new JButton("/");
        mul=new JButton("*");
        equal=new JButton("=");
        clear=new JButton("C");

        setLayout(new BorderLayout());

        p.setLayout(new GridLayout(4,4));

        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(add);

        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(sub);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(div);

        p.add(clear);
        p.add(b0);
        p.add(equal);
        p.add(mul);




        Font f = new Font("Arial", Font.BOLD, 20);

        b0.setFont(f);
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        b7.setFont(f);
        b8.setFont(f);
        b9.setFont(f);
        clear.setFont(f);
        equal.setFont(f);
        add.setFont(f);
        mul.setFont(f);
        div.setFont(f);
        sub.setFont(f);

        t.setFont(f);

        add(t,BorderLayout.NORTH);
        add(p,BorderLayout.CENTER);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        add.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);

        equal.addActionListener(this);
        clear.addActionListener(this);

        setTitle("Calculator");
        setSize(350,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b0){
            System.out.println("0");
            t.setText(t.getText()+"0");
        }else if(e.getSource()==b1){
            System.out.println("1");
            t.setText(t.getText()+"1");
        }else if(e.getSource()==b2){
            System.out.println("2");
            t.setText(t.getText()+"2");
        }
        else if(e.getSource()==b3){
            System.out.println("3");
            t.setText(t.getText()+"3");
        }
        else if(e.getSource()==b4){
            System.out.println("4");
            t.setText(t.getText()+"4");
        }else if(e.getSource()==b5){
            System.out.println("5");
            t.setText(t.getText()+"5");
        }else if(e.getSource()==b6){
            System.out.println("6");
            t.setText(t.getText()+"6");
        }else if(e.getSource()==b7){
            System.out.println("7");
            t.setText(t.getText()+"7");
        }else if(e.getSource()==b8){
            System.out.println("8");
            t.setText(t.getText()+"8");
        }
        else if(e.getSource()==b9){
            System.out.println("9");
            t.setText(t.getText()+"9");}
        else if(e.getSource()==add){
            System.out.println("+");
            num1=Double.parseDouble(t.getText());
            op='+';
            t.setText("");

        } else if(e.getSource()==sub){
            System.out.println("-");

            num1=Double.parseDouble(t.getText());
            op='-';
            t.setText("");

        }else if(e.getSource()==div){
            System.out.println("/");

            num1=Double.parseDouble(t.getText());
            op='/';
            t.setText("");

        }else if(e.getSource()==mul){
            System.out.println("*");

            num1=Double.parseDouble(t.getText());
            op='*';
            t.setText("");

        }else if(e.getSource()==clear){
            System.out.println("C");
            t.setText("");
        }


   if(e.getSource()==equal){
      // System.out.println(t.getText());
       num2 = Double.parseDouble(t.getText());
       t.setText("");
       if(op=='+'){
           result=num1+num2;
           t.setText(String.valueOf(result));
           System.out.println(result);
       }
      else if(op=='-'){
           result=num1-num2;
           t.setText(String.valueOf(result));
           System.out.println(result);
       } else if(op=='/'){
           result=num1/num2;
           t.setText(String.valueOf(result));
           System.out.println(result);
       } else if(op=='*'){
           result=num1*num2;
           t.setText(String.valueOf(result));
           System.out.println(result);
       }


   }


    }
    public static void main(String a[]) {
        new Main();
    }

}