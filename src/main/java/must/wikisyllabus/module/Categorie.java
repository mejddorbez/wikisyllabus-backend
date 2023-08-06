package must.wikisyllabus.module;

public enum Categorie {


	Cours("Cours"),
	TP("TP"),
	TD("TD"),
	CoursIntegre("Cours Intégré");

    private final String value;

    Categorie(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
