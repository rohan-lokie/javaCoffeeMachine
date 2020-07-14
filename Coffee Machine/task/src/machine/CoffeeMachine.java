package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int water=400,milk=540,beans=120,cups=9,money=550;
        int d=0;
        while(d==0) {
            System.out.println("Write action (buy, fill, take, remaining, exit) :");
            String choice1=sc.nextLine();
            switch (choice1) {
                case "buy":
                    System.out.println("What do you want to buy? 1-espresso, 2-latte, 3-cappuccino, back to main menu:");
                    String choice2 = sc.nextLine();
                    switch (choice2) {
                        case "1":
                            if (water >= 250 && beans >= 16) {
                                water -= 250;
                                beans -= 16;
                                money += 4;
                                cups--;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            break;
                        case "2":
                            if (water >= 350 && milk >= 75 && beans >= 20) {
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                money += 7;
                                cups--;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            break ;
                        case "3":
                            if (water >= 200 && milk >= 100 && beans >= 12) {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                money += 6;
                                cups--;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            break ;
                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    int water1, milk1, beans1, cups1;
                    System.out.println("Write how many ml of water do you want to add:");
                    water1 = sc.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk1 = sc.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans1 = sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups1 = sc.nextInt();
                    sc.nextLine();
                    water += water1;
                    milk += milk1;
                    beans += beans1;
                    cups += cups1;
                    break ;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break ;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water\n" + milk + " of milk\n" + beans + " of coffee beans\n" + cups + " of disposable cups\n$" + money + " of money");
                    break ;
                case "exit":
                    d++;
                    break;
            }
        }
    }
}