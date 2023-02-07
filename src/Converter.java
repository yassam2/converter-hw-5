import java.util.Scanner;

public class Converter {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("welcome to the converter. Please input what you want to convert. For example, 12 inces to feet.");
      System.out.println("Enter 'exit' or '-1' to get out or to end the program");

      while (true) {
        String input = sc.nextLine();

        if (input.equals("exit") || input.equals("-1")) {
          break;
        }

        String[] parts = input.split(" ");
        if (parts.length != 4) {
          System.out.println("Your input is not able to run, please enter your input in another manner");
          continue;
        }

        double value = Double.parseDouble(parts[0]);
        String from = parts[1];
        String to = parts[3];

        double result = 0;
        switch (from + "-" + to) {
          case "inches-feet":
            result = value / 12;
            break;
          case "feet-inches":
            result = value * 12;
            break;
          case "kilograms-pounds":
            result = value * 2.20462;
            break;
          case "pounds-kilograms":
            result = value / 2.20462;
            break;
          case "liters-gallons":
            result = value * 3.7854;
            break;
          case "gallons-liters":
            result = value / 3.7854;
            break;
          case "meters-miles":
            result = value * 1609.344;
            break;
          case "miles-meters":
            result = value / 1609.344;
            break;
          default:
            System.out.println("Your input is not able to run, please enter your input in another manner");
            continue;
        }

        System.out.println(String.format("%.2f %s = %.2f %s", value, from, result, to));
      }
    
      sc.close();
    
  }
 
}