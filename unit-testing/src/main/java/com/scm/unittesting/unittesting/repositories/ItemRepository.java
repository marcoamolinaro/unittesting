package com.scm.unittesting.unittesting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.unittesting.unittesting.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
