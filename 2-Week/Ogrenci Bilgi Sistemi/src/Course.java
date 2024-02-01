public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note ;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;


    }

    void addTeacher(Teacher teacher){
    this.teacher=teacher;
   if(teacher.branch.equals(this.prefix)){
       printTeacher();
   }
    else {
       System.out.print("Hocamız o dersi vermemektedir.");
   }
    }

    void printTeacher() {
        this.teacher.print();
    }

}