package com.pgs.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClaimInput {

	private String customerName = "";
	private String customerId="";
	private Date claimDate= null;
	private String contactPhone = "";
	private String email = "";
	private String polno = "";
	private int applyItem = 0;
	private int claimType = 0;

}
