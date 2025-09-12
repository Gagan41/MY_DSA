package LinkedList;

public class LC206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    // Helper to print the linked list
    private static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + (cur.next != null ? " -> " : ""));
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        System.out.print("Original List: ");
        printList(head);

        // Reverse
        LC206 sol = new LC206();
        ListNode reversed = sol.reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversed);
    }
}

//Given the head of a singly linked list, reverse the list, and return the reversed list.
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]
