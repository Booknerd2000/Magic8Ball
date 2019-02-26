package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner keyboard;
	keyboard = new Scanner(System.in);
        System.out.println("  _ _   _   __  ___  __   _   _   _             ");
        System.out.println(" | | | |_| | _   |  |    |_| |_| |_||  |        ");
        System.out.println(" |   | | | |__| _|_ |__  |_| |_ || ||__|__      ");
        System.out.println("            ..........            ");
        System.out.println("        ........     .....        ");
        System.out.println("      ......   _____   .....      ");
        System.out.println("     ......   |     |    ....     ");
        System.out.println("    ......    |_____|    .....    ");
        System.out.println("    ......   |       |   .....    ");
        System.out.println("    .......  |       |   .....    ");
        System.out.println("     ....... |_______|  .....     ");
        System.out.println("       ........       .....       ");
        System.out.println("            ..........            ");

	System.out.println("Think of a question and type a number for a response.");
	int userNumber = keyboard.nextInt();

        if(userNumber>=1&&userNumber<=10) {
            System.out.println("OUTLOOK GOOD");
        }
        else if(userNumber>=11&&userNumber<=20) {
            System.out.println("ASK AGAIN LATER");
        }
        else if(userNumber>=21&&userNumber<=30) {
            System.out.println("YES DEFINITELY");
        }
        else if(userNumber>=31&&userNumber<=40) {
            System.out.println("NO");
        }
        else if(userNumber>=41&&userNumber<=50) {
            System.out.println("DON'T COUNT ON IT");
        }
        else if(userNumber>=51&&userNumber<=60) {
            System.out.println("ABSOLUTELY");
        }
        else if(userNumber>=61&&userNumber<=70) {
            System.out.println("MOST LIKELY");
        }
        else if(userNumber>=71&&userNumber<=80) {
            System.out.println("GO FOR IT");
        }
        else if(userNumber>=81&&userNumber<=90) {
            System.out.println("CONCENTRATE AND ASK AGAIN");
        }
        else if(userNumber>=91&&userNumber<=100) {
            System.out.println("MY SOURCES SAY NO");
        }
        else{
            System.out.println("Your number is insufficient. Make sure its a number between 1 and 100.");
    }
    }
}
