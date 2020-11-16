import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Test {
    public static void main(String[] Args){
        
    }

    @Test
    public void testDeleteFirst(){
        Linkedlist ll = new Linkedlist();
        assertEquals(Retcode.RET_CODE.OK, ll.deleteFirst());
    }
}
