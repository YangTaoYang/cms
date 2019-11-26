package com.person.cms.dao;

import com.person.cms.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticleDao extends JpaRepository<Article,Integer> {
}
