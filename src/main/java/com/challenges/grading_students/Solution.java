package com.challenges.grading_students;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class Solution {


    private static final Integer LOWER_BOUND = 38;
    private static final List<Integer> FIVE_MULTIPLES = Arrays.asList(40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100);

    public static void main(String[] args) {
        List<Integer> result = gradingStudents(Arrays.asList(0, 1, 73, 67, 38, 33, 99, 100));

        log.info("result -> {}", result);
    }

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        grades.forEach(grade -> {
            if (grade < LOWER_BOUND) {
                result.add(grade);
                return;
            }
            for (Integer multiple : FIVE_MULTIPLES) {
                if (multiple >= grade) {
                    if ((multiple - grade) < 3) {
                        result.add(multiple);
                    } else {
                        result.add(grade);
                    }
                    return;
                }
            }
        });
        return result;
    }
}
