package com.shop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.shop.entity.Shop;
import com.shop.repository.ShopRepository;

@Repository
public class ShopDao {
  @Autowired
  ShopRepository sh;
	
	public String getName(Shop a) {
		sh.save(a);
		return "save data";
	}

	public String getNames(List<Shop> a) {
		sh.saveAll(a);
		return "save all";
	}

	public Shop getList(int a) {
		return sh.findById(a).get();
	}

	public List<Shop> getLists() {
		return sh.findAll();
	}

	public String getPut(Shop a) {
		 sh.save(a);
		return "updated";
	}

	

	public String getDelete(int a) {
		sh.deleteById(a);
		return "This Id deleted";
	}

	public Shop update(Shop s, int id) {
		Shop x=sh.findById(id).get();
		x.setName(s.getName());
		x.setRent(s.getRent());
		x.setDoorNo(s.getDoorNo());
		x.setNoOfEmployee(s.getNoOfEmployee());
		return sh.save(x);
	}

	public Shop modify(Shop s, int id) {
		Shop d=sh.findById(id).get();
		d.setRent(s.getRent());
		return sh.save(d);
	}


	   
	   
}
