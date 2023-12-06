package wanda;

public class LinkedList {

    public static void main(String[] args){
        //准备数据
        Node head = new Node("火车头");
        Node n1 = new Node("车厢1");
        Node n2 = new Node("车厢2");

        //连接节点
        head.setNext(n1);
        n1.setNext(n2);

        //取出所有数据
        Node currentNode = head; //从当前根结点开始读取
        while (currentNode != null){
            System.out.println(currentNode.getData());
            //将下一个节点设为当前节点，以便循环的继续
            currentNode = currentNode.getNext();
        }

    }
}
