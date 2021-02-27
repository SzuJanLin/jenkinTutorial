import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String ans = null;
            String input = scanner.next();
            if(input.equals("add")){
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                Calculator calculator = new Calculator();
                ans = Integer.toString( calculator.add(first,second));

            }
            else if (input.equals("subtract")){
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                Calculator calculator = new Calculator();
                ans = Integer.toString( calculator.subtract(first,second));
            }
            else if (input.equals("multiply")){
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                Calculator calculator = new Calculator();
                ans = Integer.toString( calculator.multiply(first,second));

            }else if (input.equals("divide")){
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                Calculator calculator = new Calculator();
                ans = Integer.toString( calculator.divide(first,second));

            }else if (input.equals("fibonacci")){
                int first = scanner.nextInt();
                Calculator calculator = new Calculator();
                ans = Integer.toString( calculator.fibonacciNumberFinder(first));

            }else if (input.equals("binary")) {
                int first = scanner.nextInt();
                Calculator calculator = new Calculator();
                ans =  calculator.intToBinaryNumber(first);

            }else if (input.equals("stop"))
                break;
            System.out.println(ans);
        }
    }
}
