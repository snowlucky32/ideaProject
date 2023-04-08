public class SequenceStack<T> {
	final int MaxSize = 10;
	private T[] stackArray;
	private int top; // 栈顶指针，存放栈顶元素的数组下标值

	public SequenceStack() {
		top = -1;
		stackArray = (T[]) new Object[MaxSize];
	}

	public SequenceStack(int n) {
		if (n <= 0) {
			System.out.println("数组长度要大于0，否则退出程序运行！");
			System.exit(1);
		}
		top = -1;
		stackArray = (T[]) new Object[n];
	}

	public void push(T obj) {
		if (top == stackArray.length - 1) { // 如果栈已满，则扩展其存储空间
			T[] p = (T[]) new Object[top * 2 + 2]; // “+2”的目的是为了防止原本就是空栈
			for (int i = 0; i <= top; i++)
				p[i] = stackArray[i];
			stackArray = p;
		}
		top++;
		stackArray[top] = obj;
	}

	public T pop() {
		if (top == -1) {
			System.out.println("数据栈已空，无法再出栈");
			return null;
		}
		top--;
		return stackArray[top + 1];
	}

	public T getHead() {
		if (top == -1) {
			System.out.println("数据栈已空");
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
