/*******************************************************************************
 * Copyright(c) 2013 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.junit.example;

/**
 * 계산기 테스트
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2013. 5. 7.
 */
public class CalculatorTest {

    /**
     * 메인 메서드
     *
     * @param args 인자
     */
    public static void main(String[] args) {
        System.out.println("덧셈 검증 : " + (Calculator.add(1, 2) == 3));
        System.out.println("뺄셈 검증 : " + (Calculator.subtract(3, 2) == 1));
        System.out.println("곱셈 검증 : " + (Calculator.multiply(3, 4) == 12));
        System.out.println("나눗셈 검증 : " + (Calculator.divide(10, 2) == 5));
        // 아래 코드는 주석을 해제하면 예외가 발생함.
//        System.out.println("나눗셈 검증2 : " + Calculator.divide(10, 0));
    }

}
