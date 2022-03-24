package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(500);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 1000;

        assertEquals(expected, actual);
    }

}