public class RemoveDuplicatesInSortedSinglyLinkedList<T> {


    @SuppressWarnings("unchecked")
    public ListNode<T> removeDups(ListNode<T> head) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode p = dummy;

        while (p.next != null && p.next.next != null) {
            if (p.next.val == p.next.next.val) {
                T duplicate = (T) p.next.val;
                while (p.next.next != null && p.next == duplicate) {
                    p.next = p.next.next;
                }
            }
            p = p.next;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode<Integer> ex = new ListNode(1);
        ex.next = new ListNode(1);
        ex.next.next = new ListNode(1);
        ex.next.next.next = new ListNode(2);
        ex.next.next.next.next = new ListNode(3);
        RemoveDuplicatesInLinkedList x = new RemoveDuplicatesInSortedSinglyLinkedList();


    }
}

class ListNode<T> {
    T val;
    ListNode next;

    ListNode(T x) {
        val = x;
    }
}
