package com.oktawski.iotserver.relay;

import com.oktawski.iotserver.superclasses.WifiDevice;

import javax.persistence.*;

@Entity
@Table(name = "relays")
public class Relay extends WifiDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "relay_id")
    Long id;

    public Relay(){}

    public Relay(String name, String address, Boolean on){
        super(name, address, on);
    }

    public Long getId(){
        return id;
    }
}