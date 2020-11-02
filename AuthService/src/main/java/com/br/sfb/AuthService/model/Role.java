package com.br.sfb.AuthService.model;

import lombok.Getter;
import lombok.Setter;

public class Role {


	@Getter @Setter
	private Long id;
	@Getter @Setter
	private String roleName;
	
	public Role() {
	}

	public Role(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
	
}