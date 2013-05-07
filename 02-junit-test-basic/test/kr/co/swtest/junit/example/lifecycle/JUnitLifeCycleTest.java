/*******************************************************************************
 * Copyright(c) 2013 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.junit.example.lifecycle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * JUnit LifeCycle 테스트
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2013. 5. 7.
 */
public class JUnitLifeCycleTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("@AfterClass");
    }

    @Before
    public void before() {
        System.out.println("  @Before");
    }

    @After
    public void after() {
        System.out.println("  @After");
    }

    @Test
    public void testMethod1() {
        System.out.println("    testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("    testMethod2");
    }
}
