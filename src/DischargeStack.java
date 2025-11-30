public class DischargeStack {
    DischargeNode top;

    public DischargeStack() {       // creates an empty stack
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
    public DischargeRecord peek() {         //see the top record
        if (top == null) {
            System.out.println("Empty stack");
            return null;
        }
        return top.data;
    }
    public void printStack() {
        if (top == null) {      // empty stack
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
