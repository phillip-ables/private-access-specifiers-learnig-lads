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
    
    private void doSomething() {
        System.out.println(name+"is doing something");
    }
    
    void introduce(){
        System.out.println("name is "+name+" age is "+age);
    }
}