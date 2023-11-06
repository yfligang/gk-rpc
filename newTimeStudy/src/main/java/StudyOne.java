public class StudyOne {
    //不带头非循环单链表CURD(相关操作)

    class Node{
        public int val; //存储数据
        public Node next; // 存储下一个节点地址

        public Node(int val){
            //不知道下一个节点位置，只需要 val
            this.val = val;
        }

    }

    public static void main(String[] args){

    }

    public Node head; //代表当前头节点的作用

    //遍历链表
        //创建链表
    public void createLink(){
        Node node1 = new Node(12); //存储当前节点地址
        Node node2 = new Node(45);
        Node node3 = new Node(23);
        Node node4 = new Node(90);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        head = node1;


    }
    //遍历链表，利用head遍历链表
    public void display(){
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = head;
        while (cur != null){
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    //尾插法,需判断head是否为空
    public void addLast(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }

    /*
    找到index -1处的节点
     */




}
