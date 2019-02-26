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

	System.out.println("Think of a question and type a number to shake the ball.");
	int userNumber = keyboard.nextInt();

        System.out.println("            ..........            ");
        System.out.println("        ..................        ");
        System.out.println("      ..........    ........      ");
        System.out.println("     .......           ......     ");
        System.out.println("    .......             ......    ");

        if(userNumber>=1&&userNumber<=10) {
            System.out.println("    ...... OUTLOOK GOOD  .....    ");
            System.out.println("    .......              .....    ");
            System.out.println("     .......            .....     ");
            System.out.println("       ..........    ......       ");
            System.out.println("            ..........            ");
        }
        else if(userNumber>=11&&userNumber<=20) {
            System.out.println("    ......    ASK AGAIN  .....    ");
            System.out.println("    .......     LATER    .....    ");
            System.out.println("     .......            .....     ");
            System.out.println("       ..........    ......       ");
            System.out.println("            ..........            ");
        }
        else if(userNumber>=21&&userNumber<=30) {
            System.out.println("    ...... YES DEFINITELY.....    ");
            System.out.println("    .......              .....    ");
            System.out.println("     .......            .....     ");
            System.out.println("       ..........    ......       ");
            System.out.println("            ..........            ");
        }
        else if(userNumber>=31&&userNumber<=40) {
            System.out.println("    ......       NO      .....    ");
            System.out.println("    .......              .....    ");
            System.out.println("     .......            .....     ");
            System.out.println("       ..........    ......       ");
            System.out.println("            ..........            ");
        }
        else if(userNumber>=41&&userNumber<=50) {
            System.out.println("    ......   DON'T COUNT .....    ");
            System.out.println("    .......     ON IT    .....    ");
            System.out.println("     .......            .....     ");
            System.out.println("       ..........    ......       ");
            System.out.println("            ..........            ");
        }
        else if(userNumber>=51&&userNumber<=60) {
            System.out.println("    ......   ABSOLUTELY  .....    ");
            System.out.println("    .......              .....    ");
            System.out.println("     .......            .....     ");
            System.out.println("       ..........    ......       ");
            System.out.println("            ..........            ");
        }
        else if(userNumber>=61&&userNumber<=70) {
            System.out.println("    ......   MOST LIKELY .....    ");
            System.out.println("    .......              .....    ");
            System.out.println("     .......            .....     ");
            System.out.println("       ..........    ......       ");
            System.out.println("            ..........            ");
        }
        else if(userNumber>=71&&userNumber<=80) {
            System.out.println("    ......   GO FOR IT   .....    ");
            System.out.println("    .......              .....    ");
            System.out.println("     .......            .....     ");
            System.out.println("       ..........    ......       ");
            System.out.println("            ..........            ");
        }
        else if(userNumber>=81&&userNumber<=90) {
            System.out.println("    ......  CONCENTRATE  .....    ");
            System.out.println("    .......      AND     .....    ");
            System.out.println("     ....... ASK AGAIN  .....     ");
            System.out.println("       ..........    ......       ");
            System.out.println("            ..........            ");
        }
        else if(userNumber>=91&&userNumber<=100) {
            System.out.println("    ......   MY SOURCES  .....    ");
            System.out.println("    .......    SAY NO    .....    ");
            System.out.println("     .......            .....     ");
            System.out.println("       ..........    ......       ");
            System.out.println("            ..........            ");
        }
        else{
            System.out.println("You broke the Magic 8 Ball. Make sure its a number between 1 and 100.");
    }
    }
}
