import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        LinkedList <Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(1,"Murat","Simsek"));
        employeeList.add(new Employee(2, "Ali","Veli"));
        employeeList.add(new Employee(3, "Mustafa","Kemal"));
        employeeList.add(new Employee(3, "Fevzi","Cakmak"));
        employeeList.add(new Employee(5, "Veli","Ali"));




        LinkedList <Employee> duplicatedList = new LinkedList<>();
        Map<Long,Employee> uniqueList = new HashMap<>();

        for (Employee employee : employeeList){
            if (uniqueList.containsKey(employee.getId())){
                duplicatedList.add(employee);
            }
            else {
                uniqueList.put(employee.getId(),employee);
            }
        }

        employeeList.removeAll(duplicatedList);


        printEmployeeList(employeeList);
        printUniqueEmployeeList(uniqueList);
    }
    private static void printEmployeeList (LinkedList<Employee> list){
        for (Employee employee : list){
            System.out.println(employee.getId() + " id li employee :" + employee.getFirstName() + " " + employee.getLastName());
        }
    }
    private static void printUniqueEmployeeList (Map <Long , Employee> map ){
        for (Map.Entry<Long , Employee> entry : map.entrySet()){
            Employee employee = entry.getValue();
            System.out.println("Unique Employee List : " +employee.getId() + " id li employee : " + employee.getFirstName() + " " + employee.getLastName());
        }
    }
}