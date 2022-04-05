package com.tmcoder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmcoder.entity.StudentSkill;
@Repository
public interface SkillRepo extends JpaRepository<StudentSkill, Integer> {

}
