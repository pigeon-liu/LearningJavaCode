package List;

import java.util.ArrayList;
import java.util.List;

class Node{
    public int val;
    public Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class MyLinkedList {
    public Node head;
    public int usedSize;
    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    int get(int index) {
        //Node cur = this.head;
        if (index < 0 || index >= size()){
            return -1;
        }
        if (index == 0){
            return this.head.val;
        }
        for (int i = 0; i < index ;i++){
            this.head = this.head.next;
        }
        return this.head.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (this.head == null){
            this.head = node;
            this.usedSize++;
            return;
        }
        node.next = this.head;
        this.head = node;
        this.usedSize++;

    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    void addAtTail(int val) {
        Node node =  new Node(val);
        Node cur = this.head;
        if (cur == null){
            cur = node;
            this.usedSize++;
            return;
        }
        for (int i = 0;i<this.usedSize-1;i++){
            cur = cur.next;
        }
        cur.next = node;
        this.usedSize++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public  void addAtIndex(int index, int val) {
        Node node = new Node(val);
        if (index <= 0){
            addAtHead(val);
            return;
        }
        if (index == this.usedSize){
            addAtTail(val);
            return;
        }
        if (index > this.usedSize){
            return;
        }
        Node cur = this.head;
        for (int i = 1; i<index;i++){
            cur = cur.next;
        }
        if (cur.next == null){
            cur.next = node;
            return;
        }
        Node ret = cur.next;
        cur.next = node;
        node.next = ret;
        this.usedSize++;

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        Node cur = this.head;
        if (index < 0 || index > size()-1){
            return;
        }
        if (index == 0){
            cur = cur.next;
            this.usedSize--;
            return;
        }
        for (int i = 1; i<index;i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        this.usedSize--;
    }

    public int size(){
        return this.usedSize;
    }
}

