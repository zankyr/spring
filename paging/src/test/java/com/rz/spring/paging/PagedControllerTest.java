package com.rz.spring.paging;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = PagedController.class)
class PagedControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MovieCharacterRepository movieCharacterRepository;


    @Test
    void whenPage_thenOk() throws Exception {
        mockMvc
                .perform(get("/characters/page"))
                .andExpect(status().isOk());
    }

    @Test
    void whenPage_withPageAndSize_thenOk() throws Exception {
        mockMvc
                .perform(
                        get("/characters/page")
                                .param("page", "5")
                                .param("size", "10")
                                .param("sort", "id,desc")
                                .param("sort", "name,desc")
                )
                .andExpect(status().isOk());
    }
}

