package az.example;

import java.util.List;
import java.util.Map;

public class Employee {

  private String firstName;
  private String lastName;
  private Integer age;

  private Department department;

  private List<String> permissions;

  private Map<String, String> emails;

  public Employee() {
  }

  public Employee(String firstName, String lastName, Integer age, Department department, List<String> permissions, Map<String, String> emails) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.department = department;
    this.permissions = permissions;
    this.emails = emails;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public Map<String, String> getEmails() {
    return emails;
  }

  public void setEmails(Map<String, String> emails) {
    this.emails = emails;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", department=" + department +
        ", permissions=" + permissions +
        ", emails=" + emails +
        '}';
  }
}
