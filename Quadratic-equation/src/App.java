import java.util.Scanner;
public class App {
    public static void main(String[] args){
    
       Scanner var = new Scanner(System.in);
       System.out.println("\n\t Hello Welcome to the quadratic equation calculator!\n");
       System.out.println("\tThe quadratic equation is written like this : Ax^2+Bx+C=0.\n");
       
       System.out.print("Enter A=");
       int a=var.nextInt();
       System.out.print("Enter B=");
       int b=var.nextInt();
       System.out.print("Enter C=");
       int c=var.nextInt();

       if(b>0 && c>0){
       System.out.println("Here is your equation:"+a+"x^2+"+b+"x+"+c+"=0");
       }else if(b>0 && c<0){
        System.out.println("Here is your equation:"+a+"x^2+"+b+"x"+c+"=0");
       }else if(b<0 && c>0){
        System.out.println("Here is your equation:"+a+"x^2"+b+"x+"+c+"=0");
       }
       double d=Math.pow(b, 2)-4*a*c;
       if(d>0){
        System.out.println("Delta is:"+d+" >0");
        double x1=(-b-Math.sqrt(d))/2*a;
        double x2=(-b+Math.sqrt(d))/2*a;
        System.out.println("So this equation will have 2 roots x1="+x1+" and x2="+x2);
       }else if(d==0){
        System.out.println("Delta is:"+d);
        double x=-b/2*a;
        System.out.println("So this equation will have only one solution which is x="+x);
       }else{
        System.out.println("Delta is:"+d);
        System.out.println("So unfortunately this equation doesn't have any solutions.");
       }

    }
}

