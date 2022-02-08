public class SimpleLinkedList {
    public Node firstNode;
    public Node lastNode;

    public SimpleLinkedList(Node firstNode) {
        this.firstNode = firstNode;
        this.lastNode = firstNode;
    }

    public SimpleLinkedList() {
    }

    public void addNode(Node other) {
        if (this.firstNode == null) {
            this.firstNode = other;
            this.lastNode = this.firstNode;
        } else {
            Node aux = this.firstNode;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = this.lastNode;
            this.lastNode = other;

        }
    }

    public void addNode(int value) {
        Node other = new Node(value);
        if (this.firstNode == null) {
            this.firstNode = other;
            this.lastNode = this.firstNode;
        } else {
            Node aux = this.firstNode;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = this.lastNode;
            this.lastNode = other;

        }
    }

    public void showList() {
        Node aux = this.firstNode;
        System.out.print(aux.value + " ");
        while (aux.next != null) {
            aux = aux.next;
            System.out.print(aux.value + " ");
        }
    }

    public void deleteLastNode() {
        this.lastNode = null;

    }

    public Node getFirstNode() {
        return this.firstNode;
    }

    public Node getLastNode() {
        return this.lastNode;
    }

    public void deleteFirstNode() {
        this.firstNode = this.firstNode.next;
    }

    public static void main(String[] args) {
        SimpleLinkedList myList = new SimpleLinkedList(new Node(1));
        for (int i = 0; i < 100; i++) {
            myList.addNode(new Node(i * 10));
        }
        myList.addNode(777);
        myList.showList();
        System.out.println("\nFirst node:" + myList.getFirstNode().value);
        System.out.println("Last node:" + myList.getLastNode().value);
        myList.deleteFirstNode();
        myList.deleteLastNode();
        myList.showList();
    }
}