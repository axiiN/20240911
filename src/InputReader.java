import java.util.Scanner;

public class InputReader {
    public double read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg az oldal hosszat: ");
        double val = scanner.nextDouble();
        scanner.close();
        return val;
    }
}
