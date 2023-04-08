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
			System.out.println("ջ����,�����ټ���Ԫ����..");
			return false;
		}
		if (stackNum == S_1) {
			A[++top1] = data;
			return true;
		} else if (stackNum == S_2) { 
			A[--top2] = data; 
			return true;
		} else {
			System.out.println("��������ȷ��ջ���: 1 �� 2");
			return false;
		}
	}

	public T pop(int stackNum) {
		if (stackNum == S_1) { 
			if (top1 == -1) {
				System.out.println("ջ1�Ѿ��ǿ�ջ...");
				return null;
			}
			return (T) A[top1--]; 
		} else if (stackNum == S_2) { 
			if (top2 == StackSize) {
				System.out.println("ջ2�Ѿ��ǿ�ջ...");
				return null;
			}
			return (T) A[top2++]; 
		} else {
			System.out.println("��������ȷ��ջ���: 1 �� 2");
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
			System.out.println("��������ȷ��ջ���: 1 �� 2");
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


		System.out.println("ջ�Ƿ�Ϊ�գ�(true or false?)"+s.isEmpty());
		System.out.println("ջ1��ջ��Ԫ����"+s.getTop(1));
		System.out.println("ջ2��ջ��Ԫ����"+s.getTop(2));
		System.out.println("ȡ����ջ1ջ��Ԫ����"+s.pop(1));
		System.out.println("ȡ����ջ2ջ��Ԫ����"+s.pop(2));
		s.clear();
		System.out.println("ջ�Ƿ�Ϊ�գ�(true or false?)"+s.isEmpty());
	}
}
 


