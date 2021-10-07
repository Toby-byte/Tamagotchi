import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Game {
    // For at få en global scanner kan man lave den public.
    // Derefter bruge syntaksen "this.scanner" når man skal bruge den .
    public Scanner scanner = new Scanner(System.in);

    public int getRandomNumber(int max, int min){
        Random rand = new Random();
        int randomNumber = rand.nextInt(max - min + 1) + min;
        return randomNumber;
    }

    public Lion getLion() {
        System.out.println("Hello and welcome Snail and lion tamagotshi simulator!");
        System.out.println("\nnow, please give a name to the lion");
        String lionName = this.scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("how old is "+lionName+"?");
        // Denne løsning er brugt for at undgå scannerbug, scanner.nextInt er problematisk
        String lionAge = this.scanner.nextLine();
        int age = Integer.parseInt(lionAge);
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        Lion lion = new Lion(lionName,age,100,"recless","orange");
        System.out.println("Hello! "+lion.name+" is here!");
        return lion;
    }

    public Snail getSnail() {
        System.out.println("\nNow, please give a name to the snail");
        String snailName = this.scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("how old is "+snailName+"?");
        // Denne løsning er brugt for at undgå scannerbug, scanner.nextInt er problematisk
        String snailAge = this.scanner.nextLine();
        int age = Integer.parseInt(snailAge);
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        Snail snail = new Snail(snailName,age,50,"happy",getRandomNumber(100,1));
        System.out.println("Hello! "+snail.name+" is here!\n");

        return snail;
    }

    public static void main(String[] args) {
        // her bruges en ekstra scanner kun til main metoden
        Scanner scanner = new Scanner(System.in);

        Game game = new Game();
        Lion lion = game.getLion();
        Snail snail = game.getSnail();

        System.out.println("do you want to play with "+lion.name+" or "+snail.name+"?");
        String userChoice = scanner.nextLine().toLowerCase(Locale.ROOT);
        if (userChoice.equals(lion.name)) {
            lion.drawLion();

            boolean run = true;
            while(run) {
                System.out.println("do you want " + lion.name + " to play, sleep, feed or race against "+snail.name+"? choose 1, 2, 3 or 4");
                System.out.println("type exit to exit game");
                String userAnswer = scanner.nextLine();
                // brug .equals i stedet for java lang til at sammenligne med.
                if (userAnswer.equals("1")) {
                    lion.play();
                } else if (userAnswer.equals("2")) {
                    lion.sleep();
                } else if (userAnswer.equals("3")) {
                    lion.feed();
                }else if (userAnswer.equals("4")) {
                    lion.race();
                } else if (userAnswer.equals("exit")) {
                    // Når man laver et while loop, for at komme ud af det enten at bruge return
                    // eller lave en variabel uden for while som kan ændre i sit while loop
                    run = false;
                }
            }

        } else if (userChoice.equals(snail.name)) {
            snail.drawSnail();
            boolean run = true;
            while(run) {
                System.out.println("do you want " + snail.name + " to play, sleep, feed or race against "+lion.name+"? choose 1, 2, 3 or 4");
                String userAnswer = scanner.nextLine();
                // brug .equals i stedet for java lang til at sammenligne med.
                if (userAnswer.equals("1")) {
                    snail.play();
                } else if (userAnswer.equals("2")) {
                    snail.sleep();
                } else if (userAnswer.equals("3")) {
                    snail.feed();
                } else if (userAnswer.equals("4")) {
                    snail.race();
                } else if (userAnswer.equals("exit")) {
                    run = false;
                }
            }
        }
    }
}
