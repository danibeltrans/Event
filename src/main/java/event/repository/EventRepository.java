package event.repository;

import event.domain.Event;
import org.springframework.data.repository.Repository;

public interface EventRepository extends Repository<Event, Long>  {


}
