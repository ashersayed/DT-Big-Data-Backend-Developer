package dev.dt.pickspot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Container(String id, String size, boolean needsCold, int x, int y)
{ 



}










/* 
public class Container {

    public Object size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    public boolean needsCold() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'needsCold'");
    }

    public int x() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'x'");
    }

    public int y() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'y'");
    }

    public Object id() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'id'");
    }
    
}
*/