public class Student{
    private int id;
    private String name;
    private int age;
    
    //Constructor
    Student(int id,String name,int age){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    
    //Setter Functions 
    public void setId(int id){
        this.id=id;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    
    //Getter Functions
    public int getId(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.id + "," +name + "," +age;
    }
}