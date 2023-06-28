package com.crud.springboot.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="TB_PRODUCT")
public class ProductModel implements Serializable{
	private static final long serialVersionID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idProduct;
	
	private String name;
	
	private BigDecimal value;

}
