package linkedlist;

public class LinkedList {
	// 첫번째 노드를 가리키는 필드
	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		// 데이터가 저장될 필드
		private Object data;

		// 다음 노드를 가리키는 필드
		private Node next;

		// 생성자
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

	}

	// 노드의 내용을 쉽게 출력해서 확일해볼 수 있는 기능
	@Override
	public String toString() {
		// 노드가 없다면 []을 리턴
		if (head == null)
			return "[]";

		// 탐색시작
		Node temp = head;
		String str = "[";

		// 다음 노드가 없을 때까지 반복.
		// 마지막 노드는 다음 노드가 없으므로 마지막 노드는 제외
		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}

		// 마지막 노드를 출력결과에 포함시킴.
		str += temp.data;
		return str + "]";
	}

	public void addFirst(Object input) {
		// 노드를 생성.
		Node newNode = new Node(input);

		// 새로운 노드의 다음 노드로 헤드를 지정.//헤드에는 원래 있떤 노드값이 들어있지.
		newNode.next = head;

		// 헤드로 새로운 노드를 지정함.
		head = newNode;
		size++;

		if (head.next == null) {
			tail = head;
		}
	}

	// tail에 데이터 추가
	public void addLast(Object input) {
		// 노드 생성
		Node newNode = new Node(input);

		// 리스트의 노드가 없다면, 첫번째 노드를 추가하는 메소드를 사용.
		if (size == 0) {
			addFirst(input);
		} else {
			// 마지막 노드의 다음 노드로 생성한 노드를 지정.
			tail.next = newNode;

			// 마지막 노드를 갱신.
			tail = newNode;

			size++;
		}
	}

	// 중간에 추가
	Node node(int index) {
		Node x = head;

		for (int i = 0; i < index; i++)
			x = x.next;
		return x;

	}

	// 특정 위치에 노드 추가
	public void add(int k, Object input) {
		// 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용함
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k - 1);

			// k번째 노드를 temp2로 지정.
			Node temp2 = temp1.next;

			// 새로운 노드를 생성
			Node newNode = new Node(input);

			// temp1의 다음 노드로 새로운 노드를 지정.
			temp1.next = newNode;

			// 새로운 노드의 다음 노드로 temp2를 지정.
			newNode.next = temp2;
			size++;

			// 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이기 때문 tail로 지정
			if (newNode.next == null)
				tail = newNode;
		}
	}

}
