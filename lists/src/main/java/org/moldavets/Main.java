package org.moldavets;

import org.moldavets.DoublyLinkedList.DoublyEmployeeLinkedList;
import org.moldavets.DoublyLinkedList.DoublyEmployeeNode;
import org.moldavets.LinkedList.Employee;
import org.moldavets.LinkedList.EmployeeLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        DoublyEmployeeLinkedList list = new DoublyEmployeeLinkedList();
//
//        list.addToFront(new Employee(1L, "John", 12));
//        list.addToFront(new Employee(2L, "Carl", 21));
//        list.addToFront(new Employee(3L, "Susan", 33));
//        list.addToEnd(new Employee(4L, "David", 44));
//
//        list.printList();
//        System.out.println(list.getSize());
//        System.out.println(list.isEmpty());
//        list.removeFromEnd();
//        list.printList();
        System.out.println(isValid("()()("));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("([])"));
    }

    public static boolean isValid(String s) {
        if(s.trim().isEmpty() || s.length() < 2 || s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                stack.push(map.get(s.charAt(i)));
            } else if (!stack.isEmpty() && stack.peek().equals(s.charAt(i))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();


//        return firstType == 0 && secondType == 0 && thirdType == 0;
    }
}