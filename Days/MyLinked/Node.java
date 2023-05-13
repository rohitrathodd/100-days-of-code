package MyLinked;

public class Node extends MyList{

    Node(int value){
        super(value);
    }

    @Override
    public MyList next() {
        return rightLink;
    }

    @Override
    public MyList setNext(MyList newItem) {
        rightLink = newItem;
        return rightLink;
    }

    @Override
    public MyList previous() {
        return leftLink;
    }

    @Override
    public MyList setPrevious(MyList newItem) {
        leftLink = newItem;
        return leftLink;
    }

    @Override
    public int compareTo(MyList newItem){

        if(value == newItem.value){
            return 0;
        }else if(value<newItem.value){
            return -1;
        }else{
            return 1;
        }
    }
}
