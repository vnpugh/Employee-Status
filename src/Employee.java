public class Employee {
    //Encapsulation Activity
    //name
    //employee id
    //department
    //status
    //getter and setter methods

    //first make variables private
    private String name;
    private int employeeId;
    private String department;
    private boolean status;

    //getter methods
    public String getName() {
        return name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getDepartment() {
        return department;
    }
    public boolean getStatus() {
        return status;
    }

    //setter methods to set the values for these variables
    public void setName(String newName) {
        name = newName;
    }
    public void setEmployeeId(int newId){
        employeeId = newId;
    }
    public void setDepartment(String newDepartment){
        department = newDepartment;
    }
    public void setStatus(boolean newStatus){
        status = newStatus;
    }






}
