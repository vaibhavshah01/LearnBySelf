import java.util.Scanner;

public class CreateCalculatorScannerSwitchCase
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int no1=s.nextInt();
        System.out.println("Enter 2nd Number:");
        int no2=s.nextInt();
        System.out.println("Select Symbol(+,-,*,/)");
        String symbol=s.next();
        System.out.println("Result:");
        int res;

        switch (symbol)
        {
            case "+":res=no1+no2;
                System.out.println(res);
                break;
            case "-":res=no1-no2;
                System.out.println(res);
                break;
            case "*":res=no1*no2;
                System.out.println(res);
                break;
            case "/": res=no1/no2;
                System.out.println(res);
                break;
            default:
                System.out.println("Invalid Symbol");
        }
    }
}
