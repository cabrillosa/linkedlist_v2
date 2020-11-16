public class Linkedlist extends Retcode {
    private Node head;

    private Node createNode(int data) {
        return new Node(data);
    }

    public void addFirst(int data) {
        Node newnode = createNode(data);

        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void addLast(int data) {
        Node newnode = createNode(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public RET_CODE deleteFirst() {
        RET_CODE ret = RET_CODE.OK;
        
        if (head == null) {
            ret =  RET_CODE.ERROR_EMPTY_LIST;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        return ret;
    }

    /**
     * TODO:
     */
    public void addAfter(int index, int data){}
    public void addBefore(int index, int data){}
    public void deleteAfter(int index, int data){}
    public void deleteBefore(int index, int data){}

    public void deleteLast() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
