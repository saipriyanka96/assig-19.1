package hash;
//Package is a grouping of related types providing access protection and name
import java.util.HashSet;
import java.util.Iterator;

class Student//default constructor
{
    String name;
 // String will refer set of characters
    int rollNo;
 //int is datatype which consists of integer
    String department;
 
    public Student(String name, int rollNo, String department)
    //parameterized constructor
    {
        this.name = name;
 //this will refer current object 
        this.rollNo = rollNo;
 
        this.department = department;
    }
 
    @Override
    public int hashCode()
   //hashCode() method which digest the data stored in a instance of the class
    {
        return rollNo;
        //return the value
    }
 
    @Override
    public boolean equals(Object obj)
    //This method checks if some other object passed to it as an argument is equal to the object on which this method is invoked.
    {
        Student student = (Student) obj;
        //This method is used to compare two objects.
        return (rollNo == student.rollNo);
    }
 
    @Override
    //This method returns itself a string.
    public String toString()
    {
        return rollNo+", "+name+", "+department;
    }
}
 
public class StudentHash
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class

{
    public static void main(String[] args)
    //static is used for memory management
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
		
    {
       //creating the object
    	HashSet<Student> set = new HashSet<Student>();
 
        //Adding elements to HashSet
        //set is an interface which extends Collection 
        //add method inserts the specified element E at the specified position in this list.
        set.add(new Student("Avinash", 121, "ECE"));
 
        set.add(new Student("Bharat", 101, "EEE"));
 
        set.add(new Student("Malini", 151, "Civil"));
 
        set.add(new Student("Suresh", 200, "IT"));
 
        set.add(new Student("Vikram", 550, "CS"));
 
        set.add(new Student("Bharat", 301, "IT"));
 
        set.add(new Student("Amit", 301, "IT"));          
        //duplicate element
 
        set.add(new Student("Bhavya", 872, "ECE"));
 
        set.add(new Student("Naman", 301, "CS"));       
        //duplicate element
 
        set.add(new Student("Samson", 565, "Civil"));
 
        //Iterating through HashSet
        //Iterators are used in Collection framework in Java
        Iterator<Student> it = set.iterator();
      //while loop is used to iterate a part of the program several times
        while (it.hasNext())
        {
        	//creating the object
            Student student = (Student) it.next();
          //system is final class
	  	   //out is a static member of system class and type printStream
	  	   //println is method of printStream class.ln means nextline
	          
            System.out.println(student);
        }
    }
}