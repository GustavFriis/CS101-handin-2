public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(84, true, "iPhone", false);

        Laptop laptop = new Laptop(70, true, "HP", false);

        Fastfood[] fastfoods = new Fastfood[3];
        fastfoods[0] = new Kebab();
        fastfoods[1] = new Sandwich();
        fastfoods[2] = new Pizza();
        for (Fastfood fastfood : fastfoods){
            System.out.println("Location: " + fastfood.location());
            System.out.println("Price range: " + fastfood.price());
            System.out.println("Amount of restaurants: " + fastfood.howManyStores());
        }

        RapSong nsRap = new NewSchoolRap();
        nsRap.play();

        RapSong osRap = new OldSchoolRap();
        osRap.play();

        RapSong rapSong = new RapSong();
        rapSong.play();
    }

}
