import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("first number?");
        String firstnum = scan.nextLine();
        System.out.println("second number?");
        String secnum = scan.nextLine();
        System.out.println("what opperand?");
        System.out.println("use x, /, +, - to multiply, divide, add and subtract");
        String opper = scan.nextLine();

        int firstnumint = Integer.parseInt(firstnum);

        int secnumint = Integer.parseInt(secnum);

        if (opper.equals("+"))
        {
            System.out.println(firstnumint + secnumint);
        }
        else if (opper.equals("-"))
        {
            System.out.println(firstnumint - secnumint);
        }
        else if (opper.equals("x"))
        {
            System.out.println(firstnumint * secnumint);
        }
        else if (opper.equals("/"))
        {
            System.out.println(firstnumint / secnumint);
        }
    }

}
