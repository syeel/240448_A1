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

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DirectoryTest {
    
    @Test
    public void testRealPath(){
        //Real path = relative path + \JAVAFILES
        Directory dir = new Directory();
        dir.setPath();
        
        String actual = dir.getPath();
        String expected = System.getProperty("user.dir") + System.getProperty("file.separator") + "JAVAFILES";
        assertEquals(expected, actual); 
    }
}
