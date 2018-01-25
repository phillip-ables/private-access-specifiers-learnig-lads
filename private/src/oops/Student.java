package oops;

/**
 *
 * @author user
 */
public class Student {
    private String name;
    public int age;
    
    private Student() {
        
    }
    
    public Student(String iname) {
        name = iname;
    }
    
    public void setName(String iname){
        name = iname;
    }
    
    public String getName(){
        return name;
    }
    
    private void doSomething() {
        System.out.println(name+" is doing something");
    }
    
    void introduce(){
        doSomething();
        System.out.println(name+" is "+age);
    }
}