package com.javastudy.weekly2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JavaStudyWeekly2Test {

    private String title = "Variables Shadowing";
    
    @Test
    void testVariableShadowing() {
        System.out.println("title = " + title);
        String title = "After Shadowing";
        System.out.println("title = " + title);
    }
    
    @Test
    void testWidenPrimitiveConsersion() {
        long myLong = 9_223_372_036_854_775_807L;
        float myFloat = myLong;
        double myDouble = myLong;

        System.out.println("myFloat = " + myFloat);
        assertThat(myFloat).isEqualTo(9_223_372_000_000_000_000f);
    }

    @Test
    void testFloatValue() {
        float floatValue = 3.141592f;
        double d1 = 314.1592;
        double d2 = 3.141592e2;

        assertThat(d1).isEqualTo(d2);
    }

    @Test
    void testJava8UnsignedValue() {
        int intValue = Integer.parseUnsignedInt("4294967295");
        System.out.println("intValue = " + intValue);
        System.out.println("Integer.toUnsignedString() = " + Integer.toUnsignedString(intValue));
        assertThat(Integer.toUnsignedString(intValue)).isEqualTo("4294967295");
    }
}