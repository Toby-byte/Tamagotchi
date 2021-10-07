public class Snail extends Tamagotshi{
    private int speed;

    public Snail(String name, int age, int energy, String mood, int speed) {
        super(name, age, energy, mood);
        this.speed = speed;
        drawSnail();
    }

    @Override
    public void play() {
        System.out.println(this.name+" is going at "+this.speed+" km/t");
    }

    public void drawSnail() {
        System.out.println("@             _________");
        System.out.println(" \\____       /         \\");
        System.out.println(" /    \\     /   ____    \\");
        System.out.println(" \\_    \\   /   /    \\    \\");
        System.out.println("   \\    \\ (    \\__/  )    )");
        System.out.println("    \\    \\_\\ \\______/    /");
        System.out.println("     \\      \\           /___");
        System.out.println("      \\______\\_________/____\"-_");
    }

    public String getSnailName() {
        return this.name;
    }
}
