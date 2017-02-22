package by.epam.fh.test;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.RunWith;

// Общий запуск тестов.
@RunWith(Suite.class)
@SuiteClasses({
	tsk2_test_number_validation.class, 
	tsk2_test_multiply_logic.class,
	tsk1_test_circle_logic.class
	}) 

public class UnitTestsSuite {
	//

}
