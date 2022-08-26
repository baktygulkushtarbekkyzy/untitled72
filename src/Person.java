import java.util.Scanner;

public class Person {
    private  long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String phonNumber;

    public Person(int age,String email,String phonNumber,long id,String firstName,String lastName){
        if (age>0 && age<110){
            this.age=age;
        }else {
            System.out.println("Ters san beruugo bolboit ");
        }
        if (email.contains("@")){
            this.email=email;
        }else{
            System.out.println("@ жок кайрадан текшериниз ");
        }
        if (phonNumber.contains("+996")){
            this.phonNumber = phonNumber;
        }else {
            System.out.println("Kyrgyz nomer beriniz");
        }
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }


    public void work(){
        Scanner scanner=new Scanner(System.in);
        firstName= scanner.nextLine();
        System.out.println(firstName+"Кайсы жумушта иштейт ");
    }
    public void timetable(){
        System.out.println("Bir jumalyk grafigi:" +
                "Ponedelnik ishteit" +
                "Btornik ishteit" +
                "Sreda ishteit" +
                "Vtornik ishteit" +
                "Chetverg ishteit " +
                "Pyatnitsa ishteit " +
                "Subbota ishtebeit " +
                "Voskresenya ishtebeit ");




    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phonNumber='" + phonNumber + '\'' +
                '}';
    }
}
