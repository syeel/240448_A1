/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 1
 * Matric Num: 240448
 * Name: Lim Siang Yee
 *
 */

package com.realtime.a1;

import java.io.File;
import java.util.ArrayList;

public class FileName implements Runnable{
    
    private ArrayList<String> fileName = new ArrayList();
    private File folder;
    
    public FileName (final File folder){
        this.folder = folder;
    }
    
    @Override
    public void run() {
        setFileName(folder);
     }
    
    public void setFileName(File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                setFileName(fileEntry);
            } else {
                fileName.add((fileEntry.getName()));
            }
        }
    }
    
    public ArrayList<String> getFileName(){
        return fileName;
    } 
}