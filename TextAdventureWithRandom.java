
import java.util.*;
import java.util.Random;

public class TextAdventureWithRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int health = 100;

        System.out.println("Welcome to Forest Adventure!");
        System.out.println("You have " + health + " health points.");
        System.out.println("You are an adventurer wandering though a dark forest.");
        System.out.println("You come across two paths. One lead to village, thr other to a cave.");
        System.out.println("Which path do you want to take?(Type 'Village' or 'Cave' )");
        String choice1=sc.nextLine();

        if(choice1.equals("Village")) {
            System.out.println("You walked towards village.It's quiet and seem abandoned");
            System.out.println("You see a strange figure in the distance. Do you approach it or hide? (Type 'approach' or 'hide' )");
            String choice2=sc.nextLine();

            if(choice2.equals("approach")){
                System.out.println("You approach the figure...");

                if(rand.nextBoolean()){
                    System.out.println("The figure is a friendly old man who helps you. You survive!");
                    health+=20;
                }else{
                    System.out.println("The figure turns out to be a bandit, and you are captured. Game over!");
                    health-=30;
                }
//                System.out.println("You approach the figure. It turns out to be a friendly old man who gives you food and directions. You survive!");

            }else if(choice2.equals("hide")){
                System.out.println("You hide behind a tree, but the figure spots you. It's a bandit, and you are captured.");
                System.out.println("Game over!");
                health-=20;
            } else{
                System.out.println("Invalid choice. Game over.");
                health-=10;
            }
        }else if(choice1.equals("Cave")) {
            System.out.println("You cautiously enter the dark cave. Inside, you hear strange noises.");
            System.out.println("Do you explore deeper or leave the cave? (Type 'explore' or 'leave')");
            String choice2=sc.nextLine();

            if(choice2.equals("explore")){
                System.out.println("You explore deeper into the cave and find hidden treasure. You win!");
                health+=50;
            }else if(choice2.equals("leave")){
                System.out.println("You leave the cave and return to the forest, but a wild animal attacks you. Game over!");
                health-=40;
            }else{
                System.out.println("Invalid choice. Game over.");
                health-=10;
            }
        }else{
            System.out.println("Invalid choice. Game over.");
            health-=10;
        }
        if (health <= 0) {
            System.out.println("Your health has dropped to zero. Game over!");
        } else {
            System.out.println("You finished the game with " + health + " health points. Well done!");
        }

        sc.close();
    }
}
