package dev.dt.pickspot;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.dt.pickspot.dto.PickRequest;
import dev.dt.pickspot.dto.PickResponse;
import dev.dt.pickspot.service.PickerService;

@RestController		
@SpringBootApplication		
public class PickSpotApp {		
public static void main(String[] args) { SpringApplication.run(PickSpotApp.class, args); }		
@Autowired private PickerService picker;		
@PostMapping("/pickSpot")		
public ResponseEntity<PickRequest> pick(@RequestBody PickRequest req) {		




     
    return picker.chooseBestSlot(req.container(), req.yardMap())		
    .<ResponseEntity<?>>map(s -> ok(new PickResponse(req.container().id(), s.x(), s.y())))		
    .orElseGet(() -> badRequest().body(Map.of("error", "no suitable slot")));		



}




private Object badRequest() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'badRequest'");
}




private Object ok(PickResponse pickResponse) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'ok'");
}		
}		
