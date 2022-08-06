package Question_5;

import java.util.jar.JarOutputStream;

public class MethodOverloading {
    public void max(int a){
        System.out.println("Entered number is int type "+ a);
    }
    public void max(float a){
        System.out.println("Entered number is float type "+ a);
    }
    public void max(double a){
        System.out.println("Entered number is double type "+ a);
    }
    public void max(long a){
        System.out.println("Entered number is long type "+ a);
    }
    public void max(int a,int b){
        System.out.println("max method with int argument");
        if(a>b){
            System.out.println(a +" is greater than "+b);
        }
        else{
            System.out.println(b +" is greater than "+a);
        }
    }
    public void max(float a,float b) {
        System.out.println("max method with float argument");
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
    }
        public void max(double a,double b){
            System.out.println("max method with double argument");
            if (a > b) {
                System.out.println(a + " is greater than " + b);
            } else {
                System.out.println(b + " is greater than " + a);
            }
        }
            public void max(long a,long b){
                System.out.println("max method with long argument");
                if(a>b){
                    System.out.println(a +" is greater than "+b);
                }
                else{
                    System.out.println(b +" is greater than "+a);
                }
}
}
