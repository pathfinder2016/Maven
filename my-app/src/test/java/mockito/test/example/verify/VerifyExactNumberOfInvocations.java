package mockito.test.example.verify;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class VerifyExactNumberOfInvocations {

    @Test
    public void show_cases_about_verify_exact_number_of_Invocations() {
        List mockedList = mock(List.class);
        //using mock
        mockedList.add("once");

        mockedList.add("twice");
        mockedList.add("twice");

        mockedList.add("three times");
        mockedList.add("three times");
        mockedList.add("three times");

        //following two verifications work exactly the same - times(1) is used by default
        verify(mockedList, times(1)).add("once");
        //exact number of invocations verification
        verify(mockedList, times(2)).add("twice");
        //verification using never(). never() is an alias to times(0)
        verify(mockedList, never()).add("never happened");
        verify(mockedList, times(0)).add("never happened");
    }
}
