package Lesson4;

public class LinkedList {

    public Link first;

    public LinkedList() {
        first = null;
    }

    public void insert(String name, int age) {
        Link link = new Link(name, age);
        link.next = first;
        first = link;
    }

    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void print() {
        Link current = first;
        while (current != null) {
            current.print();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

//    Односвязный
//    * 1 -> 2 -> 3 -> 4 -> 5 -> 6
//    * 1 2 3 4 5 6 (7) - O(N) = O(6)

//    Двусвязный
//    * 1 -> <- 2 -> <- 3 -> <- 4 -> <- 5 -> <- 6 *
//    Link last - *
}
