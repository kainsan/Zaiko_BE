package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.CourseEntity;
import com.project.Zaiko.jpa.CourseId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, CourseId> {
    @Query(
            value = "SELECT * FROM m_course WHERE route_code = :routeCode AND del_flg = '0'",
            nativeQuery = true
    )
    List<CourseEntity> getCoursesByRouteCode(@Param("routeCode") String routeCode);
}
