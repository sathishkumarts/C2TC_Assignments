package com.sathish.assignmentone.employees;

public class Employee {

    // private fields
    private String employeeName;
    private String id;
    private double monthlyPay;

    // constructor
    public Employee(String employeeName, String id, double monthlyPay) {
        this.employeeName = employeeName;
        this.id = id;
        this.monthlyPay = monthlyPay;
    }

    // getters and setters
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    // protected method to adjust salary
    protected void adjustSalary(double percentage) {
        if (percentage > 0) {
            this.monthlyPay += this.monthlyPay * (percentage / 100);
        }
    }

    // extra utility method
    public double getAnnualIncome() {
        return monthlyPay * 12;
    }

    public String showInfo() {
        return "Employee [Name=" + employeeName + ", ID=" + id + ", Pay=" + monthlyPay + "]";
    }

    @Override
    public String toString() {
        return showInfo();
    }
}
