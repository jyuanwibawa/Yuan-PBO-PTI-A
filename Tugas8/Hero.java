public class Hero {
    private String name;
    private double health;
    
    // Konstruktor
    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }
    
    // Getter
    public double getHealth() {
        return this.health;
    }
    
    public String getName() {
        return this.name;
    }
    
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    
    public void setHealth(double health) {
        this.health = health;
    }
    
    // Metode umum
    public void display() {
        System.out.println(this.name + " is a regular hero.");
    }
}
