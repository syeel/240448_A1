/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 1
 * Matric Num: 240448
 * Name: Lim Siang Yee
 *
 */

package com.realtime.a1.count;

import com.realtime.a1.count.CountClass;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountClassTest {
    
    @Test
    public void testNumberOfClass(){
        ArrayList<String> correctFileNames = new ArrayList(Arrays.asList("MySleep.java", "MyThread.java", "TestWaitNotify.java", "ThreadBlocked.java"));
        CountClass cc = new CountClass(correctFileNames);
        cc.setJavaClassCount(correctFileNames);
        
        int expectedClassNumber = 4;
        int actualClassNumber = cc.getJavaClassCount();
        assertEquals(expectedClassNumber, actualClassNumber);
    }   
}
