/*******************************************************************************
 * Copyright(c) 2013 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.junit.example;

/**
 * ���� �׽�Ʈ
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">�ֿ���</a>
 * @since 2013. 5. 7.
 */
public class CalculatorTest {

    /**
     * ���� �޼���
     *
     * @param args ����
     */
    public static void main(String[] args) {
        System.out.println("���� ���� : " + (Calculator.add(1, 2) == 3));
        System.out.println("���� ���� : " + (Calculator.subtract(3, 2) == 1));
        System.out.println("���� ���� : " + (Calculator.multiply(3, 4) == 12));
        System.out.println("������ ���� : " + (Calculator.divide(10, 2) == 5));
        // �Ʒ� �ڵ�� �ּ��� �����ϸ� ���ܰ� �߻���.
//        System.out.println("������ ����2 : " + Calculator.divide(10, 0));
    }

}
