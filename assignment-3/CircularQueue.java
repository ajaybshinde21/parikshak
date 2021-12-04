import java.util.Scanner;

public class CircularQueue {

  public static void main(String[] args) {
    CircularQueue cq = new CircularQueue();
    String s = getUserInput();
    String[] s_arr = s.split(" ");
    int i = 0;
    while (i < s_arr.length) {
      switch (s_arr[i]) {
        case "1":
          i += 1;
          cq.enQueue(Integer.parseInt(s_arr[i]));
          break;
        case "2":
          cq.deQueue();
          break;
        case "3":
          cq.display();
          break;
        case "4":
          System.exit(0);
      }
      i += 1;
    }
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

  private void display() {
    if (!isEmpty()) {
      //taken from internet
      if (front <= rear) {
        for (int i = front; i <= rear; i++) {
          System.out.println(arr[i]);
        }
      } else {
        // print from front to end of array
        for (int i = front; i < arr.length; i++) {
          System.out.println(arr[i]);
        }
        for (int i = 0; i <= rear; i++) {
          System.out.println(arr[i]);
        }
      }
      System.out.println();
    }
  }

  private static String getUserInput() {
    Scanner input = new Scanner(System.in);
    return input.nextLine();
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void enQueue(int data) {
    if (size == 5) {
      System.out.println("overflow");
      return;
    }
    if (isEmpty()) {
      rear += 1;
      arr[rear] = data;
      front += 1;
      size += 1;
      return;
    }
    rear = (rear + 1) % arr.length;
    arr[rear] = data;
    size += 1;
  }

  public void deQueue() {
    if (isEmpty()) {
      System.out.println("underflow");
      return;
    }
    front = (front + 1) % arr.length;
    size -= 1;
    if (isEmpty()) {
      front = -1;
      rear = -1;
    }
  }
}
