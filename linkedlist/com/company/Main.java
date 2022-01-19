package com.company;

//Node Creation Code
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Main {
    Node head;
    public static void main(String[] args) {
        Main obj = new Main();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        obj.head = n1;
        n1.next = n2;
        obj.print();
        obj.insertNode(3,30);
        obj.print();
        obj.insertNode(2,50);
        obj.print();
        obj.insertNode(6,40);
        obj.print();
    }
    //Printing the Linked List
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Counting the total Nodes in Linked list used in insertNode() Function
    public int countNodes() {
        int c = 0;
        Node temp = head;
        while(temp!=null) {
            c++;
            temp=temp.next;
        }
        //System.out.println("\n"+c+" Nodes");
        return c;
    }
    //Insert Node Function with Invalid Position Check
    public void insertNode(int pos, int data) {
        Node n = new Node(data);
        if(head == null) {
            if(pos == 1)
                head = n;
            else
                System.out.println("Invalid Position");
        }
        else {
            if(pos <= countNodes()+1) {
                if(pos == 1) {
                    n.next = head;
                    head = n;
                }
                else {
                    Node temp = head;
                    int cp = 1;
                    while(cp < pos-1) {
                        temp = temp.next;
                        cp++;
                    }
                    n.next = temp.next;
                    temp.next = n;
                }
            }
            else System.out.println("Invalid Position");
        }
    }
}

