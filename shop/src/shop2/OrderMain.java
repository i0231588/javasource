package shop2;

public class OrderMain {

	public static void main(String[] args) {
		OrderDTO dto = new OrderDTO();
		
		//property에 값 세팅 => 1)생성자 2) setter메소드
		dto.setOrderId(1000);
		
		//dto.setUserDTO(new UserDTO(100,"hong",1,"card"));
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(100);
		userDTO.setName("hong");
		userDTO.setPayNo(1);
		userDTO.setType("card");
		dto.setUserDTO(userDTO);
		
		//property 값 조회
		System.out.println(dto.getOrderId());
		System.out.println(dto.getUserDTO().getName());
		
		UserDTO getUser = dto.getUserDTO();
		System.out.println(getUser.getName());
		System.out.println(getUser.getType());
	}

}
