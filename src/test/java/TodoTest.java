import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest {
    
    private Person person = new Person("123", "Bob");
    private Todo testee = new Todo("", "", "", person);

    @Test
    public void testSendNotification_shouldReturn_statusOK() {
        testee.setCompleted(true);
        assertTrue(testee.completed);
    }

    @Test
    public void testEditItem_shouldRetrn_EditedItem() {
        testee.setText("Some test text");
        assertEquals(testee.getText(), "Some test text");
    }


    @Test
    public void testEditItem_shouldRetrn_EditedItem_duplicate_test() {
        testee.setText("Some test text");
        assertEquals(testee.getText(), "Some test text");
    }
}