import java.util.ArrayList;

public class Table {

    ArrayList<Row> rows;

    Table(){
        this.rows = new ArrayList<Row>();
    }

    void add(Row row){
        rows.add(row);
    }

    public Row find(String name) throws Exception{
        for(Row row : this.rows){
            if(row.name == name){
                return row;
            }
        }
        throw new Exception("Unable to find " + name );
    }

    void remove(String name){
        try {
            this.rows.remove( this.find(name) );
            // System.out.println("Removed "+name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void print(){
        System.out.println("Name |Height |Weight |Eye Color");
        for(Row row : this.rows){
            System.out.println(row.name+" | "+row.height+" | "+row.weight+" | "+row.eyeColor);
        }
        System.out.println();
    }
}
