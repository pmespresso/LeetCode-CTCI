import java.util.HashMap;

public class RemoveDupsInUnsortedSinglyLinkedList {

    /*
    CTCI Ch2 Q1
    Write code to remove duplicates from an unsorted linked list.

    FOLLOW UP
    How would you do this if a temporary buffer is NOT allowed?
     */


    public static void display(ListNode head){
        ListNode n=head;
        while(n!=null){
            System.out.print(n.val + "->");
            n=n.next;
        }
    }

    /*
        Iterate over the nodes in head, adding each val to a hashmap.
        If the val already exists in the hashmap, then remove that val from the linked list.
     */
    public ListNode removeDups(ListNode head) {
        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();

        ListNode currNode = head.next;
        ListNode prevNode = head;

        ht.put(head.val, 1);
        while (currNode != null) {
            if (ht.containsKey(currNode.val)) {
                prevNode.next = currNode.next;
                currNode = currNode.next;
            } else {
                ht.put(currNode.val, 1);
                prevNode = currNode;
                currNode = currNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode ex = new ListNode(1);
        ex.next = new ListNode(1);
        ex.next.next = new ListNode(2);
        ex.next.next.next = new ListNode(1);
        ex.next.next.next.next = new ListNode(3);

        RemoveDupsInUnsortedSinglyLinkedList rdiusll = new RemoveDupsInUnsortedSinglyLinkedList();

        rdiusll.removeDups(ex);
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int value) {
        val = value;
    }
}
