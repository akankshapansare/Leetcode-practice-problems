package algorithms;

/**
 * Created by akanksha on 12/15/2017.
 */
public class MySinglyLinkedList {

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head = null;

    //Insert new node at first place
    public void insertAtFirst(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    //Insert a new node after a given previous node
    public void insertAfter(int prevData, int newData) {
        //Create new node
        Node newNode = new Node(newData);
        Node temp = head;
        //Check if previous data is present in linked list or not
        while (temp != null && temp.data != prevData) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    //Delete a given data from the list
    public void deleteElement(int deleteData) {

        Node temp = head;
        Node prev = null;

        //If head data contains delete data
        if (temp != null && temp.data == deleteData) {
            head = temp.next;
        }

        //Check if given delete data is present in a list or not
        while (temp != null && temp.data != deleteData) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null) {
            prev.next = temp.next;
        }
    }

    //Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public static void main(String[] args) {
        MySinglyLinkedList myList = new MySinglyLinkedList();

        myList.insertAtFirst(4);
        myList.insertAtFirst(6);
        myList.insertAfter(4, 9);
        myList.insertAfter(6, 7);
        myList.printList();
        myList.deleteElement(8);
        myList.deleteElement(4);
        myList.printList();
    }

}

