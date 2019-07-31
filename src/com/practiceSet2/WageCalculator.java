package com.practiceSet2;

public class WageCalculator {
    public static void main(String[] args){
        Employee emp1 = new Employee("Reejh", "1234", 5, 10);
        WageCalculator wc = new WageCalculator();
        System.out.println("WAGES: "+wc.calculateWages(emp1));
    }

    float calculateWages(Employee e){
        return e.getWagePerHour()*e.getHoursWorked();
    }
}

class Employee {
    private String name;
    private String employeeCode;
    private int hoursWorked;
    private float wagePerHour;

    public String getName() {
        return name;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public float getWagePerHour() {
        return wagePerHour;
    }

    public Employee(String name, String employeeCode, int hoursWorked, float wagePerHour) {
        this.name = name;
        this.employeeCode = employeeCode;
        this.hoursWorked = hoursWorked;
        this.wagePerHour = wagePerHour;
    }
}
