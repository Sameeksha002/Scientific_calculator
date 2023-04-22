package Calculator;


import java.awt.*;   
import javax.swing.*;

class CalculatorApplication {
     
    JFrame frame = new JFrame("Calculator"); 
    JLabel label = new JLabel();
    JTextField txtf = new JTextField();

    JRadioButton onbutton = new JRadioButton("on");
    JRadioButton offbutton = new JRadioButton("off");

    //all numbers in calculator//
    JButton bn0 = new JButton("0");
    JButton bn1 = new JButton("1");
    JButton bn2 = new JButton("2");
    JButton bn3 = new JButton("3");
    JButton bn4 = new JButton("4");
    JButton bn5 = new JButton("5");
    JButton bn6 = new JButton("6");
    JButton bn7 = new JButton("7");
    JButton bn8 = new JButton("8");
    JButton bn9 = new JButton("9");

    //all operation button in calculator//
    JButton op1 = new JButton("+");
    JButton op2 = new JButton("-");
    JButton op3 = new JButton("x");
    JButton op4 = new JButton("÷");
    JButton op5 = new JButton(".");
    JButton op6 = new JButton("=");
    JButton op7 = new JButton("\u221A");//squareroot
    JButton op8 = new JButton("x\u00B2");//x^2
    JButton op9 = new JButton("1/x");
    JButton op10 = new JButton("ln");
    JButton op11 = new JButton("exp");
    JButton op12 = new JButton("mod");
    JButton op13 = new JButton("n!");
    JButton op14 = new JButton("^");
    JButton op15 = new JButton("log");
    JButton op16 = new JButton("sin");
    JButton op17 = new JButton("cos");
    JButton op18 = new JButton("tan");
    JButton op19 = new JButton("DEL");
    JButton op20 = new JButton("C");


    //constructor//
     CalculatorApplication(){
          calgui();
          addComponent();
     }
     

     //for frame of calculator//
     void calgui(){
        frame.setSize(390, 600);  
        frame.getContentPane().setBackground(Color.black);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
     }

