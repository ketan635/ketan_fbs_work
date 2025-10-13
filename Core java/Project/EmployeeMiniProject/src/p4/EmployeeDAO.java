package p4;

import java.util.ArrayList;
import java.util.Iterator;

import p2.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManager;

public class EmployeeDAO {
    static ArrayList<Employee> empList;

    static {
        empList = new ArrayList<>();

        empList.add(new HR(101, "Sarthk", 50000, 5000));
        empList.add(new HR(102, "Chaitanya", 48000, 4500));
        empList.add(new HR(103, "Kaeri", 47000, 4000));

        empList.add(new SalesManager(201, "Nachiket", 60000, 12, 8000));
        empList.add(new SalesManager(202, "sakshi", 58000, 15, 7500));
        empList.add(new SalesManager(203, "vandit", 62000, 10, 9000));

        empList.add(new Admin(301, "Pragati", 70000, 10000));
        empList.add(new Admin(302, "ishika", 68000, 9500));
        empList.add(new Admin(303, "Pooja", 72000, 11000));
        empList.add(new Admin(304, "mayuri", 75000, 12000));
    }

    public boolean addEmployee(Employee e) {
        return empList.add(e);
    }

    public Employee searchEmployeeById(int id) {
        for (Employee emp : empList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public boolean updateEmployee(int id, double newSalary) {
        Employee emp = searchEmployeeById(id);
        if (emp != null) {
            emp.setSalary(newSalary);
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
        Iterator<Employee> iterator = empList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void displayAll() {
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }

    public Employee[] getAllEmployee() {
        return empList.toArray(new Employee[0]);
    }

    public static int getEmpCount() {
        return empList.size();
    }
}
