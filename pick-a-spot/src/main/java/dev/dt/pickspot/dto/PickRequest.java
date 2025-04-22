package dev.dt.pickspot.dto;

import java.util.List;

import dev.dt.pickspot.model.Container;
import dev.dt.pickspot.model.Slot;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;




public class PickRequest {




    Container c;
    List<Slot> s;

    public Container container() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'container'");

        



    }

    public List<Slot> yardMap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'yardMap'");
    }
    
}
