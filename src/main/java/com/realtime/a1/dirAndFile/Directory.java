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

import java.nio.file.Path;
import java.nio.file.Paths;

public class Directory implements Runnable{
    
    private static String relativePath, realPath;
    
    @Override
    public void run() {
        setPath();
     }
    
    public void setPath(){
        Path currentRelativePath = Paths.get("");
        relativePath = currentRelativePath.toAbsolutePath().toString();
        realPath = relativePath + "\\" + "JAVAFILES"; 
    }
    
    public String getPath(){
        return realPath;
    }
}
