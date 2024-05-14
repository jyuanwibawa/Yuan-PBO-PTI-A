public class HeroAgility extends Hero {
    public 
    String type;

    // Konstruktor
    public HeroAgility(String name, double health) {
        super(name, health);
        this.type = "Agility";
    }

    // Metode display override dari kelas induk
    @Override
    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }
}
