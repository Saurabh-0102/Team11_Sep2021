class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}
class LinkedList{
	Node head;
	
	LinkedList(){
		head = null;
	}

	public boolean insert(int data){
		Node newNode = new Node(data);
		if(newNode == null){
			return false;
		}
		if (head == null){
			head = newNode;
			return true;
		}
		// to store the element at last
		
		Node last = head;
		while(last.next!=null){
			last = last.next;
		}
		last.next= newNode;
		return true;
		
	}
	public boolean delete(int pos){
		if(head== null||pos<0){
			return false;
		}
		if(pos == 1){
			head = head.next;
			return true;
		}

		Node prev = head;
		for(int i=1;i<pos-1;i++){
			prev = prev.next;
		}
		Node del = prev.next;
		prev.next = del.next;
		return true;
	}
	
	

	public void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
			
			System.out.println();	
	}
}

class TestLinkedList{
	public static void main(String []args){
		LinkedList ll = new LinkedList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.delete(1);
		ll.display();
		
	}
} 
