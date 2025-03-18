public class Teacher extends Person{
    private String subject;

    public Teacher(String name, String surname, int age, String subject) {
        super(name, surname, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject, String psw) {

        if(psw == "12345678"){
            this.subject = subject;
        }
    }

    public void sayHello(){
        System.out.println("Ciao, sono "+name+" "+surname+" e insegno "+subject+"!");
    }
}
