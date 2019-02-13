package com.isarithm.appliance.web.model;

import lombok.Data;

import java.util.UUID;

@Data
public class ModelRequest {
	private UUID id;
	private String name;
	private String name_ru;
}
