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

public class Directory implements Runnable{
    
    private String realPath;
    
    @Override
    public void run() {
        setPath();
     }
    
    public void setPath(){
        String fileSeperator = System.getProperty("file.separator");
        String workingDirectory = System.getProperty("user.dir");

        realPath = workingDirectory + fileSeperator + "JAVAFILES"; 
    }
    
    public String getPath(){
        return realPath;
    }
}
