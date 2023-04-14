public class Kitty extends Cat{
private String bread;


    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
    public Kitty(String name, int weight,String bread) {
        super(name,weight);
        this.bread=bread;
    }
    @Override
    public String toString() {
        return "Kitty{" +
                ",name='" + getName() + '\'' +
                ", weight=" +getWeight() +
                "bread='" + bread + '\'' +
                '}';
    }
}
