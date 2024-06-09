import java.util.*;
public class A{
    public static int substraction(int a, int b){
        int s;
        if(a>b){
            s=a-b;
            System.out.println(s);
        }else{
            s=b-a;
            System.out.println(s);
        }
        return 0;
    }
    public static int addition(int a,int b){
        int s;
        s=a+b;
        System.out.println(s);
        return 0;
    }
    public static int division(int a, int b){
        int s;
        if(a>b){
            s=a/b;
            System.out.println(s);
        }else{
            s=b/a;
            System.out.println(s);
            }
            return 0;
    }                                            


 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    System.out.print("enter 1st number:");
    int a = sc.nextInt();
    System.out.print("enter 2nd number:");
    int b = sc.nextInt();
    System.out.println("enter \n 1 for  substraction \n 2 for addition \n 3 for division");
    System.out.print("Enter Your choice:");
    int button=sc.nextInt();
    if(button==1){
        substraction(a,b);
    }else if(button==2){
        addition(a,b);
    }else if(button==3){
        division(a,b);
    }else{
        System.out.println("invalid input");
    }
 }
}


