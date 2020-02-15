
import java.util.ArrayList;

public class App {
    public void main(String[] args) {
        TransStrategy airPlane = new AirPlane();
        TransStrategy bus = new Bus();
        TransStrategy train = new Train();
        TransStrategy selfDrive = new SelfDrive();
        Person self = new Person("小明",300);

        ArrayList<TransStrategy> strategies = new ArrayList<>();
        strategies.add(airPlane);
        strategies.add(bus);
        strategies.add(train);
        strategies.add(selfDrive);

        for(TransStrategy method : strategies) {
            if(self.compareCost(method)) {
                System.out.println("可以选择:" + method.getName());
            }
        }
    }
}
