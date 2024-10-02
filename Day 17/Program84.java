import java.util.Scanner;

public class Program84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the date (dd/mm/yyyy): ");
        String inputDate = sc.nextLine();
        String[] datePart = inputDate.split("/");

        int day  = Integer.parseInt(datePart[0]);
        int month = Integer.parseInt(datePart[1]);
        int year = Integer.parseInt(datePart[2]);

        if (isValidate(day, month,year)) {
            System.out.println("Date is valid");
        } else {
            System.out.println("Date does not exists!!..");
            
        }


    }
    public static boolean isValidate(int day , int month, int year){
        if (month < 1 || month > 12) {
            return false;
        }
        if(day < 1){
            return false;
        }

        if (month == 2) {
            if(isLeapYear(year)){
                return day <= 29;
            }
            return day <= 28;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) { 
            return day <= 30;
        }

        return day <= 31;
    }
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0);
    }
}
