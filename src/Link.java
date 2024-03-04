public class Link {
    public int iData; //implemented as public becuase we are using this in linkedlist class
    Link next;

    public Link(int s){
        iData = s;
        next = null;
    }

    public void displayLink(){
        System.out.println(iData);
    }

}
