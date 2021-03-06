package model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class House implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHouse;

    @ManyToOne
    @JoinColumn(name = "idCharacter", nullable = true)
    private Player player;

    private String houseName;

    @Temporal(TemporalType.DATE)
    private Calendar dateBid;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataEnd;

    public House() {
    }

    public House(Player player, String houseName, Calendar dateBid) {
        this.player = player;
        this.houseName = houseName;
        this.dateBid = dateBid;
    }

    public House(Player player, String houseName, Calendar dateBid, Calendar dateLeave) {
        this.player = player;
        this.houseName = houseName;
        this.dateBid = dateBid;
        this.dataEnd = dateLeave;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public Calendar getDateBid() {
        return dateBid;
    }

    public void setDateBid(Calendar dateBid) {
        this.dateBid = dateBid;
    }

    public Calendar getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(Calendar dataEnd) {
        this.dataEnd = dataEnd;
    }

    public Integer getIdHouse() {
        return idHouse;
    }

    public Player getPlayer() {
        return player;
    }
    
    

}
