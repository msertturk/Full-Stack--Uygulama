package com.mehmetmertt.api.repository;

import com.mehmetmertt.api.entity.Lecture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILectureRepository extends JpaRepository<Lecture,Integer> {
    Page<Lecture> findAllBy(Pageable pageable);

}