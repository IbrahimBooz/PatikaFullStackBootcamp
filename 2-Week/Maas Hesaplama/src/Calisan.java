public class Calisan {
    String name;
    String surname;
    double salary;
    int workHours;
    int hireYear;
    int mesai = 30;
    int mesaiUcreti;
    double tax;

    Calisan(String name, String surname, int salary, int workHours, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }


    void tax() {
        if (this.salary > 1000) {
            this.tax = (this.salary * 0.03);
            System.out.println("Vergi: " + this.tax);
            this.salary = (this.salary * 0.97);
            System.out.println("Vergi Düşüldüğünde Maaş: " + this.salary);

        } else {
            System.out.println("Maaşınız: " + (this.salary + this.mesaiUcreti));

        }

    }

    void bonus() {
        System.out.println("Çalışma Saati: " + this.workHours);
        if (this.workHours > 40) {
            this.mesaiUcreti = (this.workHours - 40) * this.mesai;
            System.out.println("Mesai Ücreti: " + this.mesaiUcreti);

        }

    }

    void raiseSalary() {
        if (this.hireYear > 9 && this.hireYear < 20) {
            this.salary = (int) (this.salary * 1.1);
            System.out.println(this.hireYear + " Çalıştığın için Zamlı Maaşın: " + this.salary);

        }
        if (this.hireYear > 19) {
            this.salary = (int) (this.salary * 1.15);
            System.out.println(this.hireYear + " Çalıştığın için Zamlı Maaşın: " + this.salary);

        }
        if (this.hireYear < 10) {
            this.salary = (int) (this.salary * 1.05);
            System.out.println(this.hireYear + " Çalıştığın için Zamlı Maaşın: " + this.salary);

        }
    }

    void printInfo() {
        System.out.println("İsminiz: " + this.name);
        System.out.println("Soyisminiz: " + this.surname);
    }

    public String toString() {
        System.out.println("=====================");
        printInfo();
        System.out.println("Normal Maaşın: " + this.salary);

        raiseSalary();
        bonus();
        tax();

        return null;
    }
}
