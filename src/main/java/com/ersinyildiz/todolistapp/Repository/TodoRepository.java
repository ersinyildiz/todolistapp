package com.ersinyildiz.todolistapp.Repository;

import com.ersinyildiz.todolistapp.Model.Todo;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface TodoRepository extends CrudRepository<Todo,Long> {

}
