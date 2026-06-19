/* 
 -------------------------------------------------------------------------------
    This is a Java language coding reference cheatsheet console application.
 -------------------------------------------------------------------------------
*/

/*
 * TO DO
 * Write up cheatsheet as a console application with a menu to select each category and get a print out of the selected item.
 * Separate each category into a method. eg: variables, operators, input, arrays, for loops, conditions, functions.
 */

// Imports
import java.util.Scanner;  // Importing user input scanner class.
import java.util.ArrayList; // Importing ArrayList dynamic arrays class.
import java.lang.*; // Importing character methods.


// All Java code is contained and organised within Classes.
class Cheatsheet
{
    // A method to describe Java variables and their data types.
    public static void variables()
    {
        // Data in Java is stored within strictly typed variables.
        String textType = "A text string message.";               // Text string type data (requires a capital letter on type) with values surrounded by double quotes.
        char letterType = 'a';                                               // Single character type data with values surrounded by single quotes.
        byte byteNumberType = 127;                                  // Byte number type data with a whole number range of -128 to 127.
        short shortNumberType = 32767;                           // Short number type data with a whole number range of -32768 to 32767.
        int numberType = 2147483647;                               // Non decimal point integer numerical data with a range of -2147483648 to 2147483647.
        long longNumberType = 9223372036854775807L;   // Long number type data with a larger range than int in 32bit or 64bit in the range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. (requires letter L added to end of value)
        float floatType = 123.4567890F;                               // Single precision floating point numerical data up to 7 digits after decimal, for inaccurate decimal point values with lower memory consumption.(requires letter F added to end of value)
        double doubleType = 123.4567890123456789D;      // Double precision floating point numerical data up to 16 digits after decimal, for accurate decimal point values with higher memory consumption. (optionally add D to end of value)
        boolean boolType = true;                                        // True or false boolean data. 

        // Output is handled by System object's output functions.
        // The System.out.print function prints strings and numbers to the console as a whole.
        System.out.print(
            "\n" + "1. Variables and Data Types." + "\n" +
            "-----------------------------------------" + "\n" +
            "String: \t" + textType + "\n" +
            "char: \t\t" + letterType + "\n" +
            "byte: \t\t" + byteNumberType + "\n" +
            "short: \t\t" + shortNumberType + "\n" +
            "int: \t\t" + numberType + "\n" +
            "long: \t\t" + longNumberType + "\n" +
            "float: \t\t" + floatType + "\n" +
            "double: \t" + doubleType + "\n" +
            "boolean: \t" + boolType + "\n\n"
        );
        // The \n escape character adds a line return to set output to the next line. There are other escape characters which use the backslash \.
        // The \t escape character adds a tab space to the string output.

        navigation(false);
    }

    // A method to describe the Java Math operators.
    public static void operators()
    {
        // Math can be done in Java with set or stored values from variables.
        // The System.out.println function prints strings and numbers to the console one line at a time.
        System.out.println(
            "\n" + "3. Operators and Math." + "\n" +
            "-----------------------------------------" + "\n" +
            "Addition: \t" + 1 + "+" + 1 + "=" + (1 + 1) + "\n" +
            "Substraction: \t" + 4 + "-" + 1 + "=" + (4 - 1) + "\n" +
            "Multiplication: " + 3 + "*" + 5 + "=" + (3 * 5) + "\n" +
            "Division: \t" + 9 + "/" + 3 + "=" + (9 / 3) + "\n" +
            "Modulo: \t" + 11 + "%" + 2 + "=" + (11 % 2) + "\n" 
        );
        // The Modulo operator % divides a value by the given number and returns the remainder.

        navigation(false);
    }

