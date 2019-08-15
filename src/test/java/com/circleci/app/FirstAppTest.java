package com.circleci.app;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAppTest {

    @Test
    public void getName() {

        FirstApp app = new FirstApp();
        Assert.assertEquals("first name",app.getName());
    }
}