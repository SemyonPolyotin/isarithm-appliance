package com.isarithm.account.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "models", schema = "appliance")
public class Model {
	@Id
	@Column(name = "models_id")
	private UUID id;

	@Column(name = "models_name")
	private String name;

	@Column(name = "models_name_ru")
	private String name_ru;
}
