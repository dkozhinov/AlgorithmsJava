package Lesson4;

public class MainLinkedIterator {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iter = new LinkIterator(list);

        iter.insertAfter("Artem", 21);
        iter.insertBefore("Anton", 22);
        list.print();
        iter.nexLink();
        iter.getCurrent().print();
        list.print();
        iter.insertBefore("Konstantin",33);
        iter.insertAfter("Alex",19);
        list.print();
        iter.nexLink();
        iter.deleteCurrent();
        list.print();
    }
}
