/* 
--------------------------------------------------------
        Java Object Oriented Programming Example
--------------------------------------------------------
*/

// Java objects are made of classes.
public class oop
{
    // Variables set within the class will become the object's attributes.
    int objectIntegerAttribute;
    double objectDoubleAttribute;
    String objectStringAttribute;

    // Functions set within the class will become the object's methods.
    public void greeting()
    {
        System.out.println("Hello world");
    }
}

// Class for the main application.
class application
{   
    // Main application method.
    public static void main(String[] args)
    {
        // New objects are created with the class name, object name and the "new" keyword.
        oop object = new oop();
        // Object methods and attributes can be accessed with the object name dot attribute or method name.
        object.greeting();
    }
}
