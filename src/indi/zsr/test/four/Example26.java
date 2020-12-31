package indi.zsr.test.four;

@FunctionalInterface
interface  PersonBuilder{
    Person buildPerson(String name);
}
class Person{
    private String Name;
    public  Person(String Name){
        this.Name=Name;
    }
    public  String getName(){
        return this.Name;
    }

}
public interface Example26 {
    public static void printName(String name,PersonBuilder personBuilder){
        System.out.println(personBuilder.buildPerson(name).getName());
    }

    public static void main(String[] args) {
        //正常
        printName("某某某", new PersonBuilder() {
            @Override
            public Person buildPerson(String name) {
                return new Person(name);
            }
        });
        //使用lambda表达式
        printName("某某某",name->new Person(name));
        //使用构造器引用的方式
        printName("某某某",Person::new);
    }
}
