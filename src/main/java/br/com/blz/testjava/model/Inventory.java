package br.com.blz.testjava.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Inventory {
	private List<Warehouse> warehouses;
}
