public class SequenceStack<T> {
	final int MaxSize = 10;
	private T[] stackArray;
	private int top; // ջ��ָ�룬���ջ��Ԫ�ص������±�ֵ

	public SequenceStack() {
		top = -1;
		stackArray = (T[]) new Object[MaxSize];
	}

	public SequenceStack(int n) {
		if (n <= 0) {
			System.out.println("���鳤��Ҫ����0�������˳��������У�");
			System.exit(1);
		}
		top = -1;
		stackArray = (T[]) new Object[n];
	}

	public void push(T obj) {
		if (top == stackArray.length - 1) { // ���ջ����������չ��洢�ռ�
			T[] p = (T[]) new Object[top * 2 + 2]; // ��+2����Ŀ����Ϊ�˷�ֹԭ�����ǿ�ջ
			for (int i = 0; i <= top; i++)
				p[i] = stackArray[i];
			stackArray = p;
		}
		top++;
		stackArray[top] = obj;
	}

	public T pop() {
		if (top == -1) {
			System.out.println("����ջ�ѿգ��޷��ٳ�ջ");
			return null;
		}
		top--;
		return stackArray[top + 1];
	}

	public T getHead() {
		if (top == -1) {
			System.out.println("����ջ�ѿ�");
			return null;
		}
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return top + 1;
	}

	public void nextOrder()
	 { 
	       for(int i=top;i>=0;i--)
	            System.out.print(stackArray[i]+"\t");
	       System.out.println("\n");
	 }

	public void clear() {
		top = -1;
	}

}
