/**
 *
 * @author abhiy0159@gmail.com
 */
package employee_payroll_system;

import java.util.ArrayList;

/**
 * Abstract class which will act as a super class for all types of employees
 */
abstract class Employee
{
    
    private String name;
    private int id;
    
    public Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public abstract double calculateSalary();
    @Override
    public String toString()
    {
        return "Employee Name: "+name+","+"Employee ID: "+id+","+"Employee Salary: "+calculateSalary();
    }
}
/**
 * a class for full time employees
 */
class fullTimeEmployee extends Employee
{
    private double monthlySalary;
    public fullTimeEmployee(String name,int id,double monthlySalary)
    {
        super(name,id);
        this.monthlySalary=monthlySalary;
    }
    @Override
    /**
     * A overrided method that will calculate the salary of full time employee
     */
    public double calculateSalary()
    {
        return monthlySalary;
    }
}
/**
 * a class for part time employees 
 */
class partTimeEmployee extends Employee
{
    private int hoursworked;
    private double hourlyRate;
    public partTimeEmployee(String name,int id,int hoursworked,double hourlyRate)
    {
        super(name,id);
        this.hoursworked=hoursworked;
        this.hourlyRate=hourlyRate;
    }
    /**
     * A overrided method that will calculate the salary of part time employees on the basis of number of hours worked 
     */
    @Override
    public double calculateSalary()
    {
        return (hoursworked*hourlyRate);
    }
}

class payRoll
{
   
    private ArrayList<Employee> employeeList;
    public payRoll()
    {
        employeeList=new ArrayList<>();
    }
    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }
    public void removeEmployee(int id)
    {
        Employee empToRemove=null;
        for(Employee employee: employeeList)
        {
            
        }
        
    }
}
public class Employee_Payroll_System 
{
     public static void main(String[] args)
    {
       
    }
    
}
