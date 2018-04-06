package event.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "tblFile")
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Lob
    @Column(nullable = false, length=100000)
    @Basic(fetch = FetchType.LAZY)
    private byte[] content;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean active;

    @Column(nullable = false)
    private Long idEvent;

    private Date creationDate;


    public File(byte[] content, String url, boolean active, Long idEvent, Date creationDate) {
        this.content = content;
        this.url = url;
        this.active = active;
        this.idEvent = idEvent;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public byte[] getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }

    public boolean isActive() {
        return active;
    }

    public Long getIdEvent() {
        return idEvent;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", content=" + Arrays.toString(content) +
                ", url='" + url + '\'' +
                ", active=" + active +
                ", idEvent=" + idEvent +
                ", creationDate=" + creationDate +
                '}';
    }
}
