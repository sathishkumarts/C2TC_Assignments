package com.sathish.assignmentone.utilities;

import com.sathish.assignmentone.employees.*;

public class Utilities {

    public static double getYearlyCompensation(Employee emp) {
        return emp.getMonthlyPay() * 12;
    }

    public static void addIncentive(Employee emp, double incentive) {
        if (incentive > 0) {
            emp.setMonthlyPay(emp.getMonthlyPay() + incentive);
        }
    }

    public static void displayInfo(Employee emp) {
        System.out.println(emp.showInfo());
    }

    public static void compareSalaries(Employee e1, Employee e2) {
        if (e1.getMonthlyPay() > e2.getMonthlyPay()) {
            System.out.println(e1.getEmployeeName() + " has a higher salary than " + e2.getEmployeeName());
        } else if (e1.getMonthlyPay() < e2.getMonthlyPay()) {
            System.out.println(e2.getEmployeeName() + " has a higher salary than " + e1.getEmployeeName());
        } else {
            System.out.println(e1.getEmployeeName() + " and " + e2.getEmployeeName() + " earn the same salary.");
        }
    }
}
