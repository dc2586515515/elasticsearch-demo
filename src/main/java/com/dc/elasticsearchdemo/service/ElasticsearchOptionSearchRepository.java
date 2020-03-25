package com.dc.elasticsearchdemo.service;

import com.dc.elasticsearchdemo.entity.Blog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description 继承ElasticsearchRepository，继承基本CRUD操作
 * @Author DC
 * @Date 2020-03-25
 */
@Repository
public interface ElasticsearchOptionSearchRepository extends ElasticsearchRepository<Blog, String> {
}
