/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 1
 * Matric Num: 240448
 * Name: Lim Siang Yee
 *
 */

package com.realtime.a1.testSuite;

import com.realtime.a1.dirAndFile.*;
import com.realtime.a1.count.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({ 
   DirectoryTest.class, FileNameTest.class, CountClassTest.class, CountIssueTest.class
})

public class A1_JunitTestSuite {
}