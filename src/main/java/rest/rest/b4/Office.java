package rest.rest.b4;

public enum Office {
	TRAINING_ROOM("Laptop","Training") , CAFETERIA("Food","Eating"), CONFERENCE_ROOM("Presentation","Meeting"), LOBBY("Plants",null);
String var;
String act;
	Office(String var, String act) {
	this.var = var;
	this.act = act;
}

}
