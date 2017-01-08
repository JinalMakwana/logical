package util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mtech
 */
public class bean {
    String transport;
    String fromcity;
    String tocity;
    int cost;
int time;

    public int getTime() {
        return time;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCost() {
        return cost;
    }

    public String getTransport() {
        return transport;
    }

    public String getFromcity() {
        return fromcity;
    }

    public String getTocity() {
        return tocity;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setFromcity(String fromcity) {
        this.fromcity = fromcity;
    }

    public void setTocity(String tocity) {
        this.tocity = tocity;
    }
    
}
