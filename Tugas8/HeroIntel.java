public class HeroIntel extends Hero {
    public 
    String type;

    // Konstruktor
    public HeroIntel(String name, double health) {
        super(name, health);
        this.type = "Intel";
    }

    // Metode display override dari kelas induk
    @Override
    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }
}
