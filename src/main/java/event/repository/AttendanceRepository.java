package event.repository;

import event.domain.Attendance;
import org.springframework.data.repository.Repository;

public interface AttendanceRepository extends Repository<Attendance, Long> {
}