     //adding components 
     void addComponent(){
         label.setBounds(340,0,50,50);
         label.setForeground(Color.white);
       
         frame.add(label);

         txtf.setBounds(10,40,360,65);
         txtf.setEditable(false);
         txtf.setHorizontalAlignment(SwingConstants.RIGHT);
         txtf.setFont(new Font("Arial", Font.BOLD, 20));
         frame.add(txtf);

         onbutton.setBounds(10,120,55,60);
         onbutton.setSelected(true);
         onbutton.setFont(new Font("Arial", Font.BOLD, 20));
         onbutton.setBackground(Color.black);
         onbutton.setForeground(Color.white);
         onbutton.setFocusable(false);
         frame.add(onbutton);
         
         offbutton.setBounds(10,190,55,60);
         offbutton.setSelected(false);
         offbutton.setFont(new Font("Arial", Font.BOLD, 20));
         offbutton.setBackground(Color.black);
         offbutton.setForeground(Color.white);
         offbutton.setFocusable(false);
         frame.add(offbutton);
         
         ButtonGroup btgrp = new ButtonGroup();
         btgrp.add(onbutton);
         btgrp.add(offbutton);
         
         //row 1//
         op7.setBounds(70,120,56,60);
         op7.setFont(new Font("Arial", Font.BOLD, 20));
         op7.setBackground(Color.green);
         frame.add(op7);

         op8.setBounds(130,120,56,60);
         op8.setFont(new Font("Arial", Font.BOLD, 18));
         op8.setBackground(Color.green);
         frame.add(op8);
        
         op14.setBounds(190,120,56,60);
         op14.setFont(new Font("Arial", Font.BOLD, 20));
         op14.setBackground(Color.green);
         frame.add(op14);
         
         op15.setBounds(250,120,56,60);
         op15.setFont(new Font("Arial", Font.BOLD, 14));
         op15.setBackground(Color.green);
         frame.add(op15);

         op10.setBounds(310,120,56,60);
         op10.setFont(new Font("Arial", Font.BOLD, 20));
         op10.setBackground(Color.green);
         frame.add(op10);
         //row 1//
         
         //row 2//
         op9.setBounds(70,190,56,60);
         op9.setFont(new Font("Arial", Font.BOLD, 14));
         op9.setBackground(Color.green);
         frame.add(op9);

         op13.setBounds(130,190,56,60);
         op13.setFont(new Font("Arial", Font.BOLD, 14));
         op13.setBackground(Color.green);
         frame.add(op13);

         op16.setBounds(190,190,56,60);
         op16.setFont(new Font("Arial", Font.BOLD, 14));
         op16.setBackground(Color.green);
         frame.add(op16);

         op17.setBounds(250,190,56,60);
         op17.setFont(new Font("Arial", Font.BOLD, 13));
         op17.setBackground(Color.green);
         frame.add(op17);

         op18.setBounds(310,190,56,60);
         op18.setFont(new Font("Arial", Font.BOLD, 14));
         op18.setBackground(Color.green);
         frame.add(op18);
         //row 2//

         //row 3//
         bn7.setBounds(10, 260, 60, 65);
         bn7.setFont(new Font("Arial", Font.BOLD, 30));
         bn7.setBackground(Color.LIGHT_GRAY);
         frame.add(bn7);

         bn8.setBounds(76, 260, 60, 65);
         bn8.setFont(new Font("Arial", Font.BOLD, 30));
         bn8.setBackground(Color.LIGHT_GRAY);
         frame.add(bn8);
         
         bn9.setBounds(142, 260, 60, 65);
         bn9.setFont(new Font("Arial", Font.BOLD, 30));
         bn9.setBackground(Color.LIGHT_GRAY);
         frame.add(bn9);

         op19.setBounds(208,260,80,65);
         op19.setFont(new Font("Arial", Font.BOLD, 20));
         op19.setBackground(Color.red);
         frame.add(op19);
        
         op20.setBounds(294,260,70,65);
         op20.setFont(new Font("Arial", Font.BOLD, 30));
         op20.setBackground(Color.red);
         frame.add(op20);
         //row 3//
       
         //row 4//
         bn4.setBounds(10, 335, 60, 65);
         bn4.setFont(new Font("Arial", Font.BOLD, 30));
         bn4.setBackground(Color.LIGHT_GRAY);
         frame.add(bn4);

         bn5.setBounds(76, 335, 60, 65);
         bn5.setFont(new Font("Arial", Font.BOLD, 30));
         bn5.setBackground(Color.LIGHT_GRAY);
         frame.add(bn5);

         bn6.setBounds(142, 335, 60, 65);
         bn6.setFont(new Font("Arial", Font.BOLD, 30));
         bn6.setBackground(Color.LIGHT_GRAY);
         frame.add(bn6);

         op3.setBounds(208,335,80,65);
         op3.setFont(new Font("Arial", Font.BOLD, 30));
         op3.setBackground(Color.yellow);
         frame.add(op3);
        
         op4.setBounds(294,335,70,65);
         op4.setFont(new Font("Arial", Font.BOLD, 30));
         op4.setBackground(Color.yellow);
         frame.add(op4);
         //row 4//

         //row 5//
         bn1.setBounds(10, 410, 60, 65);
         bn1.setFont(new Font("Arial", Font.BOLD, 30));
         bn1.setBackground(Color.LIGHT_GRAY);
         frame.add(bn1);

         bn2.setBounds(76, 410, 60, 65);
         bn2.setFont(new Font("Arial", Font.BOLD, 30));
         bn2.setBackground(Color.LIGHT_GRAY);
         frame.add(bn2);
         
         bn3.setBounds(142, 410, 60, 65);
         bn3.setFont(new Font("Arial", Font.BOLD, 30));
         bn3.setBackground(Color.LIGHT_GRAY);
         frame.add(bn3);

         op1.setBounds(208,410,80,65);
         op1.setFont(new Font("Arial", Font.BOLD, 30));
         op1.setBackground(Color.yellow);
         frame.add(op1);
        
         op2.setBounds(294,410,70,65);
         op2.setFont(new Font("Arial", Font.BOLD, 40));
         op2.setBackground(Color.yellow);
         frame.add(op2);
         //row 5//

         //row 6//
         bn0.setBounds(10, 485, 60, 65);
         bn0.setFont(new Font("Arial", Font.BOLD, 30));
         bn0.setBackground(Color.LIGHT_GRAY);
         frame.add(bn0);
        
         op5.setBounds(76, 485, 60, 65);
         op5.setFont(new Font("Arial", Font.BOLD, 30));
         op5.setBackground(Color.LIGHT_GRAY);
         frame.add(op5);

         op6.setBounds(142, 485, 60, 65);
         op6.setFont(new Font("Arial", Font.BOLD, 30));
         op6.setBackground(Color.orange);
         frame.add(op6);
         
         op11.setBounds(208,485,80,65);
         op11.setFont(new Font("Arial", Font.BOLD, 25));
         op11.setBackground(Color.yellow);
         frame.add(op11);
        
         op12.setBounds(294,485,70,65);
         op12.setFont(new Font("Arial", Font.BOLD, 17));
         op12.setBackground(Color.yellow);
         frame.add(op12);
         //row 6//


     }
    
     void addActionevent(){

        Actions actionevent = new Actions(this);
        onbutton.addActionListener(actionevent);
        offbutton.addActionListener(actionevent);
        bn0.addActionListener(actionevent);
        bn1.addActionListener(actionevent);
        bn2.addActionListener(actionevent);
        bn3.addActionListener(actionevent);
        bn4.addActionListener(actionevent);
        bn5.addActionListener(actionevent);
        bn6.addActionListener(actionevent);
        bn7.addActionListener(actionevent);
        bn8.addActionListener(actionevent);
        bn9.addActionListener(actionevent);
        op1.addActionListener(actionevent);
        op2.addActionListener(actionevent);
        op3.addActionListener(actionevent);
        op4.addActionListener(actionevent);
        op5.addActionListener(actionevent);
        op6.addActionListener(actionevent);
        op7.addActionListener(actionevent);
        op8.addActionListener(actionevent);
        op9.addActionListener(actionevent);
        op10.addActionListener(actionevent);
        op11.addActionListener(actionevent);
        op12.addActionListener(actionevent);
        op13.addActionListener(actionevent);
        op14.addActionListener(actionevent);
        op15.addActionListener(actionevent);
        op16.addActionListener(actionevent);
        op17.addActionListener(actionevent);
        op18.addActionListener(actionevent);
        op19.addActionListener(actionevent);
        op20.addActionListener(actionevent);

     }
    public static void main (String args[]){
    
        CalculatorApplication calculator = new CalculatorApplication();
        calculator.addActionevent();
    }
}