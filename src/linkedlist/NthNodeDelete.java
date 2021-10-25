package linkedlist;

public class NthNodeDelete {

	static class Node {
		public Node next;
		public Integer data;

		Node(Integer data) {
			this.data = data;
		}

	}

	static class LinkedList {
		public Node head;

		public void add(Integer data) {
			Node node = new Node(data);
			if (head == null) {
				head = node;
			} else {
				Node current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = node;
			}

		}

		public void print() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}

		public void delete(Integer pos) {
			Node current = head;
			Node prv = null;
			int cnt = 1;
			while (cnt < pos) {
				prv = current;
				current = current.next;
				if(current == null) {
					System.out.println("Invalid Position");
					return;
				}
				cnt++;
			}
			if (cnt == 1)
				head = head.next;
			else
				prv.next = current.next;
		}
		
		public void deleteFromBack(Integer pos) {
			Node current = head;
			Node slow = null; 
			Node prv = null;
			int cnt = 1;
			while(current != null) {
				if(cnt >= pos) {
					if(slow == null)
						slow = head;
					else {
						prv = slow;
						slow = slow.next;
					}
						
				}
				current = current.next;
				cnt++;
			}
			if(pos > cnt) 
				System.out.println("Invalid Position");
			else if (prv == null) 
				head = head.next;
			else
				prv.next = slow.next;
			
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		list.print();
		list.deleteFromBack(1);
		list.print();

	}
}
