import java.util.Scanner;

public class ScannerClassUserInput
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=s.next();
        System.out.println("Enter Gender:");
        char gender=s.next().charAt(0);
        System.out.println("Enter Age:");
        int age=s.nextInt();
        System.out.println("Enter Phone No.:");
        long phone_num=s.nextLong();
        System.out.println("-------------------------");
        System.out.println("Name:"+ name);
        System.out.println("Gender:" + gender);
        System.out.println("Age:"+ age);
        System.out.println("Phone Number:"+phone_num);
    }
}
