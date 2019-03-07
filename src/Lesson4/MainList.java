package Lesson4;

public class MainList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Олег", 22);
        list.insert("Игорь", 33);
        list.insert("Мария", 25);

        list.print();

        if (!list.isEmpty()) {
            list.delete();
        }
        list.print();

    }
}
