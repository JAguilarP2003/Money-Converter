import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        ApiUsage parse  = new ApiUsage();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");
        String menu = """
                ********************************************************
                *            Currency Exchange Combinations            *
                ********************************************************
                *                                                      *
                *  1 = USD --> COP (US Dollar to Colombian Peso)       *
                *  2 = USD --> BRL (US Dollar to Brazilian Real)       *
                *  3 = COP --> USD (Colombian Peso to US Dollar)       *
                *  4 = COP --> BRL (Colombian Peso to Brazilian Real)  *
                *  5 = BRL --> USD (Brazilian Real to US Dollar)       *
                *  6 = BRL --> COP (Brazilian Real to Colombian Peso)  *
                *                                                      *
                *                                                      *
                *  7 = Exit                                            *
                *                                                      *
                ********************************************************
                """;

        int userOption = 0;

        while(userOption != 7){
            System.out.println(menu);
            userOption = scanner.nextInt();

            if(userOption == 7){
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Please choose your exchange userOption: \n");

            System.out.println("\nEnter the amount to convert: \n");
            double ammount = scanner.nextDouble();

            try{
                switch(userOption){
                    case 1:
                        parse.convertCurency("USD", "COP", ammount);
                        break;
                    case 2:
                        parse.convertCurency("USD", "BRL", ammount);
                        break;
                    case 3:
                        parse.convertCurency("COP", "USD", ammount);
                        break;
                    case 4:
                        parse.convertCurency("COP", "BRL", ammount);
                        break;
                    case 5:
                        parse.convertCurency("BRL", "USD", ammount);
                        break;
                    case 6:
                        parse.convertCurency("BRL", "COP", ammount);
                        break;
                    default:
                        System.out.println("Invalid userOption");
                }
            }
            catch (IOException | InterruptedException e){
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }
}