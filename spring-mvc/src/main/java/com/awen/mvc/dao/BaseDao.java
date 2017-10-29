package com.awen.mvc.dao;

import java.util.List;

import javax.sql.DataSource;

public interface BaseDao<T> {
	void setDataSource(DataSource dataSource);
	List<T> find();
	T get(Long id);
	void delete(Long id);
	void update(Long id);
	void insert(T t);
}
