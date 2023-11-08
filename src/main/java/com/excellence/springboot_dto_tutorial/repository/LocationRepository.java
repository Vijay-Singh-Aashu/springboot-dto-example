package com.excellence.springboot_dto_tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.springboot_dto_tutorial.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