    public static void userInput()
    {
        // User input is taken by the System input object Scanner.
        Scanner scan = new Scanner(System.in);

        // Getting user input
        System.out.println("Getting user input" + "\n" +
        "-----------------------------------------");
        System.out.println("What is your name?");
        String name = scan.nextLine();  // Takes string type user keyboard input and stores the value in a variable.
        System.out.println("Hello, " + name + ".");  // Outputs the value from the user input stored in the variable.

        System.out.println("\n\nHow old are you?");
        int age = scan.nextInt();  // Takes integer type user keyboard input and stores the value in a variable.
        System.out.println("You look young for a " + age + " year old. \n\n");

        scan.close(); // Closing scanner to prevent a memory leak and let the Java garbage collector reclaim the memory of the scanner class.

        navigation(false);
    }

    // A method to describe Array Types.
    public static void arrays()
    {
        // Arrays are like lists and tables that enable different types of data to be stored and organised.
        // Arrays are statically typed and require a data type to be set on creation.

        // The following is a one dimensional string type array for months of the year, containing twelve items of data.
        String[] months = new String[12];

        // To set data to the array items use the array name and the index number of the item within square brackets.
        // Items in an array are enumerated starting from 0, so the index of the first item would be 0 and second as 1.
        // The data type of the array item must match the array type set at its creation.
        months[0] = "January";   // index 0
        months[1] = "February";  // index 1
        months[2] = "March";     // index 2
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        // The following is a two dimensional string type array for weekdays, containing two rows and seven columns.
        // A two dimensional array is like a table with rows, columns and cells where each data item is a cell on the table.
        String[][] weekdays = new String[2][7];

        // To set the data for the first row of the array use the first index of 0 to set data to first row and the second index to set data to the column.
        weekdays[0][0] = "Monday";
        weekdays[0][1] = "Tuesday";
        weekdays[0][2] = "Wednesday";
        weekdays[0][3] = "Thursday";
        weekdays[0][4] = "Friday";
        weekdays[0][5] = "Saturday";
        weekdays[0][6] = "Sunday";

        // To set the data for the first row of the array use the first index of 1 to set data to second row and the second index to set data to the column.
        weekdays[1][0] = "Working";
        weekdays[1][1] = "Working";
        weekdays[1][2] = "Working";
        weekdays[1][3] = "Working";
        weekdays[1][4] = "Working";
        weekdays[1][5] = "Weekend";
        weekdays[1][6] = "Weekend";

        // ArrayList class is a dynamic resizeable array/collection and resizes itself according to the number of items it contains.
        // It also provides a set of methods to perform operations on the ArrayList, such as add() and remove().
        // ArrayList is part of the java.util packages so it must be imported to be used.
        ArrayList<String> users = new ArrayList<>();

        // Items can be added to the ArrayList without specifying the index using the ArrayList add() method.
        users.add("Martin");
        users.add("Mohammad");

        // Items can also be specified to be added at a certain index.
        users.add(2, "Salman");
        
        // Items can be removed using the remove() method of the ArrayList.
        users.remove(0);

        // Let's print out the ArrayList called users.
        System.out.println("The users ArrayList contains " + users.size() + " users.");
        System.out.println("The registred users are: ");

        // A for-each loop can be used to iterate through all of the items in an Array or ArrayList.
        for(String user:users)
        {
            System.out.println("    " + user + "\n");
        }

        navigation(false);
    }

    // Ask user to continue or quit the program after reading each topic.
    public static void navigation(boolean error)
    {

        // Skip the original message if the user made an error.
        if (!error)
        {
            // Message to alert the user.
            System.out.print
            (
                "Would you like to read another topic? (Y\\N)" + "\n" +
                "CHOICE: "
            );
        }
        else
        {
            System.out.print( "Choice: "); // Short user input message.
        }

        // Get user input for choice of action.
        Scanner scan = new Scanner(System.in);
        char choice = scan.next().charAt(0);

        // Check user typed input
        if (choice == 'y' || choice == 'Y')
        {
            mainMenu(false); // Return to topic selection menu
            scan.close();
        }
        else if (choice == 'n' || choice == 'N')
        {
            System.exit(0); // Exit the program
        }
        else
        {
            System.out.println("\n" + "Incorrect choice, please type either the letter Y to continue or N to quit."); // Notify of any input errors.
            navigation(true);
        }
    }

