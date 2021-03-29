package com.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Embeddable
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	private String addressLin1;
	private String city;
	private String country;
}
