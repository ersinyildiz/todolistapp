package com.ersinyildiz.todolistapp.Models;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface TodoDao extends CrudRepository<Todo,Long> {

}
