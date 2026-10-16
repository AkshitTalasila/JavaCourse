import java.util.*;

public class TempChecker {

    public double average(int inputs) {

        double[] temps = new double[inputs];
        int above = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < inputs; i++) {
            System.out.println("Please enter the temperature");
            temps[i] = scanner.nextDouble();

            if (temps[i] > 32) {
                above++;
            }
        }

        double[] aboveAvg = new double[above];
        int counter = 0;
        double avg = 0;

        for (int i = 0; i < inputs; i++) {
            if (temps[i] > 32) {
                aboveAvg[counter] = temps[i];
                counter++;
            }
        }

        if (aboveAvg.length == 0) {
            return 0;
        }

        for (int i = 0; i < aboveAvg.length; i++) {
            avg += aboveAvg[i];
        }

        return avg / aboveAvg.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many temperatures do you want to enter?");
        int inputs = scanner.nextInt();

        TempChecker tempChecker = new TempChecker();
        double result = tempChecker.average(inputs);

        System.out.println("Average of temperatures above 32: " + result);
    }
}
