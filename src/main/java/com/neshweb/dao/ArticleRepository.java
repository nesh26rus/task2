package com.neshweb.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.neshweb.v.Article;

/**
 * Created by Nesh on 24.11.2017.
 */

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
}