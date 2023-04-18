package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString 

public class UserDTO {
	
	
	private int userId;
	private String name;
	private int payNo;
	
	private String type;
}
