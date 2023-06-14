module com.example.atividadejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atividadejavafx to javafx.fxml;
    exports com.example.atividadejavafx;
}