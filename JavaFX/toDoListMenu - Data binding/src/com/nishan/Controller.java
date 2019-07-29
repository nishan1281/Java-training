package com.nishan;

import com.nishan.datamodel.TodoData;
import com.nishan.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Controller {

    private List todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea textAreaShow;
    @FXML
    private Label labelDueDate;
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private ContextMenu listContextMenu;
    @FXML
    private ToggleButton filterToggleButton;
    @FXML
    private FilteredList filteredList;
    private Predicate<TodoItem> wantAllItems;
    private Predicate<TodoItem> wantTodaysItems;

    @FXML
    public void showNewItemDialog()
    {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Add new Item");
        dialog.setHeaderText("Use this dialog is to create new items");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("todoItemDialog.fxml"));
        try{
//            Parent root = FXMLLoader.load(getClass().getResource("todoItemDialog.fxml"));
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }
        catch (IOException e)
        {
            System.out.println("Could not load the dialog!");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get()==ButtonType.OK)
        {
            DialogController controller = fxmlLoader.getController();
            TodoItem newItem = controller.processResults();
//            todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
            todoListView.getSelectionModel().select(newItem);
//            System.out.println("Ok is pressed");
//        }
//        else
//        {
//            System.out.println("Cancel pressed");
        }

    }

    public void initialize()
    {
        listContextMenu = new ContextMenu();
        MenuItem deleteMenuItems = new MenuItem("Delete");
        deleteMenuItems.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //now need to select the item and delete it by a method
                TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                deletItem(item);
            }
        });
        listContextMenu.getItems().addAll(deleteMenuItems);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observable, TodoItem oldValue, TodoItem newValue) {
                if (newValue != null)
                {
                    TodoItem items = todoListView.getSelectionModel().getSelectedItem();
                    textAreaShow.setText(items.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, YYYY");
                    labelDueDate.setText(df.format(items.getDeadlines()));

                }
            }
        });

        wantAllItems = new Predicate<TodoItem>() {
            @Override
            public boolean test(TodoItem item) {
                return true;
            }
        };

        wantTodaysItems = new Predicate<TodoItem>() {
            @Override
            public boolean test(TodoItem item) {
                return (item.getDeadlines().equals(LocalDate.now()));
            }
        };

        filteredList = new FilteredList<TodoItem>(TodoData.getInstance().getTodoItems(), wantAllItems);

        SortedList<TodoItem> sortedList = new SortedList<TodoItem>(filteredList,
        new Comparator<TodoItem>(){
            @Override
            public int compare(TodoItem O1, TodoItem O2){
             return O1.getDeadlines().compareTo(O2.getDeadlines());
            }
        }
        );

//        SortedList<TodoItem> sortedList = new SortedList<TodoItem>(TodoData.getInstance().getTodoItems(),
//        new Comparator<TodoItem>(){
//            @Override
//            public int compare(TodoItem O1, TodoItem O2){
//             return O1.getDeadlines().compareTo(O2.getDeadlines());
//            }
//        }
//        );
        todoListView.setItems(sortedList);

//        todoListView.setItems(TodoData.getInstance().getTodoItems());
        //            todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();

        todoListView.setCellFactory(new Callback<ListView<TodoItem>, ListCell<TodoItem>>() {
            @Override
            public ListCell<TodoItem> call(ListView<TodoItem> param) {
                ListCell<TodoItem> cell = new ListCell<TodoItem>()
                {
                    @Override
                    protected void updateItem(TodoItem item, boolean empty) {
                        super.updateItem(item, empty);
                      //below if and else is required to list the short description in GUI
                        if (empty){
                            setText(null);
                        }
                        else {
                            setText(item.getShortDescription());
                            if(item.getDeadlines().isBefore(LocalDate.now())){setTextFill(Color.RED);}
                            else if (item.getDeadlines().equals(LocalDate.now().plusDays(1))){setTextFill(Color.BLUE);}
                        }
                    }
                };

               //Adding context menu to associate with listview-<
                cell.emptyProperty().addListener(
                        (obs, wasEmpty, isNowEmpty)->{
                            if(isNowEmpty) {
                                cell.setContextMenu(null);
                            }
                            else {
                                cell.setContextMenu(listContextMenu);
                            }
                        }
                );
                //Adding context menu to associate with listview>

                return cell;
            }
        });

    }

    public void deletItem (TodoItem item)
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Todo Item");
        alert.setHeaderText("Delete Item: "+ item.getShortDescription());
        alert.setContentText("Are you sure? Press OK to confirm, or cancel to Back out.");
        Optional<ButtonType> result = alert.showAndWait();
        if(result.isPresent()&&(result.get()==ButtonType.OK))
        {
            TodoData.getInstance().deleteTodoItem(item);
                    }

    }

    public void handleKeyPressed(KeyEvent keyEvent){
        TodoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if (selectedItem!=null)
        {
            if (keyEvent.getCode().equals(KeyCode.DELETE)){
                deletItem(selectedItem);
            }
        }
    }

    //toggleButton controller

    public void handleFilterButton()
    {
        if (filterToggleButton.isSelected()){
            filteredList.setPredicate(wantAllItems);
        }
        else {
            filteredList.setPredicate(wantTodaysItems);
        }
    }

//    public void handleFilterButton(){
//        if (filterToggleButton.isSelected()){
//            filteredList.setPredicate(new Predicate<TodoItem>() {
//                @Override
//                public boolean test(TodoItem item) {
//                    return (item.getDeadlines().equals(LocalDate.now()));
//                }
//            });
//
//        }
//        else {
//            filteredList.setPredicate(new Predicate<TodoItem>() {
//                @Override
//                public boolean test(TodoItem item) {
//                    return true;
//                }
//            });
//        }
//    }

}
