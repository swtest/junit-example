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
 * JUnit �⺻ �����޼���(assert method)
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">�ֿ���</a>
 * @since 2013. 5. 7.
 */
public class AssertMethodTest {

    /**
     * assertTrue : true���� Ȯ���ϴ� �����޼���. ���� true�̸� ���, �ƴϸ� ������.
     */
    @Test
    public void assertTrueTest() {
        assertTrue(true);
    }

    /**
     * assertFalse : false���� Ȯ���ϴ� �����޼���. ���� false�̸� ���, �ƴϸ� ������.
     */
    @Test
    public void assertFalseTest() {
        assertFalse(false);
    }

    /**
     * assertNull : null���� Ȯ���ϴ� �����޼���. ���� null�̸� ���, null�� �ƴϸ� ������.
     */
    @Test
    public void assertNullTest() {
        assertNull(null);
    }

    /**
     * assertNotNull : not null���� Ȯ���ϴ� �����޼���. ���� null�� �ƴϸ� ���, null�̸� ������.
     */
    @Test
    public void assertNotNullTest() {
        assertNotNull(new Object());
    }

    /**
     * assertEquals : �� ���� ������ Ȯ���ϴ� �����޼���(equals �޼���� ��). ������ ���, �ٸ��� ������.
     */
    @Test
    public void assertEqualsTest_case1() {
        assertEquals(12L, 12L);
    }

    /**
     * assertEquals : �� ���� ������ Ȯ���ϴ� �����޼���(equals �޼���� ��). ������ ���, �ٸ��� ������.
     */
    @Test
    public void assertEqualsTest_case2() {
        assertEquals(new Long(12), new Long(12));
    }

    /**
     * assertEquals : �� ���� ������ Ȯ���ϴ� �����޼���(equals �޼���� ��). ������ ���, �ٸ��� ������. <br/>
     * float, double�� ��� �ε��Ҽ��� ������� ���Ͽ� ������ �߻��� �� �����Ƿ�, ������ ���� ���е� ��ġ(�ڸ���)�� �߰��� �־���.
     */
    @Test
    public void assertEqualsTest_case3() {
        assertEquals("Capacity", 12.0, 11.99, 0.1);
    }

    /**
     * assertEquals : �� ���� ������ Ȯ���ϴ� �����޼���(equals �޼���� ��). ������ ���, �ٸ��� ������. <br/>
     * null�� �ϳ���.
     */
    @Test
    public void assertEqualsTest_case4() {
        assertEquals((Object) null, (Object) null);
    }

    /**
     * assertEquals : �� ���� ������ Ȯ���ϴ� �����޼���(equals �޼���� ��). ������ ���, �ٸ��� ������.
     */
    @Test
    public void assertEqualsTest_case5() {
        assertEquals("a", "a");
    }

    /**
     * assertSame : �� ���� ���� �ּҿ� �ִ��� Ȯ���ϴ� �����޼���(== �����ڷ� ��). ������ ���, �ٸ��� ������.
     */
    @Test
    public void assertSameTest_case1() {
        assertSame(12, 12);
    }

    /**
     * assertSame : �� ���� ���� �ּҿ� �ִ��� Ȯ���ϴ� �����޼���(== �����ڷ� ��). ������ ���, �ٸ��� ������. <br/>
     * ���ͷ��� ��� ���� �������� �ʰ� �̹� �ִ� ���ͷ��� �����.
     */
    @Test
    public void assertSameTest_case2() {
        assertSame(12L, 12L);
    }

    /**
     * assertSame : �� ���� ���� �ּҿ� �ִ��� Ȯ���ϴ� �����޼���(== �����ڷ� ��). ������ ���, �ٸ��� ������. <br/>
     * new �����ڸ� ���ؼ� �ν��Ͻ��� ����� �Ǹ� ������ �޸� ������ Ȯ����.
     */
    @Test
    public void assertSameTest_case3() {
        assertSame(new Long(12), new Long(12)); // fail
    }

    /**
     * assertSame : �� ���� ���� �ּҿ� �ִ��� Ȯ���ϴ� �����޼���(== �����ڷ� ��). ������ ���, �ٸ��� ������.
     */
    @Test
    public void assertSameTest_case4() {
        assertSame(12.0, 11.99); // fail
    }

    /**
     * assertSame : �� ���� ���� �ּҿ� �ִ��� Ȯ���ϴ� �����޼���(== �����ڷ� ��). ������ ���, �ٸ��� ������. <br/>
     * null�� �ϳ���.
     */
    @Test
    public void assertSameTest_case5() {
        assertSame((Object) null, (Object) null); // success
    }

    /**
     * assertSame : �� ���� ���� �ּҿ� �ִ��� Ȯ���ϴ� �����޼���(== �����ڷ� ��). ������ ���, �ٸ��� ������. <br/>
     * new �����ڸ� ���ؼ� �ν��Ͻ��� ����� �Ǹ� ������ �޸� ������ Ȯ����.
     */
    @Test
    public void assertSameTest_case6() {
        assertSame("a", new String("a")); // fail
    }

    /**
     * assertSame : �� ���� ���� �ּҿ� �ִ��� Ȯ���ϴ� �����޼���(== �����ڷ� ��). ������ ���, �ٸ��� ������.
     */
    @Test
    public void assertSameTest_case7() {
        String a = "a";
        String b = a;
        assertSame(a, b); // success
    }

}
