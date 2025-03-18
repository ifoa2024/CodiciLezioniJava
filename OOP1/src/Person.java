public class Person {
    //attributi o proprietà(fields) -> attributi di classe
    public String name;
    public String surname;
    public int age;

    //costruttore
    //Nome del costruttore stesso nome scritto esattamente nello stesso modo
    //riceve dei parametri FORMALI
    //

    public Person(){}

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //metodi(comportamenti)
    public void sayHello(){
        System.out.println("Ciao, sono "+name+" "+surname+" e ho "+age+" anni!");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            //Convero il tipo obj in un oggetto Person
            Person p2 = (Person) obj;

            return this.name == p2.name && this.surname == p2.surname && this.age == p2.age;
        }

        return false;
    }
    
}