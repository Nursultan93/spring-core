package az.example;

public class Department {
  private String depName;

  public Department() {
  }

  public Department(String depName) {
    this.depName = depName;
  }

  public String getDepName() {
    return depName;
  }

  public void setDepName(String depName) {
    this.depName = depName;
  }

  @Override
  public String toString() {
    return "Department{" +
        "depName='" + depName + '\'' +
        '}';
  }

}
