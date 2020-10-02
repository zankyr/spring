package com.rz.spring.paging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
@Slf4j
public class PagedController {

    @GetMapping("/test")
    public void getTest() {
        log.info("Called test...");
    }

}
