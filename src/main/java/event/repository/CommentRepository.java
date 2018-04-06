package event.repository;

import event.domain.Comment;
import org.springframework.data.repository.Repository;

public interface CommentRepository extends Repository<Comment, Long> {


}
