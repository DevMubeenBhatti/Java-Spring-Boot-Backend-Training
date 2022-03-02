package com.college.college.repo;

import com.college.college.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    @Query(value="Select * from college.student where id = :stuid and status = 1", nativeQuery=true)
    Optional<Student> getStudentActive(Long stuid);

}
