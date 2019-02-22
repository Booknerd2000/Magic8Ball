package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner keyboard;
	keyboard = new Scanner(System.in);

	System.out.println("think of a question and type a number");
	int userNumber = keyboard.nextInt();

        if(userNumber>=1&&userNumber<=10) {
            System.out.println("OUT LOOK GOOD");
        }
        if(userNumber>=11&&userNumber<=20) {
            System.out.println("ASK AGAIN LATER");
        }
        if(userNumber>=21&&userNumber<=30) {
            System.out.println("YES DEFINITELY");
        }
        if(userNumber>=31&&userNumber<=40) {
            System.out.println("NO");
        }
        if(userNumber>=41&&userNumber<=50) {
            System.out.println("DON'T COUNT ON IT");
        }
        if(userNumber>=51&&userNumber<=60) {
            System.out.println("ABSOLUTELY");
        }
        if(userNumber>=61&&userNumber<=70) {
            System.out.println("MOST LIKELY");
        }
        if(userNumber>=71&&userNumber<=80) {
            System.out.println("GO FOR IT");
        }
        if(userNumber>=81&&userNumber<=90) {
            System.out.println("CONCENTRATE AND ASK AGAIN");
        }
        if(userNumber>=91&&userNumber<=100) {
            System.out.println("MY SOURCES SAY NO");
        }
        
        else{
            System.out.println("Type a number between 1 and 100");
    }
    }
}
