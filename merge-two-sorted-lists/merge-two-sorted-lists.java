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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode ls = new ListNode(0);
        ListNode dummy = ls;
        
        
        while(true){
            
            if( list1 == null)
            {
                dummy.next = list2;
                break;
                
            }
            
           if( list2 == null)
            {
                dummy.next = list1;
                break;
                
            }  
            
         if( list1.val >= list2.val){
             dummy.next = list2;
             list2 = list2.next;
             
             
         } 
            
            else{
            dummy.next = list1;
             list1 = list1.next;    
                
            }
            
            
            
            
            
        dummy = dummy.next;    
            
            
            
        }
        
      return ls.next;  
        
        
    }
}