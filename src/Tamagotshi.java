import java.util.Random;

public class Tamagotshi {
    public String name;
    public int age;
    public int energy;
    public String mood;

    public Tamagotshi(String name,int age,int energy,String mood){
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.mood = mood;
    }

public void play() { System.out.println("Tamagotshi is playing");
}

public void feed() { System.out.println("Tamagotshi has been fed food");
    }

public void sleep() {
    int sleep = getRandomNumber(25,1);
        System.out.println("Tamagotshi has slept for "+sleep+" hours");
}

public int getRandomNumber(int max, int min){
    // Nemmere måde at lave et vilkårligt tal
    // https://www.geeksforgeeks.org/generating-random-numbers-in-java/
    Random rand = new Random();
    int randomNumber = rand.nextInt(max - min + 1) + min;
    return randomNumber;
}

public void race() {
    int snailSpeed = getRandomNumber(11,1);
    int lionSpeed = getRandomNumber(30,1);
    if (snailSpeed == lionSpeed) {
        System.out.println("It's a draw!");
    } else if (snailSpeed > lionSpeed) {
        System.out.println("@             _________\t\t *");
        System.out.println(" \\____       /         \\\t\t*- *  * -");
        System.out.println(" /    \\     /   ____    \\\t -* * -");
        System.out.println(" \\_    \\   /   /    \\    \\\t   *- * -");
        System.out.println("   \\    \\ (    \\__/  )    )\t * -*");
        System.out.println("    \\    \\_\\ \\______/    /\t*- *  * -");
        System.out.println("     \\      \\           /___\t -* * -");
        System.out.println("      \\______\\_________/____\"-_");
        System.out.println("Snail has won!");
    } else if (lionSpeed > snailSpeed) {
        System.out.println("\t(\"`___/\")._________/¨¨`-._ \t\t *\t\t");
        System.out.println("\t `ō_ ō  )   `-.   (     ).`-.__./) \t*- *  * -\t");
        System.out.println("\t (=Y=)// / /  / )/ `   `\\ ``\\___/ \t -* * -\t");
        System.out.println("\t   _../-/ /  / _/  /--\\_.\\\t\t*- * -\t\t");
        System.out.println("\t  ((((_/(((_/((((_/  (((__\\\t\t*- *  * -\t");
        System.out.println("Lion has won!");
    }
}

}
