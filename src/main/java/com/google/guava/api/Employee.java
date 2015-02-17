package com.google.guava.api;

import com.google.common.base.Objects;

/**
 *
 * @author ajay
 */
public class Employee {
    private String name;
    private int employeeId;
    private String department;

    public Employee(String name, int employeeId, String department) {

        this.name = name;
        this.department = department;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", name)
                .add("employeeId", employeeId)
                .add("department", department)
                .toString();
    }

/*    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", department='" + department + '\'' +
                '}';
    }*/


}
