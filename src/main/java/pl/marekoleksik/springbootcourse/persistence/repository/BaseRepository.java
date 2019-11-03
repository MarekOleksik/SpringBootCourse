package pl.marekoleksik.springbootcourse.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.marekoleksik.springbootcourse.persistence.model.BaseEntity;
import pl.marekoleksik.springbootcourse.persistence.model.Course;

import java.io.Serializable;

public interface BaseRepository<T extends BaseEntity, K extends Serializable>
        extends JpaRepository<T,K>, JpaSpecificationExecutor<T> {
}
