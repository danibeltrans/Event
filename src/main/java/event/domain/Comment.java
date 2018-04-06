package event.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tblComment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private Long idEvent;

    @Column(nullable = false)
    private Long idUser;

    private Date creationDate;

    private Date updateDate;

    public Comment(String comment, Long idEvent, Long idUser, Date creationDate, Date updateDate) {
        this.comment = comment;
        this.idEvent = idEvent;
        this.idUser = idUser;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public Long getIdEvent() {
        return idEvent;
    }

    public Long getIdUser() {
        return idUser;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", idEvent=" + idEvent +
                ", idUser=" + idUser +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                '}';
    }
}

