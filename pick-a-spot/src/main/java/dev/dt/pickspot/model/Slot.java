package dev.dt.pickspot.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@JsonIgnoreProperties(ignoreUnknown = true)
public record Slot(int x, int y,String sizeCap, boolean hasColdUnit, boolean occupied)
{ 



}



/* 
public class Slot {

    public boolean hasColdUnit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasColdUnit'");
    }

    public boolean occupied() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'occupied'");
    }

    public Object sizeCap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sizeCap'");
    }

    public int x() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'x'");
    }

    public int y() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'y'");
    }
    
}
*/