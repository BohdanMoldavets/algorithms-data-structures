package org.moldavets.LinkedList;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size = 0;

    public void add(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (!this.isEmpty()) {
            EmployeeNode node = head;
            head = head.getNext();
            size--;
            node.setNext(null);
            return node;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = this.head;
        System.out.print("HEAD->");
        while (current != null) {
            System.out.print(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
