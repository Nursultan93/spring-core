package az.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {


  @Autowired
  private Employee employee;

  public static void main(String[] args) {
//    Employee employee = new Employee("Nigar", "Efendiyeva", 23);

//    Department department = new Department("IT");
//
//    Employee employee = new Employee();
//    employee.setFirstName("Murad");
//    employee.setLastName("Memmedov");
//    employee.setAge(34);
//    employee.setDepartment(department);

    ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");

    Employee nigar = (Employee) context.getBean("nigar");

    Employee murad = (Employee) context.getBean("murad");

    System.out.println(nigar);
    System.out.println(murad);
  }
}
