package mockito.test.example.stubbing;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StubList {

    public static final String USER = "Mike Xie";

    @Test
    public void should_stub_LinkedList_when_given_mock_LinkedList_class() {
        //You can mock concrete classes, not just interfaces
        LinkedList mockedList = mock(LinkedList.class);

        when(mockedList.get(0)).thenReturn("Index is 0");
//        when(mockedList.get(1)).thenThrow(new RuntimeException());

        System.out.println(mockedList.get(0)); //following prints "first"
//        System.out.println(mockedList.get(1)); //following throws runtime exception

        //following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));
    }

    @Test(expected = RuntimeException.class)
    public void should_throw_runtime_exception() {
        List stubedList = mock(List.class);
        when(stubedList.get(anyInt())).thenThrow(new RuntimeException());
        stubedList.get(100);
    }
}
