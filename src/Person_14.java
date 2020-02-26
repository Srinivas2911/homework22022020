public class Person_14 {

    /*14. Person
Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
Write the following methods (instance methods):
*Method named getFirstName without any parameters, it needs to return the value of the firstName field.
*Method named getLastName without any parameters, it needs to return the value of the lastName field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
*Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name of the person.
*In case both firstName and lastName fields are empty, Strings return an empty String.
*In case firstName is an empty String, return firstName.
*In case lastName is an empty String, return lastName.
To check if s String is empty, use the method isEmpty from the String class. For example, firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.
TEST EXAMPLE
TEST CODE: (Write below code in to main method then check out put)
Person person = new Person();
person.setFirstName(""); // firstName is set to empty string
person.setLastName(""); // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John"); // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith"); // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());
OUTPUT
fullName=
teen= false
fullName= John
teen= true
fullName= John Smith
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 8 methods.
*/


    String firstName;                               // string variable defined for first name
    String lastName;                                // string variable defined for last name
    int age;                                        // int variable defined for age

    public String getFirstName() {                  // instance method for first name
        return firstName;                           // return for first name
    }

    public String getLastName() {                   // instance method for  last name
        return lastName;                            // return for last name
    }

    public int getAge() {                           // method for age as getAge
        return age;                                 // return for age
    }

    public void setFirstName(String f_Name) {       // method for setting up new first name
        this.firstName = f_Name;                    // this first name is set as f_name
    }

    public void setLastName(String l_Name) {        // method for setting up last name
        this.lastName = l_Name;                     // this last name is set as l_name
    }

    public void setAge(int new_Age) {               // method for setting up age variable as new age
        if (new_Age <= 0 || new_Age >= 100) {       // condition for valid age field between 0 & 100
            this.age = 0;                           // the age should become 0
        } else {
            this.age = new_Age;                     // this age is now set as new_Age
        }
    }

    public boolean isTeen() {                      // boolean method for isTeen for teens
        return age > 12 && age < 20;               // for teen it should return true if age between 12 & 20

    }
    public String getFullName() {                   // method for getting full name

        if (firstName.isEmpty())                       // condition for empty field first name
        {
            this.firstName = lastName;                  // sets this to last  name
            return this.firstName;                      // return first name
        }

        if (lastName.isEmpty()) {                       // condition for empty last name
            this.lastName = firstName;                  // sets this to first name
            return this.lastName;                       // returns last for this
        }
        return firstName+" "+lastName;                  // returns full name as first name + last name
    }

    public static void main(String[] args) {            // main method

        Person_14 person = new Person_14();             // object for Class

        person.setFirstName("");                        //object for set first name
        person.setLastName("");                         // object for set last name
        person.setAge(10);                              // parameter set for age
        System.out.println("fullName=" + person.getFullName());  // print full name
        System.out.println("teen" + person.isTeen());           // print teen
        person.setFirstName("John");                            // parameter for set First name

        person.setAge(18);                                      // set age as 18
        System.out.println("fullName=" + person.getFullName()); // gets full name
        System.out.println("teen=" + person.isTeen());          // defines teens
        person.setLastName("Smith");                            // name parameter set
        System.out.println("fullName" + person.getFullName());  // prints full name

    }
}
