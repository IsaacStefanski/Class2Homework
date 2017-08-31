package class2homework;

/**
 *
 * @author Isaac
 */
public class Class2Homework {
    public static void main(String [] args){
        
        //create Person objects
        Person johnObject = new Person();
        Person maryObject = new Person();
        
        //manipulate data
        johnObject.setFirstName("John");
        johnObject.setLastName("Smith");
        johnObject.setAge(43);
        
        maryObject.setFirstName("Mary");
        maryObject.setLastName("Johnson");
        maryObject.setAge(40);
        
        //output
        System.out.println("Name: " + johnObject.getFirstName() + " " + johnObject.getLastName() + " Age: " + johnObject.getAge());
        System.out.println("Name: " + maryObject.getFirstName() + " " + maryObject.getLastName() + " Age: " + maryObject.getAge());
    }
}