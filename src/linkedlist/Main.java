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


//linkedlist���� �߿��� ��. ��屸��..
//���� ����Ʈ�� ���κ�ǰ�̹Ƿ� �ܺο� ������� �ʴ°� ����.

//head : ù��° ��带 �����ϴ� ������.
//tail : ������ ��带 ����.
//size :����� ũ��.

//���� ���������� data�� next������ ����.

//data�� ����� ��. next�� ������带 ����Ű�� ������.