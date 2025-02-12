package com.teamairline.flightManagementSystem.dao;
import java.util.List;

import com.teamairline.flightManagementSystem.bean.Feedback;


public interface FeedbackDao {
    void saveNewFeedback(Feedback feedback);
    List<Feedback> displayAllFeedbacks(); 
    Long generateFeedbackId();
    Feedback findFeedbackById(Long id); // Optional: Method to find feedback by ID
  // Optional: Method to update feedback
    void deleteFeedback(Long id); // Optional: Method to delete feedback
    long countFeedbacks();
    List<Feedback> findFeedbackByUsername(String username);
}