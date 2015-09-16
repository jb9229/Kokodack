package me.kd.DAO;

import com.google.appengine.api.datastore.Key;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by test on 2015-09-12.
 */
@Entity
//@Getter
//@Setter
public class Dockjang {
    @Id @GeneratedValue
    private Key key;


    private int temper;


    private int humidity;


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemper() {
        return temper;
    }

    public void setTemper(int temper) {
        this.temper = temper;
    }
}
