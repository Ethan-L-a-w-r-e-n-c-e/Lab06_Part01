import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double celsius = 0;
        double fahrenheit = 0;
        boolean valid = false;

        do {
            System.out.println("Please enter a temperature in degrees C to be converted to degrees F");
            if(scan.hasNextDouble()){
                celsius = scan.nextDouble();
                fahrenheit = ((1.8*celsius)+32);
                valid = true;
            } else {
                scan.nextLine();
                System.out.println("You have entered in the wrong data type");
                System.out.println();
            }

        } while (!valid);
        System.out.printf("Degrees C: %8.2f",celsius);
        System.out.printf("\nDegrees F: %8.2f",fahrenheit);
    }
}