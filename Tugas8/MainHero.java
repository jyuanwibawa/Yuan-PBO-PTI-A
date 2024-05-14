public class MainHero {
    public static void main(String[] args) {
        // Objek dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();

        // Upcasting
        Hero heroUp = (Hero) hero1;
        heroUp.display();

        
        Hero heroReg = new Hero("Boy", 100);
        heroReg.display();

        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); // Downcasting berhasil

        // HeroAgility hero3 = (HeroAgility) heroUp;
        // hero3.display();

         // no 4 (public dapat diakses)
        // HeroAgility heroAgility = new HeroAgility("HeroAgility", 100);
        // System.out.println("Ini " + heroAgility.type);
        // HeroIntel heroIntel = new HeroIntel("HeroIntel", 100);
        // System.out.println("Ini " + heroIntel.type);

          // no 5
        // HeroMagic heromagic = new HeroMagic("Gatot", 150);
        // heromagic.display();
        // Hero heroMagicUp = (Hero) heromagic;
        // heroMagicUp.display(); // Upcasting
        // HeroMagic heroMagicDown = (HeroMagic) heroMagicUp;
        // heroMagicDown.display(); 

    }
}
