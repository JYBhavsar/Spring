package com.jb.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.jb.demo.model.Alien;

public interface AlienDAO extends CrudRepository<Alien,Integer> {

}
