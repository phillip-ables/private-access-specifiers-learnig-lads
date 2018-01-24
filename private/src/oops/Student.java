package oops;

/**
 *
 * @author user
 */
public class Student {
    private String name;
    public int age;
    
    public void setName(String iname){
        name = iname;
    }
    
    public String getName(){
        return name;
    }
    
    void introduce(){
        System.out.println("name is "+name+" age is "+age);
    }
}