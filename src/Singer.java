public class Singer extends Person{
    private  String bandName;

    public Singer() {
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void learn(){
        System.out.println("учиться");
    }
    public void walk(){
        System.out.println("ходить");
    }
    public void eat(){
        System.out.println("есть");
    }
    public void singing(){
        System.out.println("поет");
    }
    public void playGuitar(){System.out.println("играет в гитаре");}

    @Override
    public String toString() {
        return "Person{" +
                "name='" +getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
