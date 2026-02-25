
package com.example;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AppTest {
    @Test
    public void testMessage() {
        Assert.assertEquals(App.getMessage(), "Hello from Test Build!");
    }
    @Test
    public void testMessagePrint() {
        App.main(null);   // This will print the message in CI logs
}
}
