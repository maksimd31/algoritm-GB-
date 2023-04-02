//package Version_2NEW.homeWork3.ver3;
//
//import Version_2NEW.homeWork3.ver1.LinkList;
//
//import java.util.ArrayList;
//
//public class MAin {
//
//    public class Node {
//        public int data;
//        public Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public class LinkedList {
//        private static Node head;
//
//        public void add(int data) {
//            Node node = new Node(data);
//            if (head == null) {
//                head = node;
//            } else {
//                Node temp = head;
//                while (temp.next != null) {
//                    temp = temp.next;
//                }
//                temp.next = node;
//            }
//        }
//
//        public void reverse() {
//            Node prev = null;
//            Node current = head;
//            Node next = null;
//            while (current != null) {
//                next = current.next;
//                current.next = prev;
//                prev = current;
//                current = next;
//            }
//            head = prev;
//        }
//
//        public static void print() {
//            Node temp = head;
//            while (temp != null) {
//                System.out.println(temp.data);
//                temp = temp.next;
//            }
//
//        }
//
//
//        }
//
//
//
//    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//
//        LinkedList list = new LinkedList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        LinkedList.print();
//        linkedList.reverse();
//        LinkedList.print();
//
//
////        ArrayList list = new ArrayList();
////        list.add(10);
////        list.add(20);
////        list.add(30);
////
////        for (Object word : list) {
////            System.out.println(word);
////            System.out.println("===================");
////
////        }
//    }
//}
