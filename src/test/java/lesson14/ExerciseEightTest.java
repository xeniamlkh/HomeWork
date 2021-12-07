package lesson14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ExerciseEightTest {

    static final Logger logger = LogManager.getLogger(ExerciseEightTest.class);

    private ExerciseEight exerciseEight;

    @BeforeAll
    static void mainStart() {
        logger.info("LOGGING THE TRACE...");
    }

    @BeforeEach
    public void startUp() {
        exerciseEight = new ExerciseEight();
        System.out.println("Starting the test!");
    }

    @AfterEach
    public void endTest() {
        System.out.println("End of the test!");
    }

    @AfterAll
    static void mainEnd() {
        System.out.println("FINISH!");
        logger.info("Stop logging");
    }

    @ParameterizedTest
    @MethodSource("dataCompareMethod")
    public void massTestShift(int[] arr, int n, int[] result) {
        Assertions.assertArrayEquals(result, exerciseEight.shiftArray(arr, n));
    }

    public static Stream<Arguments> dataCompareMethod() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6}, 1, new int[]{6, 1, 2, 3, 4, 5}),
                Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{5, 6, 1, 2, 3, 4}),
                Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6}, -25, new int[]{2, 3, 4, 5, 6, 1})
        );
    }

}