package just.hazard.jpa_review.repository;

import just.hazard.jpa_review.domain.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void crudRepository() {
        Post post = new Post();
        post.setTitle("justhis");

        Post save = postRepository.save(post);
        assertThat(save.getId()).isNotNull();

        Optional<Post> byId = postRepository.findById(100l);
        assertThat(byId).isEmpty();
    }
}