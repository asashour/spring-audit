package abc.repository;

import abc.entity.Something;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(value = "test")
class SomethingRepositoryTest {

	@Autowired
	private SomethingRepository somethingRepository;

	@Test
	void test() {
		var something = new Something();
		somethingRepository.save(something);
	}
}