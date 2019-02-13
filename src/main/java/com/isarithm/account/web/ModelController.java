package com.isarithm.account.web;

import com.isarithm.account.domain.Model;
import com.isarithm.account.services.ModelService;
import com.isarithm.account.web.model.ModelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(ModelController.baseUri)
public class ModelController {
	static final String baseUri = "/models";

	private final ModelService modelService;

	@Autowired
	public ModelController(ModelService modelService) {
		this.modelService = modelService;
	}

	@RequestMapping(method = RequestMethod.GET, value = "")
	public Page<ModelResponse> getModels(@RequestParam(value = "page", defaultValue = "0") Integer page,
										 @RequestParam(value = "size", defaultValue = "25") Integer size) {
		return modelService.getModels(page, size).map(ModelResponse::new);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/by")
	public ResponseEntity getModelBy(@RequestParam(value = "id", required = false) UUID id) {
		Model model;
		if (id != null) {
			model = modelService.getModel(id);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}

		if (model != null) {
			return ResponseEntity.ok(new ModelResponse(model));
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
	}
}
