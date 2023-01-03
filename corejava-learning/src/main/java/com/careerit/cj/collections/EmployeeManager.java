package com.careerit.cj.collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {

  public static void main(String[] args) {
        List<Employee> empList=EmployeeDataService.getEmployees();
        // Get max paid employee(s)
        // Get the name,age,exp employee(s)
        // Get the avg exp of the organisation
        // Get the total salary of all employees
        // Get the employee names only
        // Get the name and dob of all the employee
  }
  public List<String> getEmployeeNames(List<Employee> empList){
//      List<String> list = new ArrayList<>();
//      for(Employee emp:empList){
//          list.add(emp.getName());
//      }
//      return list;
        return empList.stream().map(emp->emp.getName()).collect(Collectors.toList());
  }
  public List<EmpNameAndDob> getEmpNameAndDob(List<Employee> empList){
//        List<EmpNameAndDob> list = new ArrayList<>();
//        for(Employee emp:empList){
//            list.add(new EmpNameAndDob(emp.getName(),emp.getDob()));
//        }
//        return list;
        return empList.stream()
            .map(emp->new EmpNameAndDob(emp.getName(),emp.getDob()))
            .collect(Collectors.toList());
  }
}
