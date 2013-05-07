/*******************************************************************************
 * Copyright(c) 2013 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.junit.example.assertion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * JUnit 기본 단정메서드(assert method)
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2013. 5. 7.
 */
public class AssertMethodTest {

    /**
     * assertTrue : true인지 확인하는 단정메서드. 값이 true이면 통과, 아니면 실패함.
     */
    @Test
    public void assertTrueTest() {
        assertTrue(true);
    }

    /**
     * assertFalse : false인지 확인하는 단정메서드. 값이 false이면 통과, 아니면 실패함.
     */
    @Test
    public void assertFalseTest() {
        assertFalse(false);
    }

    /**
     * assertNull : null인지 확인하는 단정메서드. 값이 null이면 통과, null이 아니면 실패함.
     */
    @Test
    public void assertNullTest() {
        assertNull(null);
    }

    /**
     * assertNotNull : not null인지 확인하는 단정메서드. 값이 null이 아니면 통과, null이면 실패함.
     */
    @Test
    public void assertNotNullTest() {
        assertNotNull(new Object());
    }

    /**
     * assertEquals : 두 값이 같은지 확인하는 단정메서드(equals 메서드로 비교). 같으면 통과, 다르면 실패함.
     */
    @Test
    public void assertEqualsTest_case1() {
        assertEquals(12L, 12L);
    }

    /**
     * assertEquals : 두 값이 같은지 확인하는 단정메서드(equals 메서드로 비교). 같으면 통과, 다르면 실패함.
     */
    @Test
    public void assertEqualsTest_case2() {
        assertEquals(new Long(12), new Long(12));
    }

    /**
     * assertEquals : 두 값이 같은지 확인하는 단정메서드(equals 메서드로 비교). 같으면 통과, 다르면 실패함. <br/>
     * float, double의 경우 부동소수점 방식으로 인하여 오차가 발생할 수 있으므로, 검증에 대한 정밀도 수치(자리수)를 추가로 넣어줌.
     */
    @Test
    public void assertEqualsTest_case3() {
        assertEquals("Capacity", 12.0, 11.99, 0.1);
    }

    /**
     * assertEquals : 두 값이 같은지 확인하는 단정메서드(equals 메서드로 비교). 같으면 통과, 다르면 실패함. <br/>
     * null은 하나임.
     */
    @Test
    public void assertEqualsTest_case4() {
        assertEquals((Object) null, (Object) null);
    }

    /**
     * assertEquals : 두 값이 같은지 확인하는 단정메서드(equals 메서드로 비교). 같으면 통과, 다르면 실패함.
     */
    @Test
    public void assertEqualsTest_case5() {
        assertEquals("a", "a");
    }

    /**
     * assertSame : 두 값이 같은 주소에 있는지 확인하는 단정메서드(== 연산자로 비교). 같으면 통과, 다르면 실패함.
     */
    @Test
    public void assertSameTest_case1() {
        assertSame(12, 12);
    }

    /**
     * assertSame : 두 값이 같은 주소에 있는지 확인하는 단정메서드(== 연산자로 비교). 같으면 통과, 다르면 실패함. <br/>
     * 리터럴의 경우 새로 생성하지 않고 이미 있는 리터럴을 사용함.
     */
    @Test
    public void assertSameTest_case2() {
        assertSame(12L, 12L);
    }

    /**
     * assertSame : 두 값이 같은 주소에 있는지 확인하는 단정메서드(== 연산자로 비교). 같으면 통과, 다르면 실패함. <br/>
     * new 연산자를 통해서 인스턴스를 만들게 되면 별도의 메모리 공간이 확보됨.
     */
    @Test
    public void assertSameTest_case3() {
        assertSame(new Long(12), new Long(12)); // fail
    }

    /**
     * assertSame : 두 값이 같은 주소에 있는지 확인하는 단정메서드(== 연산자로 비교). 같으면 통과, 다르면 실패함.
     */
    @Test
    public void assertSameTest_case4() {
        assertSame(12.0, 11.99); // fail
    }

    /**
     * assertSame : 두 값이 같은 주소에 있는지 확인하는 단정메서드(== 연산자로 비교). 같으면 통과, 다르면 실패함. <br/>
     * null은 하나임.
     */
    @Test
    public void assertSameTest_case5() {
        assertSame((Object) null, (Object) null); // success
    }

    /**
     * assertSame : 두 값이 같은 주소에 있는지 확인하는 단정메서드(== 연산자로 비교). 같으면 통과, 다르면 실패함. <br/>
     * new 연산자를 통해서 인스턴스를 만들게 되면 별도의 메모리 공간이 확보됨.
     */
    @Test
    public void assertSameTest_case6() {
        assertSame("a", new String("a")); // fail
    }

    /**
     * assertSame : 두 값이 같은 주소에 있는지 확인하는 단정메서드(== 연산자로 비교). 같으면 통과, 다르면 실패함.
     */
    @Test
    public void assertSameTest_case7() {
        String a = "a";
        String b = a;
        assertSame(a, b); // success
    }

}
