package com.example.client_lab6;

import com.example.client_lab6.model.Book;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TabPane allTabPane;

    @FXML
    private Tab addBookIcon;

    @FXML
    private AnchorPane addBookPane;

    @FXML
    private Button addButton;

    @FXML
    private TextField author_field;

    @FXML
    private TextField nameBook_field;

    @FXML
    private TextField genre_field;

    @FXML
    private TextField year_field;

    @FXML
    private TextField state_field;

    @FXML
    private TableView<Book> tabViewBook;

    @FXML
    private TableColumn<?, ?> author;

    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private TableColumn<?, ?> genre;

    @FXML
    private TableColumn<?, ?> year;

    @FXML
    private TableColumn<?, ?> state;

    @FXML
    private Button viewBooks;

    @FXML
    private Button editButton;

    @FXML
    private TextField oldBookName_field;

    @FXML
    private TextField newAuthorName_field;

    @FXML
    private TextField newBookName_field;

    @FXML
    private TextField newGenre_field;

    @FXML
    private TextField newYear_field;

    @FXML
    private TextField newState_field;

    @FXML
    private Button searchButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField delete_field;
}