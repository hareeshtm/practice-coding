package com.tmcoder.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class StudentSkill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String skill;
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	private Student s;

	public StudentSkill() {

	}

	public StudentSkill(int id, String skill, Student s) {
		super();
		this.id = id;
		this.skill = skill;
		this.s = s;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "StudentSkill [id=" + id + ", skill=" + skill + ", s=" + s + "]";
	}
}
