package com.isarithm.account.services;

import com.isarithm.account.domain.Model;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface ModelService {
	Page<Model> getModels(Integer page, Integer size);
	Model getModel(UUID id);
}
