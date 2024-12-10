package com.megago.megago.Models.Common;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class Rating {

    @NotNull(message = "Rater entity ID cannot be null")
    private Long raterEntityId;

    @Min(value = 0, message = "Rating value must be between 0 and 5")
    @Max(value = 5, message = "Rating value must be between 0 and 5")
    private int ratingValue;

    private String feedback;

    public Rating(@NotNull(message = "Rater entity ID cannot be null") Long raterEntityId,
            @Min(value = 0, message = "Rating value must be between 0 and 5") @Max(value = 5, message = "Rating value must be between 0 and 5") int ratingValue,
            String feedback) {
        this.raterEntityId = raterEntityId;
        this.ratingValue = ratingValue;
        this.feedback = feedback;
    }

    public Long getRaterEntityId() {
        return raterEntityId;
    }

    public void setRaterEntityId(Long raterEntityId) {
        this.raterEntityId = raterEntityId;
    }

    public int getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Rating [raterEntityId=" + raterEntityId + ", ratingValue=" + ratingValue + ", feedback=" + feedback + "]";
    }
}
