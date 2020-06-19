package linkedlist;

public class LinkedList {
	// ù��° ��带 ����Ű�� �ʵ�
	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		// �����Ͱ� ����� �ʵ�
		private Object data;

		// ���� ��带 ����Ű�� �ʵ�
		private Node next;

		// ������
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

	}

	// ����� ������ ���� ����ؼ� Ȯ���غ� �� �ִ� ���
	@Override
	public String toString() {
		// ��尡 ���ٸ� []�� ����
		if (head == null)
			return "[]";

		// Ž������
		Node temp = head;
		String str = "[";

		// ���� ��尡 ���� ������ �ݺ�.
		// ������ ���� ���� ��尡 �����Ƿ� ������ ���� ����
		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}

		// ������ ��带 ��°���� ���Խ�Ŵ.
		str += temp.data;
		return str + "]";
	}

	public void addFirst(Object input) {
		// ��带 ����.
		Node newNode = new Node(input);

		// ���ο� ����� ���� ���� ��带 ����.//��忡�� ���� �ֶ� ��尪�� �������.
		newNode.next = head;

		// ���� ���ο� ��带 ������.
		head = newNode;
		size++;

		if (head.next == null) {
			tail = head;
		}
	}

	// tail�� ������ �߰�
	public void addLast(Object input) {
		// ��� ����
		Node newNode = new Node(input);

		// ����Ʈ�� ��尡 ���ٸ�, ù��° ��带 �߰��ϴ� �޼ҵ带 ���.
		if (size == 0) {
			addFirst(input);
		} else {
			// ������ ����� ���� ���� ������ ��带 ����.
			tail.next = newNode;

			// ������ ��带 ����.
			tail = newNode;

			size++;
		}
	}

	// �߰��� �߰�
	Node node(int index) {
		Node x = head;

		for (int i = 0; i < index; i++)
			x = x.next;
		return x;

	}

	// Ư�� ��ġ�� ��� �߰�
	public void add(int k, Object input) {
		// ���� k�� 0�̶�� ù��° ��忡 �߰��ϴ� ���̱� ������ addFirst�� �����
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k - 1);

			// k��° ��带 temp2�� ����.
			Node temp2 = temp1.next;

			// ���ο� ��带 ����
			Node newNode = new Node(input);

			// temp1�� ���� ���� ���ο� ��带 ����.
			temp1.next = newNode;

			// ���ο� ����� ���� ���� temp2�� ����.
			newNode.next = temp2;
			size++;

			// ���ο� ����� ���� ��尡 ���ٸ� ���ο� ��尡 ������ ����̱� ���� tail�� ����
			if (newNode.next == null)
				tail = newNode;
		}
	}

}
