public class SelfDrive implements TransStrategy {
    @Override
    public String getName() {
        return "自驾";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
