public class Student extends Person{
    public int average;

    public Student(String name, String surname, int age, int average) {
        super(name, surname, age);
        this.average = average;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void sayHelloStudent() {
        System.out.println("Ciao, sono "+name+" "+surname+" e ho "+age+" anni e la mia media e' "+average+"!");
    }
    
}
