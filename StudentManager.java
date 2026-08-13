import java.util.ArrayList;
public class StudentManager {
    private ArrayList<Student> students;
    public StudentManager(){
        students=FileManager.loadStudents();
    }
    
    //Add Students 
    public void addStudent(Student student){
        students.add(student);
        FileManager.saveStudents(students);
        System.out.println("Student Added Sucessfully,");
    }
    
    //View Students 
    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No Students Found.");
            return;
        }
        for(Student student: students){
            System.out.println(student);
        }
    }
    //Search students 
    
    public void searchStudent(int id){
        for(Student student : students){
            if(student.getId() == id){
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student Not Found.");
    }
    //Delete Student 
    
    public void deleteStudent(int id){
        for(int i=0; i<students.size();i++){
            if(students.get(i).getId()==id){
                students.remove(i);
                FileManager.saveStudents(students);
                System.out.println("Student Deleted Successfully.");
                return;
            }
        }
        System.out.println("Student not Found.");
    }
}
