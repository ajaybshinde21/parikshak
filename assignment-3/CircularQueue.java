import java.util.Scanner;

public class CircularQueue{
  public static void main(String[] args) {
    CircularQueue cq = new CircularQueue();
    while(true){
      int choice = getUserInput();
      switch (choice){
        case 1:
          cq.enQueue(getUserInput());
          break;
        case 2:
          cq.deQueue();
          break;
        case 3:
          cq.display();
          break;
        case 4:
          System.exit(0);
      }
    }
  }

  private void display() {
    if(!isEmpty()){
      for(int i = front ; i <= rear ; i++){
        System.out.println(arr[i]);
      }
    }
  }

  private static int getUserInput() {
    Scanner input = new Scanner(System.in);
    return input.nextInt();
  }

  private int arr[];
  private int rear;
  private int front;
  private int size;

  public CircularQueue() {
    arr = new int[5];
    rear = -1;
    front = -1;
  }
  public boolean isEmpty(){
    return size == 0;
  }
  public void enQueue(int data){
    if(size == 5){
      System.out.println("overflow");
      return;
    }
    if(isEmpty()){
      rear+=1;
      arr[rear] = data;
      front+=1;
      size+=1;
      return;
    }
    rear = (rear + 1) % arr.length;
    arr[rear] = data;
    size+=1;
  }
  public void deQueue(){
    if(isEmpty()){
      System.out.println("underflow");
      return;
    }
    front =( front +1 ) % arr.length;
    size-=1;
    if(isEmpty()){
      front = -1;
      rear = -1;
    }
  }



}