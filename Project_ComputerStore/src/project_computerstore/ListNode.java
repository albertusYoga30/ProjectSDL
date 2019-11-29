package project_computerstore;

/**
 *
 * @author Nx
 */
public class ListNode {
    Object elemen;
    ListNode next;
    ListNode prev;

    public ListNode() {
    }

    public ListNode(Object elemen) {
        this.elemen = elemen;
    }

    public ListNode(Object elemen, ListNode next, ListNode prev) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }

    public Object getElemen() {
        return elemen;
    }

    public void setElemen(Object elemen) {
        this.elemen = elemen;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
    
}
