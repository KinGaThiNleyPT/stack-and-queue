public class Stack
{
	int max=9;
	int top= 0;
	int size =0;
	int [] Arr= new int [max];

	public void push(int e)
	{
		
		if(size==0)
		{
			Arr[0]=e;
			top=0;
		}
		else
		{
			 Arr[top+1]=e;
			top++;
		}
		size=size+1;
	}
	public int pop()
	{
		if(size==0)
		{
			System.out.println("The stack is empty");
		}
		else
		{
			top= Arr[top-1];
			size=size-1;
		}
		return Arr[top+1];		
	}
	
	public int size()
	{
		return size;
	}
	
	public int top()
	{
		if (top==0)
		{
			return 0;
		}
		return Arr[top];
	}
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Stack obj1=new Stack();
		obj1.push(2);
		obj1.push(7);
		obj1.push(2);
		
		System.out.println(obj1.isEmpty());
		System.out.println(obj1.size());
		System.out.println(obj1.top());
		System.out.println(obj1.pop());
	}
}

