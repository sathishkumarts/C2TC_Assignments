package com.sathish.assignmentone.employees;

public class Developers extends Employee {

    private String techStack;
    private String experienceLevel;

    public Developers(String employeeName, String id, double monthlyPay,
                     String techStack, String experienceLevel) {
        super(employeeName, id, monthlyPay);
        this.techStack = techStack;
        this.experienceLevel = experienceLevel;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public void pushCode(int filesChanged) {
        System.out.println(getEmployeeName() + " pushed updates to " + filesChanged + " files using " + techStack);
    }

    public void debugApplication() {
        System.out.println(getEmployeeName() + " is debugging a project in " + techStack);
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", TechStack=" + techStack + ", Level=" + experienceLevel;
    }
}
