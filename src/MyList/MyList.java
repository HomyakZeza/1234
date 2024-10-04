package MyList;

public class MyList<T> {
    private MyNode<T> head;
    private int size;
    public MyList(T headValue, int size) {
        head.setValue(headValue);
        this.size = size;
    }

    public void add(T newElem){
        MyNode<T> newNode = new MyNode<T>(newElem);
        MyNode<T> iter = head;
        if(head.getNext()==null){
            head.setNext(newNode);
        }
        else {
            while(iter.getNext() != null){
                iter = iter.getNext();
            }
            iter.setNext(newNode);
        }
        size++;
    }

    public void addFront(T elem){
        MyNode<T> newNode = new MyNode<T>(elem);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void remove(){
        MyNode<T> lastNode = head;
        head = head.getNext();
        lastNode = null;
        size--;
    }
}
