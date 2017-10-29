/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 1
 * Matric Num: 240448
 * Name: Lim Siang Yee
 *
 */

package com.realtime.a1.dirAndFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FileNameTest {
    
    @Test
    public void testCorrectFileNames(){
        ArrayList<String> expectedFileNames;
        File folder = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + "JAVAFILES");
        FileName fName = new FileName(folder);
        fName.setFileName(folder);
        
        if (folder.list().length > 0){
            expectedFileNames = new ArrayList(Arrays.asList("MySleep.java", "MyThread.java", "TestWaitNotify.java", "ThreadBlocked.java"));
        }else{
            expectedFileNames = new ArrayList(Arrays.asList());
        }
        ArrayList<String> actualFileNames = fName.getFileName();
        assertEquals(expectedFileNames, actualFileNames);    
    }   
}
