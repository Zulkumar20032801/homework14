public class Dancer extends Person{
    private String groupName;

   public Dancer(){
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
    public void dancing(){
        System.out.println("танцует");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" +getName()+ '\'' +
                ", designation='" + getDesignation() + '\'' +
                "groupName='" + groupName + '\'' +
                '}';
    }

}
