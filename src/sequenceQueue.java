public class sequenceQueue<T> {
	final int MaxSize = 10;
	private T queueArray[];
	private int front, rear;

	public sequenceQueue() {
		front = rear = 0;
		queueArray = (T[]) new Object[MaxSize];
	}

	public void EnQueue(T obj) {
		if ((rear + 1) % queueArray.length == front) { // 如果队列满
			T[] p = (T[]) new Object[queueArray.length * 2]; // 则扩展存储空间
			if (rear == ((T[]) queueArray).length - 1) // 如果rear刚好指向数组最后一个元素
			{
				for (int i = 1; i <= rear; i++) // 则把第1~rear个数据复制到扩展后的存储空间
					p[i] = queueArray[i];
			} else { // 否则根据front和rear的指示情况复制
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
		queueArray[rear] = obj; // 把数据元素存入队列
	}

	public T DeQueue() {
		if (isEmpty()) {
			System.out.println("队列已空，无法出队！");
			return null;
		}
		front = (front + 1) % queueArray.length;
		return queueArray[front];
	}

	public T getHead() {
		if (isEmpty()) {
			System.out.println("队列已空，无法读取元素！");
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
