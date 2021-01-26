package com.sridhar.pipeline.integration.tests;

import com.sridhar.pipeline.MessageController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@WebMvcTest(MessageController.class)
public class MessageControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getMessage() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/messages/greet/Sridhar");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Hello, Sridhar, Kubernetes is fun !!", result.getResponse().getContentAsString());
    }
}