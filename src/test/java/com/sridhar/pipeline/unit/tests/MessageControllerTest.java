package com.sridhar.pipeline.unit.tests;

import com.sridhar.pipeline.MessageController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MessageControllerTest {

    @Test
    public void getMessage() {
        MessageController controller = new MessageController();
        String response = controller.getMessage("Sridhar");
        assertEquals("Hello, Sridhar", response);
    }
}