package com.person.cms.dao;

import com.person.cms.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerDao extends JpaRepository<Customer,Integer> {
}
