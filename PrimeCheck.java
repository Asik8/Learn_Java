import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            boolean f=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    f=false;
                    break;
                }
            }
            if(f) System.out.println("Prime Number"); else System.out.println("Not Prime");
        }
        sc.close();
    }
}
