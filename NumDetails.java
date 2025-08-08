import java.util.Scanner;

public class NumDetails {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==0) System.out.println("Zero Number");
            else if(n<0) System.out.println("Negative Number");
            else System.out.println("Positive Number");
        }
        sc.close();
    }
}
