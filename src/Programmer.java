public class Programmer extends Person{
    private String companyName;


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void learn(){
        System.out.print("учиться ");
    }
    public void walk(){
        System.out.println("ходить");
    }
    public void eat(){
        System.out.println("есть");
    }
    public void coding(){
        System.out.println("пишет код");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='"  +getName() +'\'' +
                ", designation='" + getDesignation() + '\'' +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
