import java.io.*;
import java.util.ArrayList;
public class FileManager{
    private static final String FILE_NAME = "student.txt";
    
    //save all student to file 
    public static void saveStudents(ArrayList<Student> students){
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter(FILE_NAME));
            for(Student student : students){
                writer.write(student.toString());
                writer.newLine();
            }
            System.out.println("Students Saved Successfully.");
        }
        catch(Exception e){
            System.out.println("Error while saving students.");
            e.printStackTrace();
        }
        finally {
            try{
                if(writer!=null){
                    writer.close();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    //Load students from file 
    
    public static ArrayList<Student> loadStudents(){
        ArrayList<Student> students = new ArrayList<>();
        BufferedReader reader = null;
        try{
            File file = new File(FILE_NAME);
            if(!file.exists()){
            return students;
            }
            reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            
            while((line=reader.readLine())!=null){
                String[] data = line.split(",");
                
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                
                Student student = new Student(id,name,age);
                students.add(student);
            }
        }
            catch(IOException e){
                System.out.println("Error While reading students.");
                e.printStackTrace();
            }
            finally{
                try{
                    if(reader!=null){
                        reader.close();
                    }
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            
        return students;
        
    }
}