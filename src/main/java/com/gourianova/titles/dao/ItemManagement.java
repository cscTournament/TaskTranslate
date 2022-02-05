package com.gourianova.titles.dao;


import com.gourianova.titles.model.TodoItem;

import java.util.List;

public interface ItemManagement {

    public void addTodoItem ( TodoItem item );

    public void updateTodoItem ( List<TodoItem> items );

}
