package linkedlist;

public class Main {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		
		System.out.println(numbers);
	}
}


//linkedlist에서 중요한 건. 노드구현..
//노드는 리시트의 내부부품이므로 외부에 노출되지 않는게 좋음.

//head : 첫번째 노드를 지정하는 참조값.
//tail : 마지막 노드를 지정.
//size :노드의 크기.

//노드는 내부적으로 data와 next변수를 가짐.

//data는 노드의 값. next는 다음노드를 가리키는 참조값.