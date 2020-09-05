package just.hazard.jpa_review.config;

import just.hazard.jpa_review.domain.Account;
import just.hazard.jpa_review.domain.Comment;
import just.hazard.jpa_review.domain.Post;
import just.hazard.jpa_review.domain.Study;
import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Account account = new Account();
//        account.setPassword("hazard");
//        account.setUsername("eden");
//
//        Study study = new Study();
//        study.setName("JPA");
//
//        account.getStudies().add(study);
//        study.setOwner(account);
//
//        Session session = entityManager.unwrap(Session.class);
//        session.save(account);
//        session.save(study);
//
//        Account load = session.load(Account.class, account.getId());
//        System.out.println("==========================");
//        System.out.println(load.getUsername());

        Post post = new Post();
        post.setTitle("title");

        Comment comment = new Comment();
        comment.setComment("comment1");
        post.setComments(comment);

        Comment comment1 = new Comment();
        comment1.setComment("comment2");
        post.setComments(comment1);

        Session session = entityManager.unwrap(Session.class);
        session.save(post);
    }
}
