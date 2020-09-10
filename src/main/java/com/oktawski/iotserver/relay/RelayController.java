package com.oktawski.iotserver.relay;

import com.oktawski.iotserver.superclasses.IController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("relays")
public class RelayController implements IController<Relay> {

    private final RelayService service;

    @Autowired
    public RelayController(RelayService service){
        this.service = service;
    }

    @PostMapping
    @Override
    public ResponseEntity<Relay> add(@RequestBody Relay relay) {
        return service.add(relay);
    }

    @DeleteMapping("{id}")
    @Override
    public ResponseEntity<Relay> deleteById(@PathVariable("id") Long id) {
        return service.deleteById(id);
    }

    @GetMapping
    @Override
    public ResponseEntity<List<Relay>> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    @Override
    public ResponseEntity<Relay> getById(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @GetMapping("ip/{ip}")
    @Override
    public ResponseEntity<Relay> getByIp(@PathVariable("ip") String ip) {
        return service.getByIp(ip);
    }

    @PutMapping("{id}")
    @Override
    public ResponseEntity<Relay> update(@PathVariable("id") Long id, @RequestBody Relay relay) {
        return service.update(id, relay);
    }

    @PostMapping("{id}/turn")
    @Override
    public ResponseEntity<Relay> turnOnOf(@PathVariable("id") Long id) {
        return service.turnOnOf(id);
    }
}
