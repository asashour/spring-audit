package abc.repository;

import abc.entity.Something;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ActiveProfiles(value = "test")
@Transactional
@Slf4j
class SomethingRepositoryTest {

	@Autowired
	private SomethingRepository somethingRepository;

	@Test
	void test() {
		var something = new Something();
		somethingRepository.save(something);
	}
}