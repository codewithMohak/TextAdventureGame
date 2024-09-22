
import java.util.*;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Forest Adventure!");
        System.out.println("You are an adventurer wandering though a dark forest.");
        System.out.println("You come across two paths. One lead to village, thr other to a cave.");
        System.out.println("Which path do you want to take?(Type 'Village' or 'Cave' )");
        String choice1=sc.nextLine();

        if(choice1.equals("Village")) {
            System.out.println("You walked towards village.It's quiet and seem abandoned");
            System.out.println("You see a strange figure in the distance. Do you approach it or hide? (Type 'approach' or 'hide' )");
            String choice2=sc.nextLine();

            if(choice2.equals("approach")){
                System.out.println("You approach the figure. It turns out to be a friendly old man who gives you food and directions. You survive!");
            }else if(choice2.equals("hide")){
                System.out.println("You hide behind a tree, but the figure spots you. It's a bandit, and you are captured. Game over!");
            } else{
                System.out.println("Invalid choice. Game over.");
            }
        }else if(choice1.equals("Cave")) {
            System.out.println("You cautiously enter the dark cave. Inside, you hear strange noises.");
            System.out.println("Do you explore deeper or leave the cave? (Type 'explore' or 'leave')");
            String choice2=sc.nextLine();

            if(choice2.equals("explore")){
                System.out.println("You explore deeper into the cave and find hidden treasure. You win!");
            }else if(choice2.equals("leave")){
                System.out.println("You leave the cave and return to the forest, but a wild animal attacks you. Game over!");
            }else{
                System.out.println("Invalid choice. Game over.");
            }
        }else{
            System.out.println("Invalid choice. Game over.");
        }
        sc.close();
    }
}
