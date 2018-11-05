package com.mccarron.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Greeting {
	private String message;
	private String host;
}
