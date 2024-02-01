

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("ibrahim", "555", "FZK");
        Teacher t2 = new Teacher("Mamii", "55521234", "MAT");
        Teacher t3 = new Teacher("Mamii", "55521234", "TRK");


        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FİZ101", "FİZ");
        Course turkce = new Course("Turkce", "TUR101", "TRK");

        Student s1 = new Student("Mahmut", 3, "1234", mat, fizik, turkce);
        Student s2 = new Student("Ahmet", 3, "123324", mat, fizik, turkce);
        Student s3 = new Student("Hamza", 3, "112234", mat, fizik, turkce);
        s1.calcAva(100, 100, 100);
        s1.addBulkExamNote(10, 10, 10);
        s1.isPass();
        t1.print();
        mat.addTeacher(t3);


    }
}
