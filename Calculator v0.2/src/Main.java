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

    //Factorial
    public static void factorial(int i, int aa){

            System.out.println("The result of the factorial ==> "+aa);

        }

    //All digits collection
    public static void alldig(int j,int k){
        System.out.println("The result of the digits collection ==> "+k);
    }


    public static void main(String[] args) {
        //Operations
        Scanner scan =new Scanner(System.in);
        System.out.println("Choose your operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Factorial");
        System.out.println("6. All digits collection");
        System.out.println("7. About this program");
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
                System.out.println("The number of the be factorial");
                int i = scan.nextInt();
                int one=1;

                while(i>=1){
                    one*=i;
                    i--;
                }
                int aa =one;
                factorial(i,aa);

                break;

            }
            case 6 ->{
                System.out.println("Entry number that you want collect digits");
                int j = scan.nextInt();
                int zero = 0;
                do {
                    zero+=j%10;
                    j=j/10;

                }
                while (j>0);
                int k =zero;

                alldig(j,k);

                break;

            }


            case 7 -> {
                System.out.println("Version of the calculator : 0.2" + "\nLast update : 06/21/22-16:45");
                System.out.println("Creator : Mustafa Kazı");

            }
            case default -> System.out.println("Incorrect operation ");
        }
    }
}