/*To buy an air ticket, input the regular price, month and seat type,output the final price;
  from May to Oct., first-class seat has a [-10%] discount, eco-class [-15%]
  from Nov. to Apr, first-class [-30%] and eco-class [-35%]*/

import java.util.Scanner;

public class airplane_tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regular price of ticket");
        int ticket = sc.nextInt();
        System.out.println("Enter the month");
        int month = sc.nextInt();
        System.out.println("Enter 0 for first-class or 1 for eco-class");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            ticket = getTicket(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            ticket = getTicket(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("Wrong month number");
        }

        System.out.println(ticket);
    }



private static int getTicket(int ticket, int seat, double v1, double v2) {
        if (seat == 0) {
            ticket = (int) (ticket * v1);
        } else if (seat == 1) {
            ticket = (int) (ticket * v2);
        } else {
            System.out.println("No seats available");
        }
        return ticket;
    }
}


