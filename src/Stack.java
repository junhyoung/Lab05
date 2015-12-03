
class Stack<T> {
	int top=0;
	Node<T> currNode;
	
	public T pop() {
		if(top==0)
			return (T) "Error : No data";
		else{
		T tempData=currNode.getData();
		if(top!=1)
			currNode=currNode.getNext();
		else
			currNode=null;
		top--;
		
		return tempData;
		
		}
	}
	
	public void push(T data) {
		if(top==0)
			currNode=new Node<T>(data);
		else{
			Node<T> tempNode= new Node<T>(data);
			tempNode.setNext(currNode);
			currNode=tempNode;
		}
		top++;
	}
}
