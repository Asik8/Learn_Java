import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Tell me how much time you want to repeat this process?");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Enter the Number ");
            int a=sc.nextInt();
            if(a%2==0) System.out.println("Even Number"); else System.out.println("Odd Number");
        }
        sc.close();
    }
}
