public class Student {
    Course mat;
    Course fizik;
    Course turkce;
    String name, stuNo;
    int classes;

    double sozluNot;

    double avarage;
    boolean isPass;

    double sozluMat;
    double sozluFizik;
    double sozluTurkce;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course turkce) {

        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.turkce = turkce;
        this.classes = classes;
        this.avarage = 0.0;
        this.isPass = false;


    }

    void addBulkExamNote(int matNot, double fizikNot, int turkceNot) {

        if (matNot >= 0 && matNot <= 100) {

            this.mat.note = (fizikNot * 0.8) + (this.sozluNot * 0.2);
        }
        if (fizikNot >= 0 && fizikNot <= 100) {


            this.fizik.note = (fizikNot * 0.8) + (this.sozluNot * 0.2);

        }
        if (turkceNot >= 0 && turkceNot <= 100) {

            this.turkce.note = (fizikNot * 0.8) + (this.sozluNot * 0.2);
        }

    }

    public void calcAva(double sozluMat, double sozluFizik, double sozluTurkce) {
        if (this.sozluMat >= 0 && this.sozluMat <= 100) {
            this.sozluNot = (sozluMat * 0.2);
        }
        if (this.sozluFizik >= 0 && this.sozluFizik <= 100) {
            this.sozluNot = (sozluFizik * 0.2);
        }
        if (this.sozluTurkce >= 0 && this.sozluTurkce <= 100) {
            this.sozluNot = (sozluTurkce * 0.2);
        }
    }


    void isPass() {
        this.avarage = (this.mat.note + this.fizik.note + this.turkce.note) / 3.0;
        if (this.avarage >= 55.0) {
            System.out.println("Sınıfı Geçtiniz ");
            this.isPass = true;
            printNote();
        } else {
            System.out.println("Sınıfta Kaldınız");
            this.isPass = false;
            printNote();
        }

    }

    void printNote() {
        System.out.println(this.mat.name + " " + this.mat.note);
        System.out.println(this.fizik.name + " " + this.fizik.note);
        System.out.println(this.turkce.name + " " + this.turkce.note);
        System.out.println("Ortalamanız: " + this.avarage);


    }


}

