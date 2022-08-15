public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root==null){
            // list is empty

            this.root = newItem;
            return true;
        }

        ListItem curretItem = this.root;

        while(curretItem!=null){
            int comparison = (curretItem.compareTo(newItem));

            if(comparison<0){
              // newitem is greater, move right
              if(curretItem.next() !=null){
                  curretItem=curretItem.next();
              }
              else{
                  curretItem.setNext(newItem);
                  newItem.setPrevious(curretItem);
                  return true;
              }
            }else if(comparison>0){
                // newItem is less,

                if(curretItem.previous()!=null){
                    curretItem.previous().setNext(newItem);
                    
                }
            }

        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}

