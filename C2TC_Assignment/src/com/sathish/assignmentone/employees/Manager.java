package com.sathish.assignmentone.employees;

public class Manager extends Employee {

    private String division;
    private int membersCount;

    public Manager(String employeeName, String id, double monthlyPay,
                   String division, int membersCount) {
        super(employeeName, id, monthlyPay);
        this.division = division;
        this.membersCount = membersCount;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(int membersCount) {
        this.membersCount = membersCount;
    }

    public void rewardEmployee(Employee e, double bonusPercentage) {
        e.adjustSalary(bonusPercentage);
        System.out.println("Manager " + getEmployeeName() + " rewarded " 
                           + e.getEmployeeName() + " with a " 
                           + bonusPercentage + "% increment.");
    }

    public void conductMeeting() {
        System.out.println("Manager " + getEmployeeName() + " is conducting a team meeting in " + division);
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
               ", Division=" + division + ", Members=" + membersCount;
    }
}
