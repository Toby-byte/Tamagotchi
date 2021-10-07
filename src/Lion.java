public class Lion extends Tamagotshi {
    private String furColor;

    public Lion(String name, int age, int energy, String mood, String furColor) {
        super(name, age, energy, mood);
        this.furColor = furColor;
        drawLion();
    }

    public void drawLion() {
        System.out.println("\t(\"`___/\")._________/¨¨`-._ \t\t");
        System.out.println("\t `ō_ ō  )   `-.   (     ).`-.__./) \t");
        System.out.println("\t (=Y=)// / /  / )/ `   `\\ ``\\___/ \t");
        System.out.println("\t   _../-/ /  / _/  /--\\_.\\\t\t");
        System.out.println("\t  ((((_/(((_/((((_/  (((__\\\t\t");
    }
  @Override
    public void play() {
      System.out.println(this.name+" is playing violently and kills "+getRandomNumber(100,1)+" antelopes");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "furColor='" + furColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", energy=" + energy +
                ", mood='" + mood + '\'' +
                '}';
    }
}
