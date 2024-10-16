public class Main {
    public static void main(String[] args) {
        Manager mrg = new Manager("batony",231, true);
        System.out.println(Manager.dzial);
        System.out.println(Manager.liczba_podwladnych);
        System.out.println(Manager.status_zalogowania);

    }
}

class Employee{
    public static String name;
    public static String surname;
    public static String position;
    public static int age;
    public static String email;

    public Employee(String name, String surname, String position, int age, String email){
        this.name = "bob";
        this.surname = "brzezcyszczykiewicz";
        this.age = 10;
        this.email = "bobbrz@gmail.com";
    }

    static void logowanie_do_systemu() {
        System.out.println("logowanie do systemu");
    }
    static void pracuje() {
        System.out.println("pracuje");
    }
    static void zakanczanie_pracy() {
        System.out.println("zakanzcanie pracy");
    }
}

class Manager extends Employee{
    public static String dzial;
    public static int liczba_podwladnych;
    public static boolean status_zalogowania;

    public Manager(String dzial, int liczba_podwladnych, boolean status_zalogowania){
        super(name, surname,position,age,email);
        this.dzial = "batony";
        this.liczba_podwladnych = 231;
        this.status_zalogowania = true;
    }

    static void przydzielanie_zadania() {
        System.out.println("przydzielanie zadania");
    }
    static void przegladanie_raportow() {
        System.out.println("przegladanie raportow");
    }

    static void dane_managera() {
        System.out.println(dzial);
        System.out.println(liczba_podwladnych);
        System.out.println(status_zalogowania);
    }
}























