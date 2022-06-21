import java.util.Scanner;

public class Main {

    //Addition
    public static void add(int a, int b ){

        System.out.println("The result of the collection process ==> "+(a+b));

    }
    //Subtraction
    public static void subt(int c, int d){

        System.out.println("The result of the subtraction ==> "+(c-d));

    }
    //Multiply
    public static void multiply(int e,int f){

        System.out.println("The result of the multiply ==> "+(e*f));

    }
    //Divide
    public static void divide(float g, float h){

        System.out.println("The result of the divide ==> "+(g/h));

    }

    public static void main(String[] args) {
        //Operations
        Scanner scan =new Scanner(System.in);
        System.out.println("Choose your operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. About this program");
        int choose=scan.nextInt();

        //Calculate chosen operation
        switch (choose) {
            case 1 -> {
                System.out.println("The first number to be collect:");
                int a = scan.nextInt();
                System.out.println("The second number to be collect:");
                int b = scan.nextInt();
                add(a, b);
            }
            case 2 -> {
                System.out.println("The first number to be subtract:");
                int c = scan.nextInt();
                System.out.println("The second number to be subtract:");
                int d = scan.nextInt();
                subt(c, d);
            }
            case 3 -> {
                System.out.println("The first number to be multiply:");
                int e = scan.nextInt();
                System.out.println("The second number to be multiply:");
                int f = scan.nextInt();
                multiply(e, f);
            }
            case 4 -> {
                System.out.println("The first number to be divide:");
                int g = scan.nextInt();
                System.out.println("The second number to be divide:");
                int h = scan.nextInt();
                divide(g, h);
            }
            case 5 -> {
                System.out.println("Version of the calculator : 0.1" + "\nLast update : 06/21/22-13:25");
                System.out.println("Creator : Mustafa Kazı");
            }
            case default -> System.out.println("Incorrect operation ");
        }
    }
}