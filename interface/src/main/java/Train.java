public class Train implements TransStrategy {
    @Override
    public String getName() {
        return "火车";
    }

    @Override
    public int getCost() {
        return 400;
    }

}
