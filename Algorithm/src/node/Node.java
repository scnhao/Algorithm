package node;

public class Node {
	int data;
	Node next;
	public Node(int data){
		this.data = data;
	}
	public Node append(Node node){
		//this.next = node;
		Node currentNode = this;
		while(currentNode.next != null){
			currentNode = currentNode.next;
		}
		currentNode.next = node;
		return this;
	}
	public void show(){
		Node currentNode = this;
		System.out.println(currentNode.data + " ");
		while(currentNode.next != null){
			currentNode = currentNode.next;
			System.out.println(currentNode.data + " ");
		}
	}
	public void removeNext(){
		Node currentNode = this;
		Node NextNextNode = currentNode.next.next;
		currentNode.next = NextNextNode;
	}
	public void insert(){
		
	}
	public Node next(){
		return this.next;
	}
	public int getData(){
		return this.data;
	}
	public boolean isLast(){
		return next == null;
	}
}
