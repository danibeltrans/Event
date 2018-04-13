package event.server.Event.Domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tblAttendance")
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean attendance;

    @Column(nullable = false)
    private Integer rate;

    @Column(nullable = false)
    private Long idUser;

    @Column(nullable = false)
    private Long idEvent;

    public Attendance(boolean attendance, Integer rate, Long idUser, Long idEvent) {
        this.attendance = attendance;
        this.rate = rate;
        this.idUser = idUser;
        this.idEvent = idEvent;
    }

    public Long getId() {
        return id;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public Integer getRate() {
        return rate;
    }

    public Long getIdUser() {
        return idUser;
    }

    public Long getIdEvent() {
        return idEvent;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", attendance=" + attendance +
                ", rate=" + rate +
                ", idUser=" + idUser +
                ", idEvent=" + idEvent +
                '}';
    }
}
