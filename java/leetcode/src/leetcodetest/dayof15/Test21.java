package leetcodetest.dayof15;

import java.util.List;
/*
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
示例：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
 */
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
public class Test21 {

	    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode ln=new ListNode(0);
	        ListNode cur=ln;
	        while(l1!=null&&l2!=null)
	        {
	            if(l1.val>l2.val)
	            {
	           cur.next=l2;
	            l2=l2.next;
	            cur=cur.next;
	            }
	            else
	            {
	              cur.next=l1;
	              l1=l1.next;
	              cur=cur.next;
	            }
	        }
	        if(l1==null)
	        {
	         cur.next=l2;	
	        }
	        if(l2==null)
	        {
	        	cur.next=l1;
	        }
	        return cur.next;
	    }
	    public static void main(String[] args) {
			
		}
	}

