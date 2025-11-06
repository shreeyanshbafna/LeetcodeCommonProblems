package javaforgood;

import java.io.*;

//Step 1: Make class implement Serializable
class Employee implements Serializable {
 private static final long serialVersionUID = 1L;  // recommended

 private int id;
 private String name;
 private double salary;

 // Constructor
 public Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 // toString for printing
 @Override
 public String toString() {
     return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
 }
}

public class SerializationExample {
 public static void main(String[] args) {
     Employee emp = new Employee(101, "Shreeyansh", 85000.50);

     // --- Serialization ---
     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
         oos.writeObject(emp);  // writing object to file
         System.out.println("✅ Object serialized successfully");
     } catch (IOException e) {
         e.printStackTrace();
     }

     // --- Deserialization ---
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
         Employee deserializedEmp = (Employee) ois.readObject();  // reading back
         System.out.println("✅ Object deserialized successfully");
         System.out.println(deserializedEmp);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
