package mockito.test.example;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@Ignore
@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class MockitoTestBase {
    // Initializes mocks annotated with Mock, so that explicit usage of MockitoAnnotations.initMocks(Object) is not necessary.
    // Mocks are initialized before each test method.
}
