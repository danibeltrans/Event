package event.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tblTagEvent")
public class TagEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long idEvent;

    @Column(nullable = false)
    private Long idTag;

    public TagEvent(Long idEvent, Long idTag) {
        this.idEvent = idEvent;
        this.idTag = idTag;
    }

    public Long getId() {
        return id;
    }

    public Long getIdEvent() {
        return idEvent;
    }

    public Long getIdTag() {
        return idTag;
    }

    @Override
    public String toString() {
        return "TagEvent{" +
                "id=" + id +
                ", idEvent=" + idEvent +
                ", idTag=" + idTag +
                '}';
    }
}
