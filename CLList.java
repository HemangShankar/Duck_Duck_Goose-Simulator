public class CLList {

//Declares the head
 private Node head;
 
 static class Node {
   //Data value for each node in the linked list
   private Node next;
   private Object data;

   //Gives each node their data values
   public Node(Object dataValue) {
     next = null;
     data = dataValue;
   }
 }
  
//Constructor
 public CLList() {
   head = null;
 }

  //Getter methods
  public Node getNext(Node n) { return n.next; }
  public Object getData(Node n) { return n.data; }

  //Method to insert the value in the front of a linked list
  public void InsertAtHead(Object info) {
   Node temp = new Node(info);
   temp.next = head;
   head = temp;
 }

  //Method to insert an item in the linked list
  public void InsertItem(Node before, Object info) {
    Node temp = new Node(info);
    
    if(before.next == null)
      temp.next = head;
    else
      temp.next = before.next;
    
    before.next = temp;
 }

  //Method to insert an item at the end of the linked list
  public void InsertAtTail(Object info) {
    Node temp = new Node(info);
    temp.next = head;
    
    if(head.next == null)
      head.next = temp;
    else
    {
      Node previousNode = head;
      while (previousNode.next !=head ) {
        previousNode = previousNode.next;
      }
      previousNode.next = temp;
    }
 }

 //Method to print all the values in the linked list
 public void PrintList() {
   Node iterator = head;
   while (iterator != null) {
     System.out.println(iterator.data);
     if (iterator.next == head)
       break;
    iterator = iterator.next;
   }
 }

  //Method to get the length of the circular linked list
  public int lengthOfCLL(){
    //Initialized the length of the linked list
    int length = 0;
    Node iterator = head;
    //Uses a while loop to reach the end of the linked list
    while (iterator != null) {
      length++;
      if (iterator.next == head)
        break;
      iterator = iterator.next;
    }
    return length;
 }

//Deletes the node of the linked list for each player eliminated
 public boolean DeleteNode(Node Duck) {
   Node temp = Duck;

   //Checks if the node is the last value in the linked list
   if (temp == null)
     return false;

   //Sets the node to the value of the first value in the linked list
   Node iterator = head;

   //Used a while loop to iterate through the linked list to set the value of the new node to the next
   while (iterator != null && iterator.next != temp)
     iterator = iterator.next;
 
   iterator.next = temp.next;
    if (temp==head)
      head=iterator;

   //Prints out which player got eliminated
   System.out.println(getData(temp)+" is Goose and hence eliminated.\n");
   return true;
 
 }
  //Method to find the winner of the game
  public void DuckDuckGoose(){

    //Sets node to the value of first value in the linked list
    Node iterator = head;
    //Uses a while loop to make sure the last element references to the first value in the linked list
    while(lengthOfCLL() > 1){
      for (int index =1; index<3;index++){
        //For loop to find out the person who is a duck by iterating through the linked list
        System.out.println(getData(iterator)+" is Duck");
        iterator=iterator.next;
      }
      //Makes sure there is no value after the linked list
      if(DeleteNode(iterator))
        iterator=iterator.next;
    }
    //Prints out the winner of the Duck Duck Goose Game
    System.out.println("\n" + getData(head) + " is the winner in this game");
    }
  }
