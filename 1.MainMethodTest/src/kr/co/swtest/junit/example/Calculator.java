/*******************************************************************************
 * Copyright(c) 2013 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.junit.example;

/**
 * 계산기
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2013. 5. 7.
 */
public class Calculator {

    /**
     * 덧셈
     *
     * @param number1 숫자1
     * @param number2 숫자2
     * @return 숫자1에서 숫자2를 더한 값을 리턴함.
     */
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * 뺄셈
     *
     * @param number1 숫자1
     * @param number2 숫자2
     * @return 숫자1에서 숫자2를 뺀 값을 리턴함.
     */
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    /**
     * 곱셈
     *
     * @param number1 숫자1
     * @param number2 숫자2
     * @return 숫자1에서 숫자2를 곱한 값을 리턴함.
     */
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    /**
     * 나눗셈
     *
     * @param numerator 분자
     * @param denominator 분모
     * @return 분자에서 분모로 나눈 값.
     * @exception ArithmeticException 분모가 0일 경우 발생함.
     */
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

}
