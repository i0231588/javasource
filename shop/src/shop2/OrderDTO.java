package shop2;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor

public class OrderDTO {
	private int orderId;
	private int userId;
	private int productId;
	private Date orderDate;
	
	//포함관계
	private UserDTO userDTO;
	private ProductDTO productDTO;
	}
