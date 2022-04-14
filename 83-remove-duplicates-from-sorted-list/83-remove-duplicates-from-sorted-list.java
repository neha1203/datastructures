/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        
        
        ListNode p = head;
        
        if(p == null)
            return null;
        
        while( p != null){
            if( p.next == null)
                break;
            
            if(p.val == p.next.val)
                p.next = p.next.next;
            
            else
                p= p .next;
            
            
            
            
            
            
        }
        
        
        return head;
        
    }
}