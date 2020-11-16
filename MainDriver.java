public class MainDriver {
    public static void main(String[] args){
        Linkedlist link = new Linkedlist();
        link.addFirst(1);
        link.addFirst(2);
        link.addFirst(3);
        link.addLast(4);
        link.addLast(5);
        link.addLast(6);
        
        link.deleteFirst();
        link.deleteFirst();
        link.deleteFirst();

        Retcode.RET_CODE ret = link.deleteFirst();
        System.out.println(ret);
        Retcode.RET_CODE ret2 = link.deleteFirst();
        Retcode.RET_CODE ret3 = link.deleteFirst();
        Retcode.RET_CODE ret4 = link.deleteFirst();
        Retcode.RET_CODE ret5 = link.deleteFirst();
        Retcode.RET_CODE ret6 = link.deleteFirst();
       
        link.displayList();
    }
}
