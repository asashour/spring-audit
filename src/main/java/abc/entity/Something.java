package abc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.envers.Audited;

@Entity
@Data
@Audited
public class Something {
	@Id
	@GeneratedValue
	private Long id;
}
