public class homeWork implements Bicecly {
    public static void main(String[] args) {
//Person person = new Person("Josh");
//person.setName("Sam");
//person.printName(person.getName());

//        String s = null;
//        System.out.println(s.contains("a"));

//1
        /**Write a program with the following:
          Create a class named Horse
          Inside Horse, create a private String variable named “name”
         and a private int variable named “age”
          Create a constructor in class Horse with all the parameters.
          Create another constructor (any!).
          Create getters and setters for all variables.
          Create a Horse object from main using any constructor.
          Print horse name from main class. */
//Horse horse = new Horse("Bob",4);
//        System.out.println(horse.getName());

//2
/**
          Create any class with 2 constructors
          From another class create 2 objects from the above class using
         the 2 constructors. */

//        Car car1 = new Car(34000);
//
//        Car car2 =new Car("Red",56000);

//3
/** What will be the output (printed) of the following program?

    Name -- Sam
 */


// public class homeWork {
// public static void main(String[] args) {
// Person person = new Person("Josh");
// person.setName("Sam");
// person.printName(person.getName());
//    }
//}
// class Person {
// String name;
//
// public Person(String name){
// this.name = name;
// }
// public String getName(){
// return name;
// }
// public void setName(String name){
// this.name = name;
// }
// public void printName(String name ){
// System.out.println("Name is --" + name);
// }
//
// }



//4
        /**In the example below this parameter is missing from setName()
         method.
         Will the output be different from question 3 (above)? If so, why?

         This will be the name -- Josh. Since the setName function is not used, the original name will not change. */

//5
       /** What is wrong with the below program:

         In our code, String s is set to null, and we are attempting to call the contains method on this variable.
         Calling a method on null results in a NullPointerException in Java.

         */

//        String s = null;
//        System.out.println(s.contains("a"));

//6
/**What is the importance of encapsulation in Java?

The meaning of Encapsulation, is to make sure that "sensitive" data is
hidden from users.In encapsulation, the variables of a class will be hidden from other classes,
and can be accessed only through the methods of their current class.We can make a class read-only or write-only
Data hiding: other classes can’t access private members of a class directly. */

                                          // Challenge:
        /** Read about java Interfaces and use one in your code.*/
//        public interface Bicecly {
//       public default void ride(){
//           System.out.println("Fast");
//       };
//   }
//   public class Ride implements  Bicecly {
//       public static void main(String[] args) {
//           Bicecly bike = new Bicecly() {
//           };
//           bike.ride();
//       }
//   }
    }
}
