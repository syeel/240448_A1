/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 1
 * Matric Num: 240448
 * Name: Lim Siang Yee
 *
 */

package com.realtime.a1.mainPack;

import com.realtime.a1.count.CountClass;
import com.realtime.a1.count.CountIssue;
import com.realtime.a1.dirAndFile.FileName;
import com.realtime.a1.dirAndFile.Directory;
import java.io.File;
import java.util.ArrayList;

public class MainApp {
 
    public static void main(String[] args) throws Exception{
        
        // Creating and starting thread for Directory
        // Determine working directory
        Directory dir = new Directory();
        Thread dir1 = new Thread(dir);
        dir1.start();
        dir1.join();
        String directory = dir.getPath();
        
        // Set folder to be read for files
        final File folder = new File(directory);
        
        // Creating and starting thread for FileName
        // Storing all files' name in the folder specify into arraylist
        FileName fName = new FileName(folder);
        Thread fn1 = new Thread(fName);
        fn1.start();
        fn1.join();
        
        boolean isEmptyFolder = fName.getFolderState();
        if (isEmptyFolder == false){
            ArrayList<String> fileName = fName.getFileName();
        
            // Creating and starting thread for CountClass
            CountClass cClass = new CountClass(fileName);
            Thread cc1 = new Thread(cClass);
            cc1.start();
            cc1.join(); 
            int classCount = cClass.getJavaClassCount();
        
            // Creating and starting thread for CountIssue
            CountIssue cIssue = new CountIssue(directory, fileName);
            Thread ci1 = new Thread(cIssue);
            ci1.start();
            ci1.join(); 
            int issueCount = cIssue.getIssueCount();

            System.out.println("Number of Java Files = " + classCount);
            System.out.println("Number of Issues = " + issueCount);
        }
        else{
            System.out.println("JAVAFILES folder is empty, please put java files you want to analyse in it.");
        }  
    }     
}