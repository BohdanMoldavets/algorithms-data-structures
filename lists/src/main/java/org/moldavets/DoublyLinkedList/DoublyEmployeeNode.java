package org.moldavets.DoublyLinkedList;

import org.moldavets.LinkedList.Employee;

public class DoublyEmployeeNode {

    private DoublyEmployeeNode previous;
    private Employee employee;
    private DoublyEmployeeNode next;

    public DoublyEmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DoublyEmployeeNode getNext() {
        return next;
    }

    public void setNext(DoublyEmployeeNode next) {
        this.next = next;
    }

    public DoublyEmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyEmployeeNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "EmployeeNode{" +
                "employee=" + employee +
                '}';
    }

}
