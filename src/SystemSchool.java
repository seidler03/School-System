public class SystemSchool {
    public static void main(String[] args) {
        Teacher Teacher = new Teacher("Matheus");
        Teacher teacherJS = new Teacher("Teacher JS");
        Teacher teacherJava = new Teacher("Teacher Java");

        Team english = new Team();
        Team TeamJS = new Team();
        Team TeamJava = new Team();

        Student aline = new Student("Aline");
        Student samuel = new Student("Samuel");
        Student francisco = new Student("Francisco");

        StudentJava StudentJava1 = new StudentJava("João");
        StudentJava StudentJava2 = new StudentJava("Claudia");
        StudentJava StudentJava3 = new StudentJava("Pedro");

        StudentJS StudentJS1 = new StudentJS("StudentJS1");
        StudentJS StudentJS2 = new StudentJS("StudentJS2");
        StudentJS StudentJS3 = new StudentJS("StudentJS3");

        TeamJS.addTeacher(teacherJS);
        TeamJS.addStudent(StudentJS1);
        TeamJS.addStudent(StudentJS2);
        TeamJS.addStudent(StudentJS3);

        TeamJava.addTeacher(teacherJava);
        TeamJava.addStudent(StudentJava1);
        TeamJava.addStudent(StudentJava2);
        TeamJava.addStudent(StudentJava3);

        System.out.println("Team Matemática:\n"+english);
        System.out.println("Team Java:\n"+TeamJava);
        System.out.println("Team JS:\n"+TeamJS);
    }
}
