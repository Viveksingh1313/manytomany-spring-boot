package com.example.jpa.repository;

import com.example.jpa.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeevkumarsingh on 22/11/17.
 */
@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {

}
