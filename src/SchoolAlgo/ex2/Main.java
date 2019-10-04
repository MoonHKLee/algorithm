package SchoolAlgo.ex2;

public class Main {
    static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node printAll() {
            if(this.next==null){
                System.out.println(value);
                return null;
            }else{
                return this.next;
            }
        }
    }

    public static void main(String[] args) {
        Node root = null;
        for (int i = 1; i <= 10; ++i)
            root = new Node(i, root);

        root.printAll();
    }
}
