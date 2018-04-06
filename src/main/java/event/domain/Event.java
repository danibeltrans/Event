package event.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tblEvent")
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String longitude;

    @Column(nullable = false)
    private String latitude;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean active;

    @Column(nullable = false)
    private Double cost;

    @Column(nullable = false)
    private Long idUser;

    @Column(nullable = false)
    private Long idEventType;

    @Column(nullable = false)
    private Date publishedDate;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean apublishedctive;

    private Date creationDate;

    private Date updateDate;

    public Event(String title, String description, String longitude, String latitude, Date date, String address, boolean active, Double cost, Long idUser, Long idEventType, Date publishedDate, boolean apublishedctive, Date creationDate, Date updateDate) {
        this.title = title;
        this.description = description;
        this.longitude = longitude;
        this.latitude = latitude;
        this.date = date;
        this.address = address;
        this.active = active;
        this.cost = cost;
        this.idUser = idUser;
        this.idEventType = idEventType;
        this.publishedDate = publishedDate;
        this.apublishedctive = apublishedctive;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public Date getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public boolean isActive() {
        return active;
    }

    public Double getCost() {
        return cost;
    }

    public Long getIdUser() {
        return idUser;
    }

    public Long getIdEventType() {
        return idEventType;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public boolean isApublishedctive() {
        return apublishedctive;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", active=" + active +
                ", cost=" + cost +
                ", idUser=" + idUser +
                ", idEventType=" + idEventType +
                ", publishedDate=" + publishedDate +
                ", apublishedctive=" + apublishedctive +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
