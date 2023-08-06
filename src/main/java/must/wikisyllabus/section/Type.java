package must.wikisyllabus.section;

public enum Type {
    CPI1("CPI1"),
    CPI2("CPI2");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}