public class Person {
    int money;
    String name;

    public Person() {

    }

    public Person(String name,int money) {
        this.name = name;
        this.money = money;
    }

    public Boolean compareCost(TransStrategy transStrategy) {
        return transStrategy.getCost() <= money;
    }

}
