package com.excellence.springboot_dto_tutorial.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
	private long userId;
	private String email;
	private String place;
	private double longitude;
	private double latitude;
}
