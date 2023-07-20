import java.util.Scanner;

public class currencyconverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Choose one from following options");
        System.out.println("1) USD to Euro");
        System.out.println("2) Euro to USD");
        System.out.println("3) Pounds to UDS");
        int exchange = sc.nextInt();
        switch (exchange){
        case 1:
        {
            System.out.println("Enter the number of USD");

            double usd = sc.nextDouble();

            if (usd>=0) {
                System.out.println(usd +" USD is " + usd*0.908 + " Euro.");
            
            }
            else {
                System.out.println("Please put in positive numbers of USD");

            }
        }    
        break;
        case 2: {
            System.out.println("Enter the number of Euro");
            double euro = sc.nextDouble();

            if (euro>=0) {
                System.out.println(euro + "Euro is " + euro*1.101 + " USD.");

            }
            else {
                System.out.println("Please put in positive number of Euro.");

            }
        }
        break; 
        case 3: {
            System.out.println("Enter the number in Pounds");
            double pounds = sc.nextDouble();

            if (pounds>=0) {
                System.out.println(pounds + " Pounds is " +pounds*1.28 + "USD" );

            }
            else {
                System.out.println("Please put positive number of Pounds");
            }
        }
        break;
        }
        sc.close();
    }
    
}