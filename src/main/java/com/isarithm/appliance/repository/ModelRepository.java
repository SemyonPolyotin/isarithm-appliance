package com.isarithm.appliance.repository;

import com.isarithm.appliance.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModelRepository
		extends JpaRepository<Model, UUID> {
}
