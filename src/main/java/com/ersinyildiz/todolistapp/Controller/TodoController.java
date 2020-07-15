package com.ersinyildiz.todolistapp.Controller;

import com.ersinyildiz.todolistapp.Repository.TodoRepository;
import com.ersinyildiz.todolistapp.Model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @RequestMapping("/")
    public String index(Model model, @ModelAttribute Todo todo){
        todo = new Todo();

        List<Todo> todos = (List<Todo>) todoRepository.findAll();
        model.addAttribute("todoList",todos);
        return "index";
    }
    @RequestMapping(value = "/indexpost",method = RequestMethod.POST)
    public String indexPost(Model model, @ModelAttribute Todo todo){
        todoRepository.save(todo);
        todo = new Todo();
        List<Todo> todos = (List<Todo>) todoRepository.findAll();
        model.addAttribute("todoList",todos);
        return "redirect:/";
    }
}
