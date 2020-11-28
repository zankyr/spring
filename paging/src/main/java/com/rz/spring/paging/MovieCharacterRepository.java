package com.rz.spring.paging;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieCharacterRepository extends CrudRepository<MovieCharacter, Long> {

    @Query("select c from MovieCharacter c")
    Page<MovieCharacter> findAll(Pageable pageable);
}
