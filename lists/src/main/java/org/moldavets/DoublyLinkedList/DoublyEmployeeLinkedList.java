package org.moldavets.DoublyLinkedList;

import org.moldavets.LinkedList.Employee;
import org.moldavets.LinkedList.EmployeeNode;

public class DoublyEmployeeLinkedList {

    private DoublyEmployeeNode head;
    private DoublyEmployeeNode tail;
    private int size = 0;

    public void addToFront(Employee employee) {
        DoublyEmployeeNode node = new DoublyEmployeeNode(employee);
        node.setNext(head);

        if(head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        this.head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        DoublyEmployeeNode node = new DoublyEmployeeNode(employee);

        if(tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public DoublyEmployeeNode removeFromFront() {
        if(!this.isEmpty()){
            DoublyEmployeeNode removedNode = head;

            if(removedNode.getNext() == null) {
                tail = null;
            } else {
                head.getNext().setPrevious(null);
            }

            head = head.getNext();
            size--;
            removedNode.setNext(null);
            return removedNode;
        }
        return null;
    }

    public DoublyEmployeeNode removeFromEnd() {
        if(!this.isEmpty()){
            DoublyEmployeeNode removedNode = tail;

            if(removedNode.getPrevious() == null) {
                head = null;
            } else {
                tail.getPrevious().setNext(null);
            }

            tail = tail.getPrevious();
            size--;
            removedNode.setPrevious(null);
            return removedNode;
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
        DoublyEmployeeNode current = this.head;
        System.out.print("HEAD->");
        while (current != null) {
            System.out.print(current);
            System.out.println(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
