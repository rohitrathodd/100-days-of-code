package MyLinked;

public class MyLInkedList {

    private MyList root = null;

    public MyLInkedList(MyList root){
        this.root = root;

    }

    public MyList getRoot(){
        return this.root;
    }

    public boolean addItem(MyList newItem){

        if(this.root == null){
            this.root = newItem;
            return true;
        }

        MyList currentItem = this.root;

        while(currentItem !=null){


        }
        return true;
    }

}
