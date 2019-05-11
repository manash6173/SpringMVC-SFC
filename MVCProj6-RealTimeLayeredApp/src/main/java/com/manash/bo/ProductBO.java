package com.manash.bo;

import java.util.Date;

import lombok.Data;

@Data
public class ProductBO {
	private int pid;
	private String pname;
	private float price;
	private Date mfgDate;
	private Date expDate;

}
