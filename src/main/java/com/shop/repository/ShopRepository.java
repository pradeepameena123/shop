package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.entity.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer>{

}
