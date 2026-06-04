package LinkedList;

public class LC24 {
    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode(0);
        d.next = head;

        ListNode prev = d;

        while(prev.next != null && prev.next.next != null){
            ListNode f = prev.next;
            ListNode s = f.next;

            f.next = s.next;
            s.next = f;
            prev.next = s;

            prev = f;
        }

        return d.next;
    }
}
