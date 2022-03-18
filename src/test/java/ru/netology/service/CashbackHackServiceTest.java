package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected, "wrong bonus");
    }
    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected, "wrong bonus");
    }
    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(500);
        int expected = 500;

        assertEquals(actual, expected, "wrong bonus");
    }
    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected, "wrong bonus");
    }
    @Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 1000;

        assertEquals(actual, expected, "wrong bonus");
    }

}