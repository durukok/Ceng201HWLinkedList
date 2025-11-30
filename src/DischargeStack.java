public class DischargeStack {
    private DischargeNode top;

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
            System.out.println("Empty Stack");
            return null;
        }

        DischargeRecord removed = top.data;
        top = top.next;
        return removed;
    }
    public DischargeRecord peek() {
        if (top == null) {
            System.out.println("Empty Stack");
            return null;
        }
        return top.data;
    }
    public void printStack() {
        if (top == null) {
            System.out.println("Empty Stack");
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
