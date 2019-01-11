/**
 * @author Adam Sorrenti
 * @date 2019-01-10
 * @description This problem was asked by Google.
    An XOR linked list is a more memory efficient doubly linked list. Instead of each node holding next and prev fields,
    it holds a field named both, which is an XOR of the next node and the previous node. Implement an XOR linked list; it
    has an add(element) which adds the element to the end, and a get(index) which returns the node at index.
    If using a language that has no pointers (such as Python), you can assume you have access to get_pointer and
    dereference_pointer functions that converts between nodes and memory addresses.

 */
class Node {
    int data;
    Node npx;
    Node(int data){

        this.data = data;
        this.npx = null;
    }

}
public class Problem6 {// ASSUMING get_pointer(Node n) and dereference_pointer(int addr) ARE GIVEN!!!
    Node head = null;
    Node tail = null;

    int get_pointer(Node n){
        return n.hashCode();//Assuming this is the memory address, which it is not.
    }

    Node dereference_pointer(int addr){
        return new Node(addr);// Assuming this would give the proper result.
    }

    void add(int value){

        Node newNode = new Node(value);
        if (this.head == null)
            this.head = this.tail = newNode;
        else{
            newNode.npx = dereference_pointer(get_pointer(this.tail));
            this.tail.npx = dereference_pointer(get_pointer(this.tail.npx) ^ get_pointer(newNode));
            this.tail = newNode;
        }
    }
    Node get(int index){
        int prevAddr = 0;
        Node current = this.head;

        for (int i = 0; i < index-1; i++){
            int temp = get_pointer(current);
            current = dereference_pointer(prevAddr ^ get_pointer(current.npx));
            prevAddr = temp;
            if (get_pointer(current.npx) == prevAddr && i < index-2){
                System.out.println("Invalid Index.");
                return null;
            }
        }
        return current;
    }

}
