# Official documentation
http://static.javadoc.io/org.mockito/mockito-core/2.19.0/org/mockito/Mockito.html

# Verify
- Mockito中用verify(…).methodXxx(…) 语法来验证 methodXxx 方法是否按照预期进行了调用。

    ```java
    //verification
     verify(mockedList).add("one"); // 可以看出是和js 的确认方法调用时比价相像的
    ```

# Stub
> Mockito中when(…).thenReturn(…) 这样的语法便是设置方法调用的返回值

1. thenReturn(Object)

2. thenThrow(new RuntimeException)
    @Test(@Test(expected = RuntimeException.class))


# Mock
> mock(class or interface)


# Interactions


# Tool usage
- In IDEA, use Ctrl + F12 to find out all functions.
