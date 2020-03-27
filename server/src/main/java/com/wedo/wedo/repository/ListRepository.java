package com.wedo.wedo.repository;

import com.wedo.wedo.dto.ListDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<ListDto, String> {

}
