package com.interview.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckingAccountTest {
    @Test
    public void shouldCreateCheckingAccount() throws Exception {
        CheckingAccount checkingAccount = new CheckingAccount();
        assertThat(checkingAccount,notNullValue());
    }
}
