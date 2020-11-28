package com.rz.spring.paging;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
@Slf4j
public class PagedController {

    private final MovieCharacterRepository movieCharacterRepository;

    @GetMapping("/page")
    public Page<MovieCharacter> loadCharacterPage(Pageable pageable) {
        return movieCharacterRepository.findAll(pageable);
    }

}
