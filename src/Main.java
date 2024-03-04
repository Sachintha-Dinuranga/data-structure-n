import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Linkedlist theList = new Linkedlist();

        System.out.println("Enter numbers to the linkedList");
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            theList.insertFirst(sc.nextInt());
        }

        if(theList.insertAfter(5,45) == true){
            theList.displayList();
        }

        if(theList.delete(10) == true){
            theList.displayList();
        };

//        theList.insertFirst(23);
//        theList.insertFirst(89);
//        theList.insertFirst(12);
//        theList.insertFirst(55);
    }
}