    // Topic selection menu to show at program start.
    public static void mainMenu(boolean error)
    {

        // Check if the user made a mistake on choice input and don't display the whole menu if they did.
        if (!error)
        {
            System.out.print
            (
                "\n" + "PLEASE ENTER A TOPIC NUMBER TO LEARN MORE ABOUT." + "\n" +
                "------------------------------------------------" + "\n" +

                "1. Variables and Data Types." + "\n" +
                "2. Arrays, Multi-dimensional Arrays and Array Lists." + "\n" +
                "3. Operators and Math." + "\n" +
                "4. Conditionals, If, else and Switch Statements." + "\n" +
                "5. Loops and Iterators." + "\n" +
                "6. Function Methods." + "\n" +
                "7. Classes, Objects and Constructors." + "\n" +
                "------------------------------------------------" + "\n" +
                "\n" +
                "LEARN ABOUT TOPIC NUMBER: "
            );
        }
        else 
        {
            System.out.print("LEARN ABOUT TOPIC NUMBER: ");
        }
        
        // Use a try/catch block to manage errors from user input.
        try
        {
            // User input is taken by the System input object Scanner.
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                    variables();
                    break;
                case 2:
                    arrays();
                    break;
                case 3:
                    operators();
                    break;
                case 4:
                    //conditionals();
                    break;
                case 5:
                    //loops();
                    break;
                case 6:
                    //methods();
                    break;
                case 7:
                    //classes();
                    break;
                // Display an error message when the user enters any other number.
                default:
                    System.out.println("Sorry that's not an option, please enter a correct menu item number!" + "\n");
                    mainMenu(true);
                    break;
            }
            
            scan.close();
        }
        catch (Exception e) // Display an error message when the user enters anything other than a number.
        {
            System.out.println("Sorry that's not an option, please enter a correct menu item number!" + "\n");
            mainMenu(true);
        }    
    }
    
    // Topic submenu to select a category.
    public static void subMenu(String category)
    {

        Scanner scan = new Scanner(System.in);

        switch(category)
        {
            // Arrays category submenu
            case "arrays":
                System.out.print
                (
                    "\n" + "2. Arrays, Multi-dimensional Arrays and Array Lists." + "\n" +
                    "-----------------------------------------" + "\n" +
                    "A. Basic Arrays" + "\n" +
                    "B. Multi-dimensional Arrays" + "\n" +
                    "C. Array Lists" + "\n" +
                    "\n" +
                    "Learn about topic: "
                );

                // Get the submenu user choice input.
                char choice = scan.next().charAt(0);

                // Display the appropriate submenu item.
                switch(choice)
                {
                    case 'a':
                        // arrayBasics();
                        scan.close();
                        break;
                    case 'b':
                        // arrayDimensions();
                        scan.close();
                        break;
                    case 'c':
                        // arrayLists();
                        scan.close();
                        break;
                }
                break;

            case "operators":
                // to-do math and increment/decrement submenu
                break;

            case "conditionals":
                // to-do conditionals submenu
                break;

            case "loops":
                // to-do loops submenu
                break;

            case "methods":
                // to-do methods submenu
                break;

            case "classes":
                // to-do classes submenu
                break;

            default:
                break;
        }
    }

    // The main function of the application contains the variables and sub functions.
    public static void main(String[] args)
    {
        // Application introduction message.
        System.out.print
        (
            "==============================================" + "\n" +
            "\t\t" + "JAVA CHEATSHEET" + "\n" +
            "==============================================" + "\n\n" +

            "This is a console application to describe" + "\n" +
            "the Java language syntax for reference." + "\n" +
            "Created as a practice exercise to learn Java." + "\n"
        );

        mainMenu(false);      
    }
}


