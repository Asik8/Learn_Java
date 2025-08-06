import java.util.Scanner;

public class GetUserInputAndPrint {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("My name is "+s);
        sc.close();
    }
}
