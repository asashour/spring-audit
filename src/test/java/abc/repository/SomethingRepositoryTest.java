package abc.repository;

import abc.entity.Something;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SomethingRepositoryTest {

	@Autowired
	private SomethingRepository somethingRepository;

	@Test
	void test() {
		var something = new Something();
		somethingRepository.save(something);
	}
}