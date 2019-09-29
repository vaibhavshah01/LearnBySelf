import java.util.Scanner;

public class CreateCalculatorScannerDoWhile {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st Number:");
            int no1 = s.nextInt();
            System.out.println("Enter 2nd Number:");
            int no2 = s.nextInt();
            System.out.println("Select Symbol(+,-,*,/)");
            String symbol = s.next();
            System.out.println("Result:");
            int res;

            switch (symbol) {
                case "+":
                    res = no1 + no2;
                    System.out.println(res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println(res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println(res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println(res);
                    break;
                default:
                    System.out.println("Invalid Symbol");
            }
            System.out.println("Do you want to continue (Press y for Yes and n for No)");
            yn=s.next();

        }while (yn.equals("y")||(yn.equals("Y")));
    }
}

