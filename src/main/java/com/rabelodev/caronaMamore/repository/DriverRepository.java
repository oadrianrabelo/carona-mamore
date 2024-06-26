package com.rabelodev.caronaMamore.repository;

import com.rabelodev.caronaMamore.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DriverRepository extends JpaRepository<Driver, UUID> {

    List<Driver> findAllDtoByOrderByIdAsc();
}
