public class leet707_designLinkedList_four{
    public static void main(String[] args){
        System.out.println("hvjx");
    }

    public class myLinkedList{
        Node head, ;

        public int get(int index){
            // get val at index. returns -1 if dne
            int count = 0;
            Node current = head;
            while(next != null){
                if(count > index)
                    return -1;
                else if(count == index)
                    return current.getVal();
                else{
                    count++;
                    current = current.getNext();
                }
            }
            return -1;
        }
        public void addAtHead(int val){
            //adds node of val 
            Node inception = new Node()

        }
        public void addAtTail(int val){

        } 
        public void addAtIndex(int index, int val){

        }
        public void deleteAtIndex(int index){

        }
    }
    public class myNode{
        int val;
        myNode next;
        public myNode(int val, myNode next){
            this.val = val;
            this.next = next;
        }
        public int getVal(){
            return val;
        }
        public myNode getNext(){
            return next;
        }
    }
}