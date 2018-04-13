package event.server.Event.repository;

import event.server.Event.Domain.TagEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagEventRepository extends JpaRepository<TagEvent, Long> {


}
