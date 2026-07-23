public class _206_rev_linked_list {
    public ListNode reverseList(ListNode head) {
    ListNode current = head;

    while (current != null) {
        System.out.println(current.val);
        current = current.next;
    }

}
    return head;

}
