public class AirPlane implements TransStrategy {
    @Override
    public String getName() {
        return "飞机";
    }

    @Override
    public int getCost() {
        return 1000;
    }
}
