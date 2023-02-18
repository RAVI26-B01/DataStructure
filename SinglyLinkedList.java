package LinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
	static Node head =null;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		while(true) {
			System.out.println("Press 1 to Insert Front");
			System.out.println("Press 2 to Insert Rare");
			System.out.println("Press 3 to Delete Front");
			System.out.println("Press 4 to Delete Rare");
			System.out.println("Press 5 to Insert At Index");
			System.out.println("Press 6 to Delete At Index");
			System.out.println("Press 10 to find middle element in single pass");
			System.out.println("Press 8 to Display");
			
			int key=scan.nextInt();  
			switch (key) {
			case 1:Insert_front();break;
			case 2:Insert_rare();break;
			case 3:Delete_front();break;
			case 4:Delete_rear();break;
			case 5:Insert_at_index();break;
			case 6:Delete_at_index();break;
			case 10:FindMiddleNodeInSinglePass();break;
			case 8:display();break;
			

			default:System.exit(0);
				break;
			} 
		}
	}
	

	private static void FindMiddleNodeInSinglePass() {
		Node current =null;
		Node middle=null;
		int length=0;
		if(head==null) {
			System.err.println("No elements found");

		}
		else if(head.next==null) {
			System.out.printf("Middle Element is: %d\n",head.data);
		}else {
			current=head;
			middle=head;
			while(current.next!=null){
				length++;
				if(length%2==0){
					middle=middle.next;
				}
				current=current.next;
			}
			System.out.printf("Middle Element is: %d\n",middle.data);
		}
	}


	private static void Delete_at_index() {
		Node temp = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Index:  ");
		int index=scan.nextInt();
		if(head==null) {
			System.err.println("deletion not possilbe");

		}
		else if(head.next==null) {
			System.err.printf("Element deleted is: %d\n",head.data);
			head=null;
		}else {
			temp=head;
			while(temp.next.next!=null && --index>0) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
	}


	private static void Insert_at_index() {
		Node temp = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Index:  ");
		int index=scan.nextInt();
		System.out.print("Enter data to be inserted ");
		int n=scan.nextInt();
		Node node = new Node();
		node.data=n;
		node.next=null;
		if(head==null) {
			head=node;
		}
		 if (index < 0)
	           System.err.print("Invalid index");
		else if(index==0) {
			node.next=head;
			head=node;
		}
		else {
			temp=head;
			while(temp.next!=null && --index>0) {
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
		}
		
	}


	private static void Delete_rear() {
		Node temp = null;
		if(head==null) {
			System.err.println("deletion not possilbe");

		}
		else if(head.next==null) {
			System.err.printf("Element deleted is: %d\n",head.data);
			head=null;
		}
		else {
			temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			System.err.printf("Element deleted is: %d\n",temp.next.data);
			temp.next=null;
		}
	}


	private static void Delete_front() {
		Node temp = null;
		if(head==null) {
			System.err.println("deletion not possilbe");

		}
		else if(head.next==null) {
			System.err.printf("Element deleted is: %d\n",head.data);
			head=null;
		}else {   
			temp=head;
			head=head.next;
			System.err.printf("Element deleted is: %d\n",temp.data);
			temp=null;
		}
	}
 

	private static void Insert_rare() {
		Node temp = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter data to be inserted ");
		int n=scan.nextInt();
		Node node = new Node();
		node.data=n;
		node.next=null;
		if(head==null) {
			head=node;
		}
		else {
			temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
	}


	private static void display() {
		Node temp = null;
		if(head==null) {
			System.err.println("Display not possilbe");

		}
		else if(head.next==null) {
			System.out.println(head.data);
		}else {
			temp=head;
			while(temp!=null) {
				System.out.printf("%d\t",temp.data);
				temp=temp.next;
			}
			System.out.println();
		}  
	}


	private static void Insert_front() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter data to be inserted ");
		int n=scan.nextInt();
		Node node = new Node();
		node.data=n;
		node.next=null;
		
		if(head==null) {
			head=node;
		}else {
			node.next=head;
			head=node;
		}
	}
}

