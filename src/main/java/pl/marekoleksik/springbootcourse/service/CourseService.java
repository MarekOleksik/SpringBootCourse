package pl.marekoleksik.springbootcourse.service;

import pl.marekoleksik.springbootcourse.model.CourseDTO;
import pl.marekoleksik.springbootcourse.persistence.model.Course;
import pl.marekoleksik.springbootcourse.persistence.repository.CourseRepo;

import java.util.List;

public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);

    CourseDTO createCourse(CourseDTO courseDTO);

    List<CourseDTO> getAllCourses();
}
