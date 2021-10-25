package linkedlist;

public class ChunkedReverse {

	static class Node {
		public Integer data;
		public Node next;

		Node(Integer data) {
			this.data = data;
		}
	}

	static class LinkedList {
		Node head;

		public void add(Integer data) {
			Node node = new Node(data);
			if (head == null) {
				head = node;
				return;
			}
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}

		public void reverse() {
			Node current = head;
			Node prv = null;
			Node next = null;
			while (current != null) {
				next = current.next;
				current.next = prv;
				prv = current;
				current = next;
			}
			head = prv;
		}

		public Node chunkReverse(Node start, int chunk) {
			if(start == null) {
				return null;
			}
			Node current = start;
			Node prv = null;
			int cnt = 0;
			while(current != null && cnt < chunk) {
				Node next = current.next;
				current.next=prv;
				prv=current;
				current=next;
				cnt++;
			}
			
			start.next = chunkReverse(current, chunk);
			return prv;
		}

		public void print() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.print();
		list.head = list.chunkReverse(list.head, 3);
		list.print();
	}
}
