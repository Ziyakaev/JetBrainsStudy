import java.util.Scanner;

class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String shape = scanner.next();
        switch (shape){
            case "triangle":
                calculateTriangle();
                break;
            case "circle":
                calculateCircle();
                break;
            case "rectangle":
                calculateRestangle();
                break;
            default:
                System.out.println("error");
                break;
        }
        // put your code here
    }

    private static void calculateRestangle(){
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(a*b);
    }

    private static void calculateCircle(){
        double r = scanner.nextDouble();
        System.out.println(3.14*Math.pow(r,2));
    }

    private static void calculateTriangle(){
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a + b + c)/2.0;
        System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}