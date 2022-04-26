//import java.util.Scanner;
//
//public class SimpleConvertor {
//
//    public static void main(String[] args) {
//
//
//        Scanner input = new Scanner(System.in);
//
//        double length = 0.39370;
//
//        System.out.println("Welcome to simple convertor.");
//
//        while (true) {
//            System.out.println("Pick an option and its corresponding letter to select.");
//            System.out.println("Farenheight to Celsius: f");
//            System.out.println("Celsius to Farenheight: c");
//            System.out.println("Inches to Centimeters: i");
//            System.out.println("Centimeters to Inches: ce");
//            System.out.println("");
//            System.out.println("Make your choice: ");
//            String choice = input.nextLine();
//
//            switch (choice) {
//                case "f":
//
//                    float farenheight;
//
//                    System.out.println("Enter temperatue in Fahrenheit: ");
//                    farenheight = input.nextInt();
//
//                    farenheight = ((farenheight - 32) * 5) / 9;
//
//                    System.out.println("Temperatue in Celsius = " + farenheight);
//
//                    break;
//                case "c":
//
//                    float celsius;
//
//                    System.out.println("Enter temperatue in Celsius: ");
//                    celsius = input.nextInt();
//
//                    celsius = ((celsius) * 18 / 10) + 32;
//
//                    System.out.println("Temperatue in Farenheight = " + celsius);
//
//                    break;
//                case "i":
//
//                    double inches;
//
//                    System.out.println("Enter length in Inches: ");
//                    inches = input.nextInt();
//
//                    inches = (inches / length);
//
//                    System.out.println("Length in Centimeters = " + inches);
//                    break;
//                case "ce":
//
//                    double centimeters;
//
//                    System.out.println("Enter length in Centimeters: ");
//                    centimeters = input.nextInt();
//
//                    centimeters = (centimeters * length);
//
//                    System.out.println("Length in Inches is = " + length);
//                    break;
//            }
//            choice = input.nextLine();
//            if ("redo".equals(choice)) {
//            break;
//        }
//            System.out.println("here it breaks");
//    }
//
//}
//}