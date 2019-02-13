package com.isarithm.account.repository;

import com.isarithm.account.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModelRepository
		extends JpaRepository<Model, UUID> {
}
