package mockito.test.example.mock;

import mockito.test.example.MockitoTestBase;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

/**
 * Minimizes repetitive mock creation code.
 * Makes the test class more readable.
 * Makes the verification error easier to read because the field name is used to identify the mock.
 */
public class UseMockAnnotation extends MockitoTestBase {
    private static final String USER = "Mike Xie";
    //If use @Mock annotation: Important! This needs to be somewhere in the base class or a test runner:
    @Mock private List mockedList;
    @Test
    public void show_case_about_use_Mock_annotation_to_mock_one_object() {
        when(mockedList.get(anyInt())).thenReturn(USER);

        assertEquals(USER, mockedList.get(100));
    }
}
