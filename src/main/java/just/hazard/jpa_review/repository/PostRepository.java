package just.hazard.jpa_review.repository;

import just.hazard.jpa_review.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
