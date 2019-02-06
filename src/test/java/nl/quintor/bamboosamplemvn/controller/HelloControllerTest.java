package nl.quintor.bamboosamplemvn.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloControllerTest {

    private HelloController helloController;

    @Before
    public void setUp() throws Exception {
        this.helloController = new HelloController();
    }

    @Test
    public void index() {
        String expected = "Hello world!";
        String actual = helloController.index();
        assertEquals(expected, actual);
    }
}