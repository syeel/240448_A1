
package com.realtime.hello;

import junit.framework.Assert;
import org.junit.Test;

public class TestHelloWorld {
    
    @Test
    
    public void testHello(){
        HelloWorld hw = new HelloWorld();
        hw.sayHello("Siang Yee");
        Assert.assertEquals("Hello Siang Yee", "Hello Siang Yee");
    }
}
