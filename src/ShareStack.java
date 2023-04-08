public class ShareStack<T> {
	private T[] A; 
	private int top1; 
	private int top2; 
	private static Integer StackSize = 16; 
	private static final Integer S_1 = 1; 
	private static final Integer S_2 = 2; 
	   
	public ShareStack() {
		A = (T[])new Object[StackSize];
		this.top1 = -1;
		this.top2 = StackSize;
	}

	public ShareStack(int size) {
		StackSize = size;
		A = (T[])new Object[StackSize];
		this.top1 = -1;
		this.top2 = StackSize;
	}

	                     
	public boolean push(int stackNum, T data) {
		if (top1 + 1 == top2) {
			System.out.println("栈已满,不能再加入元素了..");
			return false;
		}
		if (stackNum == S_1) {
			A[++top1] = data;
			return true;
		} else if (stackNum == S_2) { 
			A[--top2] = data; 
			return true;
		} else {
			System.out.println("请输入正确的栈编号: 1 或 2");
			return false;
		}
	}

	public T pop(int stackNum) {
		if (stackNum == S_1) { 
			if (top1 == -1) {
				System.out.println("栈1已经是空栈...");
				return null;
			}
			return (T) A[top1--]; 
		} else if (stackNum == S_2) { 
			if (top2 == StackSize) {
				System.out.println("栈2已经是空栈...");
				return null;
			}
			return (T) A[top2++]; 
		} else {
			System.out.println("请输入正确的栈编号: 1 或 2");
			return null;
		}
	}


	public T getTop(int stackNum) {
		if (stackNum == S_1) {
			if (this.top1 != -1) {
				return (T) A[top1];
			}
		} else if (stackNum == S_2) {
			if (stackNum != StackSize) {
				return (T) A[top2];
			}
		} else {
			System.out.println("请输入正确的栈编号: 1 或 2");
		}
		return null;
	}

	public boolean isEmpty() {
		return this.top1 == -1 && this.top2 == StackSize;
	}

	public boolean clear() {
		this.top1 = -1;
		this.top2 = StackSize;
		return true;
	}

	public static void main(String[] args) throws Exception {
		ShareStack<Integer> s = new ShareStack<Integer>();
		s.push(1, 1);
		s.push(1, 2);
		s.push(1, 3);
		s.push(2, 1);
		s.push(2, 2);
		s.push(2, 3);

		//ejel


		System.out.println("栈是否为空？(true or false?)"+s.isEmpty());
		System.out.println("栈1的栈顶元素是"+s.getTop(1));
		System.out.println("栈2的栈顶元素是"+s.getTop(2));
		System.out.println("取出的栈1栈顶元素是"+s.pop(1));
		System.out.println("取出的栈2栈顶元素是"+s.pop(2));
		s.clear();
		System.out.println("栈是否为空？(true or false?)"+s.isEmpty());
	}
}
 


