class Stack{
	int[] arr;
	int capacity;
	int top;
	Stack(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	boolean isEmpty(){
		return top == -1;
	}

	boolean isFull(){
		return top == capacity -1;
		}
	void pushToStack(int data){
		if(isFull()){
			System.out.println("Stack Overflow!");
			return;
		}
		arr[++top] = data;
	}

	int popFromStack(){
		if(isEmpty()){
			System.out.println("Stack Underflow!");
			return -1;
		}
		return arr[top--];
	}

	int peek(){
		if(isEmpty()){
			System.out.println("Nothing here in the stack");
			return -1;
		}
		return arr[top];
	}	
	void display(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Elemment is the Stack are as follow : ");
		for(int i = 0; i <= top; i++){
			System.out.print(arr[i] + " ");
		}
}
