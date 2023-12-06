package wanda;
/*
 链表
 */
public class Node {

    private String data; //用于保存数据
    private Node next; //用于保存下一个节点 Node相当于一个类型

    //有参的构造函数.每个Node类对象都必须保存有数据
    public Node(String data){
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
