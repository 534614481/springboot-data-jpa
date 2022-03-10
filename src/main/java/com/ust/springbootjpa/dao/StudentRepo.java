package com.ust.springbootjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.springbootjpa.entity.Country;

@Repository
public interface StudentRepo extends JpaRepository<Country,String> {

}
