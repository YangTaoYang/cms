package com.person.cms.dao;

import com.person.cms.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDao extends JpaRepository<Category,Integer> {
}
