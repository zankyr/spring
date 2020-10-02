package com.rz.spring.paging;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = PagedController.class)
class PagedControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void whenTest_thenReturns200() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get("/characters/test"))
                .andExpect(status().isOk());
    }
}
