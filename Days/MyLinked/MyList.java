package MyLinked;

public abstract class MyList {
    protected int value;
    protected MyList rightLink = null;
    protected MyList leftLink = null;

    public MyList(int value){
        this.value = value;
    }

    public abstract MyList next();
    public abstract MyList setNext(MyList newItem);
    public abstract MyList previous();
    public abstract MyList setPrevious(MyList newItem);

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

}
