package org.Mahmoud;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Assignment {

    private String assignmentID;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private static int nextId = 1;

    public Assignment(String assignmentName, double weight, int maxScore) {
        this.assignmentID = String.format("A%02d", nextId);
        nextId++;

        this.assignmentName = Util.toTitleCase(assignmentName);

        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }

        if (maxScore > 0) {
            this.maxScore = maxScore;
        } else {
            this.maxScore = 0;
        }
    }

//    /**
//     *
//     */
//    public void calcAssignmentAvg() {
//        // Later
//    }

    private void generateAssignmentId() {
        this.assignmentName = String.format("A%02d", nextId);
        nextId++;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = Util.toTitleCase(assignmentName);
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void setMaxScore(int maxScore) {
        if (maxScore > 0) {
            this.maxScore = maxScore;
        }
    }
}
