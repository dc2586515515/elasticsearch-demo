package com.dc.elasticsearchdemo.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 说明
 *
 * indexName  索引名称，其实相当于咱们的数据库名称 ，必须为小写，
 * 不然会报org.elasticsearch.indices.InvalidIndexNameException异常
 *
 * 而type：类型 ，其实相当于咱们的数据库表的名称
 *
 */

/**
 * @Description
 * @Author DC
 * @Date 2020-03-24
 */
@Data
@Document(indexName = "testdata", type = "blogs")
public class Blog {
    private Long id;
    private String masterName;
    private Integer articleNum;
    private Integer commentNum;
    private Integer thumbNum;
    private String description;

}