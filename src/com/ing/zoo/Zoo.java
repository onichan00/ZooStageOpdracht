package com.ing.zoo;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Bird bert = new Bird();
        bert.name = "bert";
        Sheep bob = new Sheep();
        bob.name = "bob";

        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.print("Voer uw command in: ");

            input = scanner.nextLine();
            if(input.equals(commands[0] + " henk")) {
                henk.sayHello();

            } else if (input.equals(commands[0] +" elsa")) {
                elsa.sayHello();

            }else if (input.equals(commands[0] +" dora")) {
                dora.sayHello();

            }else if (input.equals(commands[0] +" wally")) {
                wally.sayHello();

            }else if (input.equals(commands[0] +" marty")) {
                marty.sayHello();

            }else if (input.equals(commands[0] +" bert")) {
                bert.sayHello();

            }else if (input.equals(commands[0] +" bob")) {
                bob.sayHello();

            }else if (input.equals(commands[0])) {
                henk.sayHello();
                elsa.sayHello();
                dora.sayHello();
                wally.sayHello();
                marty.sayHello();
                bert.sayHello();
                bob.sayHello();

            }else if (input.equals(commands[1])){
                marty.eatLeaves();
                elsa.eatLeaves();
                dora.eatLeaves();
                bert.eatLeaves();
                bob.eatLeaves();

            }else if (input.equals(commands[2])){
                henk.eatMeat();
                dora.eatMeat();
                wally.eatMeat();
                bert.eatMeat();

            }else if (input.equals(commands[3])) {
                dora.performTrick();
                wally.performTrick();
                bob.performTrick();

            }else if (input.equals("q")) {
                System.out.println("Quitting....");
            }else {
                System.out.println("Unknown command: " + input);
            }
        }while (!input.equals("q"));

    }
}