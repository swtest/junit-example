/*******************************************************************************
 * Copyright(c) 2013 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.junit.example;

/**
 * ����
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">�ֿ���</a>
 * @since 2013. 5. 7.
 */
public class Calculator {

    /**
     * ����
     *
     * @param number1 ����1
     * @param number2 ����2
     * @return ����1���� ����2�� ���� ���� ������.
     */
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * ����
     *
     * @param number1 ����1
     * @param number2 ����2
     * @return ����1���� ����2�� �� ���� ������.
     */
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    /**
     * ����
     *
     * @param number1 ����1
     * @param number2 ����2
     * @return ����1���� ����2�� ���� ���� ������.
     */
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    /**
     * ������
     *
     * @param numerator ����
     * @param denominator �и�
     * @return ���ڿ��� �и�� ���� ��.
     * @exception ArithmeticException �и� 0�� ��� �߻���.
     */
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

}
