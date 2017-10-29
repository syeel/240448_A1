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

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountClassTest {
    
    @Test
    public void testNumberOfClass(){
        int expectedClassNumber=0;
        int actualClassNumber=0;
        File folder = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + "JAVAFILES");
        
        if (folder.list().length > 0){
            ArrayList<String> correctFileNames = new ArrayList(Arrays.asList("MySleep.java", "MyThread.java", "TestWaitNotify.java", "ThreadBlocked.java"));
            CountClass cc = new CountClass(correctFileNames);
            cc.setJavaClassCount(correctFileNames);
            expectedClassNumber = 4;
            actualClassNumber = cc.getJavaClassCount();
        }
        assertEquals(expectedClassNumber, actualClassNumber);
    }   
}
