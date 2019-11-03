package pl.marekoleksik.springbootcourse.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.marekoleksik.springbootcourse.persistence.model.Course;

public interface CourseRepo extends BaseRepository<Course, Long>{
}
