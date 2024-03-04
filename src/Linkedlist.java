public class Linkedlist {
    public Link first; // private or public ok

    public Linkedlist(){
        first = null; //initially linked list is empty
    }

    public void displayList(){ //method for display list
        Link current = first;

        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }

    //Find method
    public boolean find(int key){
        Link current = first;

        while(current != null){
            if(current.iData == key){
                return true;
            }
            else{
                current = current.next;
            }
        }
        return false;
    }

    //insertFirst method
    public void insertFirst(int key){
        Link newLink = new Link(key); //create a new link
        newLink.next = first;
        first = newLink;
    }

    //insertAfter method
    public boolean insertAfter(int key, int newData){
        Link newLink = new Link(newData);

        Link current = first;

        while(current != null){
            if(current.iData == key){
                newLink.next = current.next;
                current.next = newLink;
                return true;
            }
            else {
                current = current.next;
            }
        }
        return false;
    }

    //deleteFirst method
    public Link deleteFirst(int key){
        Link temp = first;
        first = first.next;

        return temp;
    }

    //delete method
    public boolean delete(int key){
        Link current = first;
        Link previous = first;
        while(current != null){
            if(current.iData == key){

                if(current == first){ //if first is deleting
                    first = first.next;
                    return true;
                }
                else {
                    previous.next = current.next;
                    return true;
                }
            }
            else{
                previous = current; //previous is comming to the place where current is
                current = current.next;
            }
        }
        return false;
    }

}
