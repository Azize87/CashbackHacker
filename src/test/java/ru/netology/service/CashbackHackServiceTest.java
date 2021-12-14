package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldReturn100() {
        int actual = cashbackHackService.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void shouldReturnZero() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }
}