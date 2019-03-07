package Lesson4;

public class MainLinkedIterator {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iter = new LinkIterator(list);

        iter.insertAfter("Artem", 21);
        iter.insertBefore("Anton", 22);
        list.print();
    }
}
