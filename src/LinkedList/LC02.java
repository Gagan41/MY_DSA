package LinkedList;

public class LC02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode sample = new ListNode();
        ListNode cur = sample;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;

            carry = sum / 10;
            int digit = sum % 10;

            cur.next = new ListNode();
            cur = cur.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return sample.next;
    }
}
