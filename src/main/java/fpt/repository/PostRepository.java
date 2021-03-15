package fpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fpt.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	
	@Query(value="select * from Post p where p.postId like :id", nativeQuery = true)
	Post findOneById( @Param("id") int id);
}
