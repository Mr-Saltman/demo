package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.WebController;

@SpringBootTest
class WebControllerTests {

    @Test
    void test_setMessage() {
        WebController controller = new WebController();
        String actualMessage = controller.setMessage("TEST");
        Assertions.assertEquals("TEST", actualMessage);
    }

    @Test
    void test_getMessage(){
        WebController controller = new WebController();
        String actualMessage = controller.getMessage();
        Assertions.assertEquals("default", actualMessage);
    }

    @Test
    void test_resetMessage(){
        WebController controller = new WebController();
        String actualMessage = controller.resetMessage();
        Assertions.assertEquals("", actualMessage);
    }

    @Test
    void test_changeStatus(){
        WebController controller = new WebController();
        boolean actualStatus = controller.changeStatus();
        Assertions.assertEquals(false, actualStatus);
    }

}
