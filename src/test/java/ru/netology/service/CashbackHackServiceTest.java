package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void  shouldReturn100() {
        int actual = cashbackHackService.remain(900);
        int expected = 100;

        Assert.assertEquals (expected,actual);
    }

    @Test
    public void shouldReturnZero() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }
}