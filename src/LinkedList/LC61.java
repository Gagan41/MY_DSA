package LinkedList;

public class LC61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        ListNode cur = head;
        int n = 1;

        while(cur.next != null){
            cur = cur.next;
            n++;
        }

        cur.next = head;
        k = k % n;

        int step = n - k;
        ListNode newT = head;

        for(int i=1; i<step; i++){
            newT = newT.next;
        }

        ListNode newH = newT.next;
        newT.next = null;

        return newH;
    }
}
