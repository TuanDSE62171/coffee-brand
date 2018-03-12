package io.cobra.branchservice.repository;

import io.cobra.branchservice.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {
    
    Optional<Rating> findByBranchIdAndCustomerId(Integer branchId, Integer customerId);
    
    List<Rating> findByBranchId(Integer branchId);
}
