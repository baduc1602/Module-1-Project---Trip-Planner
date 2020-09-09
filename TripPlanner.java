import java.text.DecimalFormat;
import java.util.*;
import java.text.DateFormat;

public class TripPlanner {
    public static DecimalFormat d1 = new DecimalFormat("#.0");
    public static DecimalFormat d2 = new DecimalFormat("#.00");
    public static  Scanner input = new Scanner(System.in);
    public static void main (String []args){
       greeting();
       travelTimeAndBudget();
       timeDifference();
       countryArea();
    }

    public static void greeting(){
        System.out.println("Welcome to Vation Planner!");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("Nice to meet you Kasey Champion, where are you travelling to? ");
        String city = input.next();
        System.out.println("Great! Mexico city sounds like a great trip");
        for (int i =0; i<12;i++) System.out.print("*");
        for (int i =0; i<2; i++) System.out.println();
    }

    public static void travelTimeAndBudget(){
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.print("How many MXC are there in 1 USD? ");
        double pro = input.nextDouble();
        for (int i =0; i<2; i++) System.out.println();

        System.out.println("If you are travelling for "+ days + " that is the same as "+(days*24)+" hours or "+ (days*24*60)+ " minutes");
        System.out.println("If you are going to spend $"+d1.format(money)+" USD that means per day you can spend up to $"+d2.format(money/days)+ " USD");
        System.out.println("Your total budget in "+symbol+ "is "+(d1.format(money*pro)+ " "+symbol+", which per day is "+d2.format(money*pro/days)+" "+symbol));
        for (int i =0; i<12;i++) System.out.print("*");
        for (int i =0; i<2; i++) System.out.println();
    }

    public static void timeDifference(){
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        float time = input.nextFloat();
        double minute;
        minute = time- Math.floor(time);
        if (minute==0){
            System.out.print("That means that when it is midnight at home it will be "+(int)Math.floor(time)+":00"+" in your travel destination and " +
                    "when it is noon at home it will be "+((int)Math.floor(time)+12)+":00");
            System.out.println();
            for (int i =0; i<12;i++) System.out.print("*");
            for (int i =0; i<2; i++) System.out.println();
        } else {
        System.out.print("That means that when it is midnight at home it will be "+(int)Math.floor(time)+":"+(int)(minute*60)+" in your travel destination and " +
                "when it is noon at home it will be "+((int)Math.floor(time)+12)+":"+(int)(minute*60));
        System.out.println();
        for (int i =0; i<12;i++) System.out.print("*");
        for (int i =0; i<2; i++) System.out.println();
    }
    }

    public static void countryArea(){
        System.out.print("What is the square area of your destination country in km2? ");
        float km2 = input.nextFloat();
        System.out.print("In miles2 that is "+d1.format(km2/2.59));
        System.out.println();
        for (int i =0; i<12;i++) System.out.print("*");
        for (int i =0; i<2; i++) System.out.println();
    }
}
