import java.util.ArrayList;
import java.util.List;

public class Team<T extends Student>{
    Teacher prof;
    List<T> student;
    public Team(){
        this.student = new ArrayList<>();
    }
    public void addStudent(T student){
        this.student.add(student);
    }

    public void addTeacher(Teacher prof){
        this.prof = prof;
    }
}
