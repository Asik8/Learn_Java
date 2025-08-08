import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter times ");
        int t=sc.nextInt();
        System.out.println();
        while(t-->0){
            System.out.println("Enter Range");
            int n=sc.nextInt();
            for(int i=2;i<=n;i++){
                if((i%2)==0){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
