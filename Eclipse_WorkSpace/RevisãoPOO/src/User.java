public abstract class User {
	
private int id;
private String name;
private String BirthDate;

protected User(int id) {
	this.id = id;	
}

public int getId(){
	return id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBirthDate() {
	return BirthDate;
}

public void setBirthDate(String birthDate) {
	BirthDate = birthDate;
}

public String formatPersonalDate(){
	
	return String.format("ID: %d\nNome: %s\n", this.id, this.name);
}


}