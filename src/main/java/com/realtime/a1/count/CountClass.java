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

public class CountClass implements Runnable{
    
    private ArrayList<String> fileName = new ArrayList();
    private int classCount=0;
    
    public CountClass(ArrayList<String> fname){
        fileName = fname;
    }
    
    @Override
    public void run() {
        setJavaClassCount(fileName); 
     }
    
    public void setJavaClassCount(ArrayList<String> fileName){
        
        for (int i=0; i<fileName.size(); i++){
            int dot = fileName.get(i).lastIndexOf(".");
            String extention = fileName.get(i).substring(dot + 1);
            
            if ("java".equals(extention)){
                classCount++;
            }
        }      
    }
    
    public int getJavaClassCount(){
        return classCount; 
    }  
}