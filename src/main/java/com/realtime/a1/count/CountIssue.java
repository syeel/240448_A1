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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CountIssue implements Runnable{
    
    private int issueCount = 0;
    private String directory;
    private ArrayList<String> fileName = new ArrayList();;
    
    public CountIssue(String dir, ArrayList<String> fname){
        directory = dir;
        fileName = fname;
    }
    
    @Override
    public void run() {
        countIssueNum(directory, fileName); 
     }
    
    public void countIssueNum(String directory, ArrayList<String> fileName){
        
        int dot=0;
        String fileSeperator = System.getProperty("file.separator");
        String key1 = "public static void main(String[] args)", extention="", filePath="";
        String key2 = "public static void main(String args[])";
        
        for (int i=0; i<fileName.size(); i++){
            dot = fileName.get(i).lastIndexOf(".");
            extention = fileName.get(i).substring(dot + 1);
            
            if ("java".equals(extention)){
                filePath = directory + fileSeperator +fileName.get(i);
            
                try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                    String sCurrentLine;
                    while ((sCurrentLine = br.readLine()) != null) {
                        if (sCurrentLine.contains(key1) || sCurrentLine.contains(key2)){
                            issueCount++;
                        }  
                    }
                }catch (IOException e) {
                    System.out.println("Error, file cannot be read.");
                } 
            }       
        }  
    }
    
    public int getIssueCount(){
        return issueCount; 
    }  
}