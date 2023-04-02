package HomeWork3.ver1;

public class List{
    public LinkList head;

    public List() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        LinkList temp = new LinkList(data);
        //указываем ссылку на элемент
        temp.next = head;
        head = temp;

    }

    public void print() {
        LinkList temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void remove() { //Удаление
        head = head.next;
    }

    private void removeAt(int key) {
        LinkList cur = head;
        LinkList prev = head;

        while (cur.data != key) {
            if (isEmpty()) {
                System.out.println();
                return;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (cur == head)
            head = head.next;
        else
            prev.next = cur.next;

    }


}


