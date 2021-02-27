package LinkedList;
import java.util.Comparator;

public class LinkedList<E> {
  class Node<E> {
    private E data;
    private Node<E> next;

    Node(E data, Node<E> next) {
      this.data = data;
      this.next = next;
    }
  }

  private Node<E> head;
  private Node<E> cur;
}