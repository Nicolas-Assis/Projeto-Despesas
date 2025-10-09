module org.sysimc {
    // Módulos que seu projeto precisa
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires annotations;
//    requires h2;

    // Permissões para o JavaFX funcionar
    opens org.despesa.controller to javafx.fxml;
    opens org.despesa.model to javafx.fxml, javafx.base;

    // Exporta o pacote principal
    exports org.despesa;
}