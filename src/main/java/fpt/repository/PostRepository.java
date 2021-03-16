package fpt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fpt.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	
	@Query(value="select * from Post p where p.postId like :id and deleteBy is null and postStatus like 'True'", nativeQuery = true)
	Post findOneById( @Param("id") int id);
	
	@Query(value="select * from Post p where deleteBy is null and postStatus like '1'", nativeQuery = true)
	List<Post> findAllAvailability();
}
