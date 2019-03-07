package Lesson4;

public class LinkIterator {
    public LinkedList list;
    public Link current;
    public Link previous;

    public LinkIterator(LinkedList list) {
        this.list = list;
        this.reset();
    }

    private void reset() {
        current = list.first;
        previous = null;
    }

    public void nexLink() {
        previous = current;
        current = current.next;
    }

    public Link getCurrent() {
        return current;
    }

    public boolean atEnd() {
        return current.next == null;
    }

    public void insertBefore(String name, int age) {
        Link newLink = new Link(name, age);
        //на первом элементе
        if (previous == null) {
            newLink.next = list.first;
            list.first = newLink;
            //на втором элементе
            reset();
        } else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    public void insertAfter(String name, int age) {
        Link newLink = new Link(name, age);
        if (list.isEmpty()) {
            list.first = newLink;
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nexLink();
        }
    }

    public String deleteCurrent() {
        String name = current.name;
        if (previous == null) {
            list.first = current.next;
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return name;
    }
}
