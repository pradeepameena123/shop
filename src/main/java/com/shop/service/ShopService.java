package com.shop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.ShopDao;
import com.shop.entity.Shop;

@Service
public class ShopService {
	@Autowired 
	ShopDao ds;

	public String getName(Shop a) {
		return ds.getName(a);
	}

	public String getNames(List<Shop> a) {
		return ds.getNames(a);
	}

	public Shop getList(int a) {
		return ds.getList(a);
	}

	public List<Shop> getLists() {
		return ds.getLists();
	}

	public String getPut(Shop a) {
		return ds.getPut(a);
	}

	public String getDelete(int a) {
		return ds.getDelete(a);
	}

	public List<Shop> getRent(int a) {
		List<Shop> b=ds.getLists();
		List<Shop> c=b.stream().filter(d->d.getRent()>a).collect(Collectors.toList());
		return c;
	}

	public List<Shop> getNameRent(String a, int b) {
		List<Shop>e=ds.getLists();
		List<Shop>f=e.stream().filter(l->l.getName().equalsIgnoreCase(a) && l.getRent()==b).collect(Collectors.toList());
		return f;	}

	public Shop update(Shop s, int id) {
		return ds.update(s,id);
	}

	public Shop modify(Shop s, int id) {
		return ds.modify(s,id);
	}

	
	
  
}
