package com.nishan;

import com.nishan.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Controller {

    private List todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea textAreaShow;
    @FXML
    private Label labelDueDate;

    public void initialize()
    {
        TodoItem item1 = new TodoItem("Mail birthday cards","Buy birthday cards",LocalDate.of(2019,Month.APRIL,25));
        TodoItem item2 = new TodoItem("Doctors appointment","Buy tickets",LocalDate.of(2020,Month.MAY,25));
        TodoItem item3 = new TodoItem("Ticket need to buy","Finish design",LocalDate.of(2021,Month.JUNE,25));
        TodoItem item4 = new TodoItem("Need to give eid greetings","Pick up from station",LocalDate.of(2022,Month.JULY,25));
        TodoItem item5 = new TodoItem("Need homeworks of office","Pick up dry cleanin",LocalDate.of(2019,Month.JANUARY,25));

        todoItems = new ArrayList<TodoItem>();
        Collections.addAll(todoItems,item1,item2,item3,item4,item5);

        todoListView.getItems().addAll(todoItems);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observable, TodoItem oldValue, TodoItem newValue) {
                if (newValue != null)
                {
                    TodoItem items = todoListView.getSelectionModel().getSelectedItem();
                    textAreaShow.setText(items.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, YYYY");
                    labelDueDate.setText(df.format(items.getDeadlines()));

//                    labelDueDate.setText(items.getDeadlines().toString());
                }
            }
        });


        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

//    public void handleClcikListView ()
//    {
////        TodoItem items = todoListView.getSelectionModel().getSelectedItem();
////        textAreaShow.setText(items.getDetails());
////        labelDueDate.setText(items.getDeadlines().toString());
////        System.out.println("You selected : " + items);
////        textAreaShow.setText(items.getDetails());
////        StringBuilder sb = new StringBuilder(items.getDetails());
////        sb.append("\n\n");
////        sb.append("Due : ");
////        sb.append(items.getDeadlines().toString());
////        textAreaShow.setText(sb.toString());
//    }

}
