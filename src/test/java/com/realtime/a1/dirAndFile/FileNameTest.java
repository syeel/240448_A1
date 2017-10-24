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

import com.realtime.a1.dirAndFile.FileName;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FileNameTest {
    
    @Test
    public void testCorrectFileNames(){
        File folder = new File(Paths.get("").toAbsolutePath().toString() + "\\" + "JAVAFILES");
        FileName fName = new FileName(folder);
        fName.setFileName(folder);
        
        ArrayList<String> expectedFileNames = new ArrayList(Arrays.asList("MySleep.java", "MyThread.java", "TestWaitNotify.java", "ThreadBlocked.java"));
        ArrayList<String> actualFileNames = fName.getFileName();
        assertEquals(expectedFileNames, actualFileNames);
    }   
}
