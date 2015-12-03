

public class StackGeneric {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		stackInteger.push(3);
		stackInteger.push(4);
		stackInteger.push(5);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
	
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		stackString.push("Korea ");
		stackString.push(" Seoul");
		stackString.push("Korea ! Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
		

	}
}


