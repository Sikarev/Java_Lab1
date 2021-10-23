package list;

/**
 *
 * @author Roman-
 * @param <DataType> Universal Type of data
 */

public class LinkedList<DataType> {
    private int size;
    private Node<DataType> head;

    /**
     *  List is creating object(empty)
     */
    public LinkedList() {
        size = 0;
        head = null;
    }

    /**
     * Checking if object is empty
     */
    public boolean isEmpty() {
        return head == null;
    }
    /**
     * getSize Getting Size of object
     */
    public int getSize() {
        return size;
    }
    /**
     * pushback Add element in the end
     */
    public void pushBack(DataType data){
        if(isEmpty()){
            head = new Node<DataType>(data);
        } else {
            Node<DataType> temp = head;

            while( temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<DataType>(data);
        }
        size++;
    }
    /**
     * pushFront Add element in the begining of object
     */
    public void pushFront(DataType data){
        if(isEmpty()){
            head = new Node<DataType>(data);
        } else {
            Node<DataType> tmp = new Node<DataType>(data);
            tmp.next = head;
            head = tmp;
        }
        size++;
    }
    /**
     * insertAt add in position which can be entered by user
     */
    public void insertAt(int index, DataType data) throws Exception {
        if(index > size || index<0) {
            throw new Exception("Out of list range");
        }
        if(index == size){
            pushBack(data);
        } else if(index == 0){
            pushFront(data);
        } else {
            int step = 0;
            Node<DataType> temp = head;

            while(step != index-1) {
                temp = temp.next;
                step++;
            }
            Node<DataType> reference = temp.next;
            temp.next = new Node<DataType>(data);
            temp.next.next = reference;
            size++;
        }
    }
    /**
     * popBack this function deleting last element in the object
     */
    public void popBack() throws Exception{
        if(isEmpty()){
            throw new Exception("Incorrect popBack. List is empty");
        }
        if(size == 1){
            head = null;
        } else {
            Node<DataType> temp = head;

            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }
    /**
     * popFront Deleting first element in the object
     */
    public void popFront() throws Exception {
        if(isEmpty()){
            throw new Exception("Incorrect popFront. List is empty");
        }
        head = head.next;
        size--;
    }

    /**
     * eraseAt Deleting element in position which is entered by user
     */
    public void eraseAt(int index) throws Exception {
        if(index >= size){// || index<0) {
            throw new Exception("Out of list range");
        }
        if(index == 0){
            popFront();
        } else if( index == size-1){
            popBack();
        } else {
            Node<DataType> temp = head;

            int step = 0;
            while( step != index-1){
                temp = temp.next;
                step++;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    /**
     * getAt allows to get
     */
    public DataType getAt(int index) throws Exception {
        if(index >= size || index<0) {
            throw new Exception("Out of list range");
        }
        Node<DataType> temp = head;

        int step = 0;
        while(step != index){
            temp = temp.next;
            step++;
        }

        return temp.data;
    }

    @Override
    /**
     * Checking if object are equal
     */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        LinkedList<?> other = (LinkedList<?>) obj;
        if(this.size != other.size) {
            return false;
        }
        Node<?> tempMine = head;
        Node<?> tempOther = other.head;
        while(head != null){
            if(!tempMine.equals(tempOther)){
                return false;
            }
            tempMine = tempMine.next;
            tempOther = tempOther.next;
        }
        return true;
    }
    /**
     * Showing us all elements in list
     */
    public void printList() {
        if (size == 0) {
            System.out.println("Empty list");
            return;
        }
        var h = head;
        System.out.println("List: ");
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println();
    }
    /**
     * Converting into string
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");

        Node<?> temp = head;
        while(temp != null){
            str.append(temp.data.toString()).append("; ");
            temp = temp.next;
        }
        return "LinkedList{\n  size: " + size +"\n  list: " + str + "\n}";
    }
}
