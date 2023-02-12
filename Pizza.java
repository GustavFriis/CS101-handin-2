public class Pizza implements Fastfood{
    @Override
    public String location() {
        return "Domino's";
    }

    @Override
    public String price() {
        return "Price is a bit higher than average";
    }

    @Override
    public int howManyStores() {
        return 20;
    }
}
