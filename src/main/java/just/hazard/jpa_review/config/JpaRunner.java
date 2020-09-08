package just.hazard.jpa_review.config;

import just.hazard.jpa_review.domain.Account;
import just.hazard.jpa_review.domain.Comment;
import just.hazard.jpa_review.domain.Post;
import just.hazard.jpa_review.domain.Study;
import just.hazard.jpa_review.repository.PostRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
