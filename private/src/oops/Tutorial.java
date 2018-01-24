package oops;

/**
 *
 * @author user
 */
public class Tutorial {
    public static void main(String[] args) {
        Student phil = new Student();
        phil.setName("Phil");
        phil.age = 23;
        phil.getName();
        System.out.println(phil.getName());
        phil.introduce();
    }
}
