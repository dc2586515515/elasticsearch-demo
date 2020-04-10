package com.dc.elasticsearchdemo.service;

import com.dc.elasticsearchdemo.entity.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Description Spring Data 的强大之处，就在于你不用写任何DAO处理，自动根据方法名或类的信息进行CRUD操作。
 * 只要你定义一个接口，然后继承Repository提供的一些子接口，就能具备各种基本的CRUD功能。
 * @Author DC
 * @Date 2020-04-10
 */
public interface ItemRepository extends ElasticsearchRepository<Item, Long> {
    /**
     * 根据价格区间查询
     *
     * @param price1
     * @param price2
     * @return
     */
    List<Item> findByPriceBetween(double price1, double price2);

    /**
     * 根据名称|| 价格查询
     * @param title
     * @param price
     * @return
     */
    List<Item> findByTitleOrPrice(String title, double price);
}
