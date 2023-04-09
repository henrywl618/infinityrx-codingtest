public class Database {
    public static void main(String[] args) {
        Table people = new Table();
        people.add(new Row( "Greg", 6, 145, "Brown"));
        people.add(new Row( "Henry", 5.8, 140, "Green"));
        people.add(new Row( "Kevin", 5.8, 160, "Blue"));
        people.add(new Row( "Arthur", 5.5, 155, "Brown"));
        people.print();
        people.remove("Henry");
        people.add( new Row("Valerie", 5.3, 125, "Blue"));
        people.print();
    }
}
