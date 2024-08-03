package com.teamairline.flightManagementSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teamairline.flightManagementSystem.bean.Feedback;


public interface FeedbackRepository extends JpaRepository<com.teamairline.flightManagementSystem.bean.Feedback, Long> {
    @Query("select max(fId) from Feedback")
    Long findLastFeedbackId();
    List<Feedback> findByUsername(String username); 
}