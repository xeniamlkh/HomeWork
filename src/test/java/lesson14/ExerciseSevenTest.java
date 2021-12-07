package lesson14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ExerciseSevenTest {

    static final Logger logger = LogManager.getLogger(ExerciseSevenTest.class);

    private ExerciseSeven exerciseSeven;

    @BeforeAll
    static void mainStart() {
        logger.info("LOGGING THE TRACE...");
    }

    @BeforeEach
    public void startUp() {
        exerciseSeven = new ExerciseSeven();
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
    public void massTestCompare(int[] a) {
        Assertions.assertTrue(exerciseSeven.compareMethod(a));
    }

    public static Stream<Arguments> dataCompareMethod() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 2, 2, 1, 2, 2, 10, 1}),
                Arguments.arguments(new int[]{258, 2, 2, 1, 2, 2, 10, 1})
        );
    }
}