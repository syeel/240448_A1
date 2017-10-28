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

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountIssueTest {
    
    @Test
    public void testNumberOfIssue(){
        String correctDirectory = System.getProperty("user.dir") + System.getProperty("file.separator") + "JAVAFILES";
        ArrayList<String> correctFileNames = new ArrayList(Arrays.asList("MySleep.java", "MyThread.java", "TestWaitNotify.java", "ThreadBlocked.java"));
        CountIssue ci = new CountIssue(correctDirectory, correctFileNames);
        ci.countIssueNum(correctDirectory, correctFileNames);
        
        int expectedIssueNumber = 3;
        int actualIssueNumber = ci.getIssueCount();
        assertEquals(expectedIssueNumber, actualIssueNumber);
    }
    
}
