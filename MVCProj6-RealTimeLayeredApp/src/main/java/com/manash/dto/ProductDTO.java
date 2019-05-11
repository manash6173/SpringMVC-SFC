package com.manash.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ProductDTO implements Serializable{
	private int slno;
	private int pid;
	private String pname;
	private float price;
	private Date mfgDate;
	private Date expDate;

}
