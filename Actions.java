package Calculator;

import java.awt.event.*;

public class Actions implements ActionListener{
     
    double num, num1, result;
    int calculation;
    int term = 3;

    CalculatorApplication cal;
    //constructor//
    Actions(CalculatorApplication cal){
        this.cal=cal;
    }
    
    //action performed method//
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source==cal.onbutton){
            enable();
        }
        else if(source==cal.offbutton){
            dislable();
        }
        else if(source==cal.op20){
            cal.label.setText(null);
            cal.txtf.setText(null);
        }
        else if(source==cal.op19){
            int length = cal.txtf.getText().length();
            int number = length-1;
            if(length>0){
                StringBuilder back = new StringBuilder(cal.txtf.getText());
                back.deleteCharAt(number);
                cal.txtf.setText(back.toString());
            }
            if(cal.txtf.getText().endsWith("")){
                cal.label.setText("");
            }
        }
        else if(source==cal.bn0){
            if(cal.txtf.getText().equals("0")){ return;}
            else{cal.txtf.setText(cal.txtf.getText()+"0");}

        }
        else if(source==cal.bn1){
            cal.txtf.setText(cal.txtf.getText()+"1");
        }
        else if(source==cal.bn2){
            cal.txtf.setText(cal.txtf.getText()+"2");
        }
        else if(source==cal.bn3){
            cal.txtf.setText(cal.txtf.getText()+"3");
        }
        else if(source==cal.bn4){
            cal.txtf.setText(cal.txtf.getText()+"4");
        }
        else if(source==cal.bn5){
            cal.txtf.setText(cal.txtf.getText()+"5");
        }
        else if(source==cal.bn6){
            cal.txtf.setText(cal.txtf.getText()+"6");
        }
        else if(source==cal.bn7){
            cal.txtf.setText(cal.txtf.getText()+"7");
        }
        else if(source==cal.bn8){
            cal.txtf.setText(cal.txtf.getText()+"8");
        }
        else if(source==cal.bn9){
            cal.txtf.setText(cal.txtf.getText()+"9");
        }
        else if(source==cal.op5){
            if(cal.txtf.getText().contains(".")){return;}
            else{ cal.txtf.setText(cal.txtf.getText()+"."); }
        }
        else if(source==cal.op1){
            String str = cal.txtf.getText();
            num = Double.parseDouble(cal.txtf.getText());
            calculation = 1;
            cal.txtf.setText("");
            cal.label.setText(str + "+");
        }
        else if(source==cal.op2){
            String str = cal.txtf.getText();
            num = Double.parseDouble(cal.txtf.getText());
            calculation = 2;
            cal.txtf.setText("");
            cal.label.setText(str + "-");
        }
        else if(source==cal.op3){
            String str = cal.txtf.getText();
            num = Double.parseDouble(cal.txtf.getText());
            calculation = 3;
            cal.txtf.setText("");
            cal.label.setText(str + "x");
        }
        else if(source==cal.op4){
            String str = cal.txtf.getText();
            num = Double.parseDouble(cal.txtf.getText());
            calculation = 4;
            cal.txtf.setText("");
            cal.label.setText(str + "÷");
        }
        else if(source==cal.op14){
            String str = cal.txtf.getText();
            num = Double.parseDouble(cal.txtf.getText());
            calculation = 5;
            cal.txtf.setText("");
            cal.label.setText(str + "^");
        }
        else if(source==cal.op8){
            num = Double.parseDouble(cal.txtf.getText());
            double square = Math.pow(num, 2);
            String str = Double.toString(square);
            if(str.endsWith(".0")){ cal.txtf.setText(str.replace(".0", "")); }
            else{ cal.txtf.setText(str); }
        }
        else if(source==cal.op7){
            num = Double.parseDouble(cal.txtf.getText());
            double sqrt = Math.sqrt(num);
            String str = Double.toString(sqrt);
            cal.txtf.setText(str);
        }
        else if(source==cal.op9){
            num = Double.parseDouble(cal.txtf.getText());
            double reciprocal = 1/num;
            String str = Double.toString(reciprocal);
            if(str.endsWith(".0")){  cal.txtf.setText(str.replace(".0", ""));}
            else{  cal.txtf.setText(str); }
        }
        else if(source==cal.op16){
           calculation = 6;
           cal.label.setText("sin");
        }
        else if(source==cal.op17){
           calculation = 7;
           cal.label.setText("cos");
        }
        else if(source==cal.op18){
            calculation = 8;
            cal.label.setText("tan");
        }
        else if(source==cal.op13){
           calculation = 9;
           cal.label.setText("n!");
        }
        else if(source==cal.op11){
            num = Double.parseDouble(cal.txtf.getText());
            double exp = Math.exp(num);
            String str = Double.toString(exp);
            cal.txtf.setText(str);
        }
        else if(source==cal.op12){
            String str = cal.txtf.getText();
            num = Double.parseDouble(cal.txtf.getText());
            calculation = 9;
            cal.txtf.setText("");
            cal.label.setText(str + "mod");
        }
        else if(source==cal.op15){
            calculation = 10;
            cal.label.setText("log");
        }
        else if(source==cal.op10){
            calculation = 11;
            cal.label.setText("ln");
        }
        else if(source==cal.op6){
            num1 = Double.parseDouble(cal.txtf.getText());
            switch(calculation){
                case 1:  
                     result = num + num1;
                     calculation = 0; 
                     break;
                case 2:
                     result = num - num1;
                     calculation = 0;
                     break;
                case 3:
                     result = num * num1;
                     calculation = 0;
                     break;
                case 4:
                     result = num / num1;
                     calculation = 0;
                     break;
                case 5:
                     result = Math.pow(num, num1);
                     calculation = 0;
                     break;   
                case 6:
                     //sin x = x − x^3/3! + x^5/5! − x^7/7! + ...,
                     int pow1 = 1;
                     double res1=0.0;
                     double radian1 = Math.toRadians(num1);//num*Math.PI/180;
                     for(int i=1; i<=term; i++){
                        if(i%2==0){
                           res1 = -(Math.pow(radian1, pow1)/getFact(pow1));
                        }
                        else{
                           res1 = Math.pow(radian1, pow1)/getFact(pow1);
                        } 
                        result = result + res1;
                        pow1=pow1+2;
                     } 
                     calculation = 0;
                     break;
                case 7:
                     //cos x = 1 – (x^2 / 2 !) + (x^4 / 4 !) – (x^6 / 6 !) +…
                     int pow2 = 0;
                     double res2=0.0;
                     double radian2 = Math.toRadians(num1);//num*Math.PI/180;
                     for(int i=1; i<=term; i++){
                        if(i%2==0){
                            res2 = -(Math.pow(radian2, pow2)/getFact(pow2));
                        }
                        else{
                            res2 = Math.pow(radian2, pow2)/getFact(pow2);
                        }
                        result = result + res2;
                        pow2=pow2+2;
                     }
                     calculation = 0;
                     break;
                case 8:     
                     //x + x^3/3 + 2x^5/3^2 + 17x^7/315+⋯
                     double radian3 = Math.toRadians(num1);//num*Math.PI/180;
                     for (int i = 1; i <= term; i++){
                        double B = 0; 
                        int Bn = 2 * i;
                        for (int k = 0; k <= Bn; k++){
                            double temp = 0; 
                            for (int r = 0; r <= k; r++){
                               temp = temp + Math.pow(-1, r) * getFact(k) * Math.pow(r, Bn) / (getFact(r) *  getFact(k - r));
                            }
                            B = B + temp / ((double)(k + 1));
                        }
                        result = result + Math.pow(-4, i) * (1 - Math.pow(4, i)) * B * Math.pow(radian3, 2 * i - 1) / getFact(2 * i);
                    }
                    calculation = 0;
                    break;
                case 9:
                    result = num % num1;
                    calculation = 0;
                    break;
                case 10:
                    result = Math.log10(num1);
                    calculation = 0;
                    break;    
                case 11:
                    result = Math.log(num1);
                    calculation = 0;
                    break;   
                default:
                    num = Double.parseDouble(cal.txtf.getText());  
                    result = num; 
            }            
            String str = Double.toString(result);
            if(str.endsWith(".0")){
                cal.txtf.setText(str.replace(".0", ""));
            }else{
                cal.txtf.setText(str);
            }
            cal.label.setText("");
            num = result;
        }    
    }
    
    //factorial function//
    double getFact(double n){

        if(n>=1) return n*getFact(n-1);
        else return 1;
    }

    //onbutton enable function//
    void enable(){
       cal.offbutton.setEnabled(true);
       cal.bn0.setEnabled(true);
       cal.bn1.setEnabled(true);
       cal.bn2.setEnabled(true);
       cal.bn3.setEnabled(true);
       cal.bn4.setEnabled(true);
       cal.bn5.setEnabled(true);
       cal.bn6.setEnabled(true);
       cal.bn7.setEnabled(true);
       cal.bn8.setEnabled(true);
       cal.bn9.setEnabled(true);
       cal.op1.setEnabled(true);
       cal.op2.setEnabled(true);
       cal.op3.setEnabled(true);
       cal.op4.setEnabled(true);
       cal.op5.setEnabled(true);
       cal.op6.setEnabled(true);
       cal.op7.setEnabled(true);
       cal.op8.setEnabled(true);
       cal.op9.setEnabled(true);
       cal.op10.setEnabled(true);
       cal.op11.setEnabled(true);
       cal.op12.setEnabled(true);
       cal.op13.setEnabled(true);
       cal.op14.setEnabled(true); 
       cal.op15.setEnabled(true);
       cal.op16.setEnabled(true);
       cal.op17.setEnabled(true);
       cal.op18.setEnabled(true);
       cal.op19.setEnabled(true);
       cal.op20.setEnabled(true);
    }

    //offbutton dislabel function//
    void dislable(){
        cal.onbutton.setEnabled(true);
        cal.label.setText(null);
        cal.txtf.setText(null);
        cal.bn0.setEnabled(false);
        cal.bn1.setEnabled(false);
        cal.bn2.setEnabled(false);
        cal.bn3.setEnabled(false);
        cal.bn4.setEnabled(false);
        cal.bn5.setEnabled(false);
        cal.bn6.setEnabled(false);
        cal.bn7.setEnabled(false);
        cal.bn8.setEnabled(false);
        cal.bn9.setEnabled(false);
        cal.op1.setEnabled(false);
        cal.op2.setEnabled(false);
        cal.op3.setEnabled(false);
        cal.op4.setEnabled(false);
        cal.op5.setEnabled(false);
        cal.op6.setEnabled(false);
        cal.op7.setEnabled(false);
        cal.op8.setEnabled(false);
        cal.op9.setEnabled(false);
        cal.op10.setEnabled(false);
        cal.op11.setEnabled(false);
        cal.op12.setEnabled(false);
        cal.op13.setEnabled(false);
        cal.op14.setEnabled(false); 
        cal.op15.setEnabled(false);
        cal.op16.setEnabled(false);
        cal.op17.setEnabled(false);
        cal.op18.setEnabled(false);
        cal.op19.setEnabled(false);
        cal.op20.setEnabled(false);
    }
}
