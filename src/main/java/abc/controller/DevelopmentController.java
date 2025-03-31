package abc.controller;

import abc.entity.Something;
import abc.repository.SomethingRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
@Transactional
@Slf4j
public class DevelopmentController {
	private final SomethingRepository somethingRepository;

	@GetMapping("test")
	public void test() {
		var something = new Something();
		somethingRepository.save(something);
	}

}
