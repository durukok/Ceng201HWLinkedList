public class DischargeStack {
    DischargeNode top;

    public DischargeStack() {
        top = null;
    }

    public void push(DischargeRecord record) {
        DischargeNode newNode = new DischargeNode(record);
        newNode.next = top;
        top = newNode;
    }

    public DischargeRecord pop() {
        if (top == null) {
            System.out.println("Empty stack");
            return null;
        }

        DischargeRecord removed = top.data;
        top = top.next;
        return removed;
    }
    public DischargeRecord peek() {
        if (top == null) {
            System.out.println("Empty stack");
            return null;
        }
        return top.data;
    }
    public void printStack() {
        if (top == null) {
            System.out.println("Empty stack");
            return;
        }

        DischargeNode current = top;
        System.out.println("Discharge Stack:");

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
