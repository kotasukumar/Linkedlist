package linkedlist;

public interface INode<K> {
    Object getkey();
    void setKey(K key);

    INode getNext();
    void setNext(INode next);
}
