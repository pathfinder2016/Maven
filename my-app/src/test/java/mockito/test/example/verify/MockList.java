package mockito.test.example.verify;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

//Let's import Mockito statically so that the code looks clearer
public class MockList {

    /**
     * Once created, a mock will remember all interactions.
     * Then you can selectively verify whatever interactions you are interested in.
     */
    @Test
    public void test_verify_feature_usage() {
        //mock creation
        List mockedList = mock(List.class);

        //using mock object
        mockedList.add("one");
        mockedList.clear();

        //verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }
}
