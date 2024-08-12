package com.application.exception;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomExceptionTest {

    @InjectMocks
    private CustomException customException;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void CustomExceptionArgumentTest()
    {
        new CustomException("test");
    }

    @Test
    public void CustomExceptionNoArgumentTest()
    {
        new CustomException();
    }

    @Test
    public void getErrorMessageTest()
    {
        customException.getErrorMessage();
    }

}