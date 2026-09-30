import java.util.Scanner;

public class AutomaticFanController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     AUTOMATIC FAN CONTROLLER");
        System.out.println("=================================");

        System.out.print("Enter room temperature (°C): ");
        double temperature = sc.nextDouble();

        System.out.println("\n--------- FAN STATUS ---------");

        if (temperature < 25) {
            System.out.println("Temperature : " + temperature + " °C");
            System.out.println("Fan Speed  : OFF");
            System.out.println("Fan Status : OFF");
        }
        else if (temperature >= 25 && temperature < 30) {
            System.out.println("Temperature : " + temperature + " °C");
            System.out.println("Fan Speed  : LOW");
            System.out.println("Fan Status : ON");
        }
        else if (temperature >= 30 && temperature < 35) {
            System.out.println("Temperature : " + temperature + " °C");
            System.out.println("Fan Speed  : MEDIUM");
            System.out.println("Fan Status : ON");
        }
        else {
            System.out.println("Temperature : " + temperature + " °C");
            System.out.println("Fan Speed  : HIGH");
            System.out.println("Fan Status : ON");
        }

        System.out.println("------------------------------");

        sc.close();
    }
}
