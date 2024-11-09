
public class addinginlinkedlist {
    Node head;
    class Node{
        String data;
        Node Next;

        Node (String data){
            this.data=data;
            this.Next=null;

        }
    }
    //addition 
    //first 
    public void addFirst(String data)
{
    Node newNode=new Node(data);
    if (head == null){
        head= newNode;
        return;

    }
    newNode.Next=head;
    head=newNode;
}
//last
public void addLast(String data){
    Node newNode=new Node(data);
    if (head == null){
        head= newNode;
        return;

    }
    Node currNode=head; //new node created for traversal
    while (currNode.Next!=null){
        currNode=currNode.Next;

    }
    currNode.Next=newNode;


}
//print
public void printList(){
    if (head==null){
        System.out.println("List is empty");

    }
    Node currNode=head;
    while (currNode!=null) {
        System.out.println(currNode.data="->");
        currNode=currNode.Next;
    }
    System.out.println("Null");
}
public static void main(String[] args) {
    addinginlinkedlist list=new addinginlinkedlist();
    list.addFirst("A");
    list.addFirst("is in");
    list.addFirst("the list");
}
    
}