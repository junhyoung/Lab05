
class Node <T> {
	Node<T> next;
	T data;
	public Node(){
	}
	public Node(T data) {
		this.data=data;	
        }
	public T getData() {
		return data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> nextData) {
		next=nextData;
	}
	
}