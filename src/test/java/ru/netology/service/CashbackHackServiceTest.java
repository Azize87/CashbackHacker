package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldReturn100JUnitVintage() {
        int actual = cashbackHackService.remain(900);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroJUnitVintage() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturn100JUnitJupiter() {
        int actual = cashbackHackService.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroJUnitJupiter() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);

    }
}