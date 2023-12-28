package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shop.entity.Shop;
import com.shop.service.ShopService;

@RestController
@RequestMapping(value="/shop")
public class ShopController {
	@Autowired
	ShopService as;
	
	@Autowired
	RestTemplate rt;
	
	@PostMapping(value="/getname")
    public String getName(@RequestBody Shop a) {
    	return as.getName(a);
    }
	
	@PostMapping(value="/getNames")
	public String getNames(@RequestBody List<Shop> a) {
		return as.getNames(a);
	}
	
	@GetMapping(value="/get/{a}")
	public Shop getList(@PathVariable int a) {
		return as.getList(a);
	}
	
	@GetMapping(value="/getList")
	public List<Shop> getLists(){
		return as.getLists();
	}
	
	@PutMapping(value="/getPut")
	public String getPut(@RequestBody Shop a) {
		return as.getPut(a);
	}
	@DeleteMapping(value="/getDelete/{a}")
	public String getDelete(@PathVariable int a) {
		return as.getDelete(a);
	}
	
	@GetMapping(value="/getRent/{a}")
	public List<Shop> getRent(@PathVariable int a) {
		return as.getRent(a);
	}
	
@PutMapping(value="/update/{id}")
public Shop update(@RequestBody Shop s,@PathVariable int id) {
	return as.update(s,id);
}
	
  @PatchMapping(value="/modify/{id}")
  public Shop modify(@RequestBody Shop s,@PathVariable int id) {
	  return as.modify(s,id);
  }
  
  @GetMapping(value="/name")       
  public String getTax() {
	  String url1="http://localhost:8080/bank/bankapp";
//	 ResponseEntity<String> ab=rt.exchange(url1,HttpMethod.GET,null,String.class);
//	   return ab.getBody()
	 String r=rt.getForObject(url1, String.class);
	  return r;
  }
	}
