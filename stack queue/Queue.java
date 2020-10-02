public class Queue{
	int[] arr;
	int rear;
	int len;
	int front;
	int first;

	public Queue(int e){
		len = 0;
		rear = -1;
		front = -1;
		first = -1;
		arr = new int[e];
	}
	public boolean isEmpty(){
		if (len == 0) {
			return true;	
		}
		return false;

	}

	public int len(){
		return len;
	}

	public int first(){
		if (isEmpty()) {
			return 0;	
		}
		else
		{
			return arr[front];
		}
	}
	public void enqueue(int e){
		if (isEmpty()) {
			arr[0] = e;
		else
		{
			arr[rear + 1] = e;
			rear = rear + 1;
		}
		len = len + 1;
	}
	public int dequeue(){
		if (isEmpty()) {
			return 0;
		}
		else
		{
			front = front + 1; 
		}
		len = len - 1;
		return arr[front-1];
	}
	public static void main(String[] args) 

        {	
        Queue obj= new Queue(10);
        obj.enqueue(10);
        obj.enqueue(2);
        obj.enqueue(30);
        obj.enqueue(134);
            
        System.out.println(obj.isEmpty());
        System.out.println(obj.len());
        System.out.println(obj.first());
        System.out.println(obj.dequeue());
        System.out.println(obj.len());        

        System.out.println("All test cases are correct");	
        }
}