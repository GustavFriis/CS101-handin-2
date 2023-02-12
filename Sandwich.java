public class Sandwich implements Fastfood{
    @Override
    public String location() {
        return "Subway";
    }

    @Override
    public String price() {
        return "Cheaper than average";
    }

    @Override
    public int howManyStores() {
        return 5;
    }
}
