package com.isarithm.account.services;

import com.isarithm.account.domain.Model;
import com.isarithm.account.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ModelServiceImpl implements ModelService {
	private final ModelRepository modelRepository;

	@Autowired
	public ModelServiceImpl(ModelRepository modelRepository) {
		this.modelRepository = modelRepository;
	}

	@Override
	public Page<Model> getModels(Integer page, Integer size) {
		return modelRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public Model getModel(UUID id) {
		return modelRepository.getOne(id);
	}
}
