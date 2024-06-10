module tarea4 {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.base;
	
	opens tarea4 to javafx.graphics, javafx.fxml;
}