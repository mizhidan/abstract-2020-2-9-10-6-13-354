public class Bus implements TransStrategy {
    @Override
    public String getName() {
        return "大巴车";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
