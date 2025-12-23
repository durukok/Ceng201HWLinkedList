public class DischargeStack {
    private DischargeNode top;

    public DischargeStack() {
        top=null;
    }
    //adding element
    public void push(DischargeRecord record) {
        DischargeNode a=new DischargeNode(record);
        a.next=top;
        top=a;
    }
    //removing element
    public DischargeRecord pop() {
        if (top==null) {      // empty stack checking
            System.out.println("Empty Stack");
            return null;
        }
        DischargeRecord removed=top.data;
        top=top.next;
        return removed;
    }
    //returning top element
    public DischargeRecord peek() {
        if (top==null) {
            System.out.println("Empty Stack");
            return null;
        }
        return top.data;
    }
    //printing the stack
    public void printStack() {
        if (top==null) {      // if empty stack
            System.out.println("Empty Stack");
            return;
        }

        DischargeNode current = top;        // statr from the top
        System.out.println("Discharge Stack:");

        while (current!=null) {
            System.out.println(current.data);
            current=current.next;
        }
    }



}
