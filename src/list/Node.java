package list;

public class Node <DataType> {
    DataType data;
    Node<DataType> next;

    public Node(DataType _data){
        data = _data;
        next = null;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Node<?> other = (Node<?>) obj;
        if(!other.data.equals(this.data)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Node{\ndata: " + data.toString() +"\n next: " + next.toString() + "}";
    }
}
