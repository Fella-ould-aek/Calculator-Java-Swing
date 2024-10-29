import java.util.Scanner;
public class Main{
    public static void main(){
        double num1,num2;
        String op;
        Scanner num=new Scanner(System.in);
        System.out.println("entrer le num 1");
        num1=num.nextDouble();
        System.out.println("entrer le num2");
        num2=num.nextDouble();
        System.out.println("entrer l'operation");
        op=num.nextLine();
        switch(op){
            case"+":{
                double result=num1+num2;
                System.out.println(+num1+"+"+num2+"="+result);

            }
            case "-":{
                double result=num1-num2;
                System.out.println(+num1+"-"+num2+"="+result);
            }
            case "*":{
                double result=num1*num2;
                System.out.println(+num1+"*"+num2+"="+result);
            }
            case "/":{
                if(num2!=0){
                    double result=num1/num2;
                    System.out.println(+num1+"/"+num2+"="+result);
                }
                else{
                  System.out.println("error");
                }
            }

        }
    }

 }