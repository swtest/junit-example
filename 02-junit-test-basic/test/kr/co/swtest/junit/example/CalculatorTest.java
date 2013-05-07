/*******************************************************************************
 * Copyright(c) 2013 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.junit.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * °è»ê±â Å×½ºÆ®
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">ÃÖ¿µ¸ñ</a>
 * @since 2013. 5. 7.
 */
public class CalculatorTest {

    /** µ¡¼À Å×½ºÆ® */
    @Test
    public void testAdd() {
        assertEquals(3, Calculator.add(1, 2));
    }

    /** »¬¼À Å×½ºÆ® */
    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(3, 2));
    }

    /** °ö¼À Å×½ºÆ® */
    @Test
    public void testMultiply() {
        assertEquals(12, Calculator.multiply(3, 4));
    }

    /** ³ª´°¼À Å×½ºÆ® */
    @Test
    public void testDivide() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    /** ¿¹¿Ü Å×½ºÆ® */
    @Test(expected = ArithmeticException.class)
    public void testException() {
        Calculator.divide(10, 0);
    }

}
