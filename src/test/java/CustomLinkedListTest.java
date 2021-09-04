import com.vitalya.easy.CustomLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomLinkedListTest {

    public static final int EXPECTED_VALUE = 123;

    private CustomLinkedList customLinkedList;

    @Before
    public void init() {
        customLinkedList = new CustomLinkedList();
    }

    @Test
    public void itShouldGetByIndex() {
        customLinkedList.addAtHead(EXPECTED_VALUE);

        assertThat(customLinkedList.get(0)).isEqualTo(EXPECTED_VALUE);
    }

    @Test
    public void itShouldAddAtHead() {
        customLinkedList.addAtHead(1);
        customLinkedList.addAtHead(2);
        customLinkedList.addAtHead(3);

        assertThat(customLinkedList.get(0)).isEqualTo(3);

    }

    @Test
    public void itShouldAddAtTail() {
        customLinkedList.addAtHead(1);
        customLinkedList.addAtHead(2);
        customLinkedList.addAtTail(3);

        assertThat(customLinkedList.get(0)).isEqualTo(2);
        assertThat(customLinkedList.get(2)).isEqualTo(3);
    }

    @Test
    public void itShouldAddAtIndex() {
        customLinkedList.addAtHead(1);
        customLinkedList.addAtHead(2);
        customLinkedList.addAtIndex(1, 7);

        assertThat(customLinkedList.get(0)).isEqualTo(2);
        assertThat(customLinkedList.get(1)).isEqualTo(7);
        assertThat(customLinkedList.get(2)).isEqualTo(1);

    }

    @Test
    public void itShouldDeleteAtIndex() {
        customLinkedList.addAtHead(1);
        customLinkedList.addAtHead(2);
        customLinkedList.addAtHead(3);

        assertThat(customLinkedList.size()).isEqualTo(3);

        customLinkedList.deleteAtIndex(0);

        assertThat(customLinkedList.size()).isEqualTo(2);

        assertThat(customLinkedList.get(0)).isEqualTo(2);
        assertThat(customLinkedList.get(1)).isEqualTo(1);

    }

    @Test
    public void itShouldNotThrowExceptionWhenWrongIndex() {
        customLinkedList.deleteAtIndex(0);
        customLinkedList.deleteAtIndex(5);

        customLinkedList.addAtIndex(5, 1);
        customLinkedList.addAtIndex(0, 1);
    }

    @Test
    public void itShouldDoSomeTrickyStuff() {
        //"addAtHead",
        // "addAtIndex",
        // "addAtTail",
        // "addAtHead",
        // "addAtIndex",
        // "addAtTail",
        // "addAtTail",
        // "addAtIndex",
        // "deleteAtIndex",
        // "deleteAtIndex",
        // "addAtTail"]
        //[0],[1,4],[8],[5],[4,3],[0],[5],[6,3],[7],[5],[4]]
        customLinkedList.addAtHead(0);
        customLinkedList.addAtIndex(1,4);
        customLinkedList.addAtTail(8);
        customLinkedList.addAtHead(5);
        customLinkedList.addAtIndex(4,3);
        customLinkedList.addAtTail(0);
        customLinkedList.addAtTail(5);
        customLinkedList.addAtIndex(6,3);
        customLinkedList.deleteAtIndex(7);
        customLinkedList.deleteAtIndex(5);
        customLinkedList.addAtTail(4);
    }
}
