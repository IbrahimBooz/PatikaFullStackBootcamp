public class Teacher {
    String name;
    String mpno;
    String branch;


    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }


     void print() {
        System.out.println("Hocanın Adı: " +this.name);
        System.out.println("Hocanın No: " +this.mpno);
        System.out.println("Hoca Dal: " + this.branch);

    }
}