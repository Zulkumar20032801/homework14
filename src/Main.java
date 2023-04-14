public class Main {
    public static void main(String[] args) {
//    Cat cat=new Cat("fgtyuj",6);
//    Kitty kitty=new Kitty("dgg",3,"fgg");
//        System.out.println(cat.getName());
//        System.out.println(cat.getWeight());
//
//        System.out.println(cat);
//        System.out.println(kitty);

//

        Person person=new Person("имя","специалист");

        Programmer programmer=new Programmer("Джеймс Гослинг","программист","Sun Microsystems");
        Dancer dancer=new Dancer("Лиза","танцовшица","ds crew");
        Singer singer=new Singer("A.Z","певец","Ninety one");

        System.out.println(person);
        person.learn();person.walk();person.eat();
        System.out.println(programmer);
        programmer.learn();programmer.walk();programmer.eat();programmer.coding();
        System.out.println(dancer);
        dancer.learn();dancer.walk();dancer.eat();dancer.dancing();
        System.out.println(singer);
        singer.learn();singer.walk();singer.eat();singer.singing();singer.playGuitar();

    }
}