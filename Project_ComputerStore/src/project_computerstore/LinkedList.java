package project_computerstore;

import java.util.NoSuchElementException;

/**
 *
 * @author Nx
 */
public class LinkedList {

    private ListNode head;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LinkedList() {
        head = new ListNode();
        head.next = head;
        head.prev = head;
        size = 0;

    }

    public void cetak() {
        int i = 1;
        ListNode bantu = head.next;
        while (bantu != head) {
            System.out.println(bantu.elemen);
            bantu = bantu.next;
            i++;
        }
    }

    private void addBefore(ListNode bantu, Object elemen) {
        ListNode baru = new ListNode(elemen);
        baru.next = bantu;
        baru.prev = bantu.prev;
        bantu.prev.next = baru;
        bantu.prev = baru;
        size++;
    }

    private Object remove(ListNode bantu) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            bantu.prev.next = bantu.next;
            bantu.next.prev = bantu.prev;
            size--;
            return bantu.elemen;
        }
    }

    public void addFirst(Object elemen) {
        addBefore(head.next, elemen);

    }

    public void addLast(Object elemen) {
        addBefore(head, elemen);
    }

    public Object removeFirst(ListNode bantu) {
        return remove(head.next);
    }

    public Object removeLast() {
        return remove(head.prev);
    }

    public Object removeItem(Object cari) {
        search(cari);
//        ListNode bantu = new ListNode(cari);
//        bantu = head.next;
//        while (bantu != head) {
//            if (((Comparable) cari).compareTo(bantu.elemen) == 0) {
//                return remove((ListNode) bantu.elemen);
//            } else {
//                bantu = bantu.next;
//            }
//        }
//        return -1;
    }

    public void clearAll() {
        head.next = head;
        head.prev = head;
    }

    public Object search(Object cari) {
        ListNode bantu = new ListNode(cari);
        if (isEmpty()) {
            return -1;
        } else {
            bantu = head.next;
            while (bantu != head) {
                if (((Comparable) cari).compareTo(bantu.elemen) == 0) {
                    return 1;
                } else {
                    bantu = bantu.next;
                }
            }
            return -1;
        }
    }

    public boolean isEmpty() {
        if (head.next == head) {
            return true;
        } else {
            return false;
        }
    }

}
