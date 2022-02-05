public class Main {

    //create the object (new employee) to test
    public static void main (String args []){
        Employee e1 = new Employee();
        e1.setName("Sharon Parker");
        e1.setEmployeeId(5287411);
        e1.setDepartment("Human Resources");
        e1.setStatus(true);

        System.out.println("Name: " + e1.getName()+ "\n" + "Employee ID: " + e1.getEmployeeId() + "\n" + "Department: "
                + e1.getDepartment() + "\n" + "Full-Time Status: " + e1.getStatus());

    }



}
