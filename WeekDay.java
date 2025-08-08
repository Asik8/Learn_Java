import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        switch(s){
            case "Saturday": System.out.println("Saturday");
            break;
            case "Sunday": System.out.println("Sunday");
            break;
            case "Monday": System.out.println("Monday");
            break;
            case "Tuesday": System.out.println("Tuesday");
            break;
            case "Wednesday": System.out.println("Wednesday");
            break;
            case "Thrusday": System.out.println("Thrusday");
            break;
            case "Friday": System.out.println("Friday");
            break;
            default: System.out.println("This is not a day");
        }
        sc.close();
    }
}
