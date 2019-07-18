/**
 * This program demonstrates static methods.
 * @version 1.01 2004-02-19
 * @author Cay Horstmann
 */
public class StaticTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee objects
	   Employee4_3[] staff = new Employee4_3[3];

      staff[0] = new Employee4_3("Tom", 40000);
      staff[1] = new Employee4_3("Dick", 60000);
      staff[2] = new Employee4_3("Harry", 65000);

      // print out information about all Employee objects
      for (Employee4_3 e : staff)
      {
         e.setId();
         System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
               + e.getSalary());
      }

      int n = Employee4_3.getNextId(); // calls static method
      System.out.println("Next available id=" + n);
   }
}

class Employee4_3
{
   private static int nextId = 1;

   private String name;
   private double salary;
   private int id;

   public Employee4_3(String n, double s)
   {
      name = n;
      salary = s;
      id = 0;
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public int getId()
   {
      return id;
   }

   public void setId()
   {
      id = nextId; // set id to next available id
      nextId++;
   }

   public static int getNextId()
   {
      return nextId; // returns static field
   }

   public static void main(String[] args) // unit test
   {
	   Employee4_3 e = new Employee4_3("Harry", 50000);
      System.out.println(e.getName() + " " + e.getSalary());
   }
}
