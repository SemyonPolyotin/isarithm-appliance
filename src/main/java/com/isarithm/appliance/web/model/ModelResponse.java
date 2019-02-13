package com.isarithm.appliance.web.model;

import com.isarithm.appliance.domain.Model;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class ModelResponse {
	private UUID id;
	private String name;
	private String name_ru;

	public ModelResponse(Model model) {
		this.id = model.getId();
		this.name = model.getName();
		this.name_ru = model.getName_ru();
	}
}
