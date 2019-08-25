package com.example.demojunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class MathFunctionsTest {

    @Test
    public void addTwoNumbers_success() {
        MathFunctions mathFunctions = new MathFunctions();
        int sum = mathFunctions.addTwoNumbers(1, 2);

        assertThat(sum, is(3));

        assertThat(sum, not(1));
    }

}