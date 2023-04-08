public class sequenceQueue<T> {
	final int MaxSize = 10;
	private T queueArray[];
	private int front, rear;

	public sequenceQueue() {
		front = rear = 0;
		queueArray = (T[]) new Object[MaxSize];
	}

	public void EnQueue(T obj) {
		if ((rear + 1) % queueArray.length == front) { // ���������
			T[] p = (T[]) new Object[queueArray.length * 2]; // ����չ�洢�ռ�
			if (rear == ((T[]) queueArray).length - 1) // ���rear�պ�ָ���������һ��Ԫ��
			{
				for (int i = 1; i <= rear; i++) // ��ѵ�1~rear�����ݸ��Ƶ���չ��Ĵ洢�ռ�
					p[i] = queueArray[i];
			} else { // �������front��rear��ָʾ�������
				int i, j = 1;
				for (i = front + 1; i < queueArray.length; i++, j++)
					p[j] = queueArray[i];
				for (i = 0; i <= rear; i++, j++)
					p[j] = queueArray[i];
				front = 0;
				rear = queueArray.length - 1;
			}
			queueArray = p;
		}
		rear = (rear + 1) % queueArray.length;
		queueArray[rear] = obj; // ������Ԫ�ش������
	}

	public T DeQueue() {
		if (isEmpty()) {
			System.out.println("�����ѿգ��޷����ӣ�");
			return null;
		}
		front = (front + 1) % queueArray.length;
		return queueArray[front];
	}

	public T getHead() {
		if (isEmpty()) {
			System.out.println("�����ѿգ��޷���ȡԪ�أ�");
			return null;
		}
		return queueArray[(front + 1) % queueArray.length];
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public int size() {
		return (rear - front + queueArray.length) % queueArray.length;
	}

	public void nextOrder() {
		int i, j = front;
		for (i = 1; i <= size(); i++) {
			j = (j + 1) % queueArray.length;
			System.out.println(queueArray[j]);
		}
	}
	public void clear()
	{
	  	front=rear=0;
	}

}
