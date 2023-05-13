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

        ListItem currentItem = this.root;

        while(currentItem!=null){
            int comparison = (currentItem.compareTo(newItem));

            if(comparison<0){
              // newitem is greater, move right
              if(currentItem.next() !=null){
                  currentItem=currentItem.next();
              }
              else{
                  currentItem.setNext(newItem).setPrevious(currentItem);
                  return true;
              }
            }else if(comparison>0){
                // newItem is less,

                if(currentItem.previous()!=null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                    return true;
                }else{
                    this.root.setPrevious(newItem);
                    newItem.setNext(this.root);
                     this.root=newItem;
                     return true;
                }
            }
            else{
                System.out.println(newItem.getValue()+" is already present, not added");
                return false;
            }

        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if(item !=null){
            System.out.println("deleting item" +item.getValue());

        }
        return true;
    }

    @Override
    public void traverse(ListItem root) {
        if(root==null){
            System.out.println("list is empty");
        }else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}

