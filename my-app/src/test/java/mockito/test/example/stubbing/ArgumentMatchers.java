package mockito.test.example.stubbing;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

/**
 * 参数匹配器
 */
public class ArgumentMatchers {
    @Test
    public void should_stub_method_success_with_argument_matchers() {
        List mockedList = mock(List.class);

        //stubbing using built-in anyInt() argument matcher
        when(mockedList.get(anyInt())).thenReturn("element");

        assertEquals("element", mockedList.get(10));
        /*
        Mock对象用来验证测试中所依赖对象间的交互是否能够达到预期。Mockito中用
        verify(…).methodXxx(…) 语法来验证 methodXxx 方法是否按照预期进行了调
        用。
        */
//        verifyStatic(List.class, times(1));

        //you can also verify using an argument matcher
        //verify(mockedList).add(anyString());

    }
}
