import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s;
        do{
            s=sc.nextLine();
            System.out.println("You Entered "+s);
        } while(!s.equals("exit") && !s.equals("Exit"));
        sc.close();
    }
}
