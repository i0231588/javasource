package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor

public class PayType {
	//	열거타입 enum
	//한정된 값만을 갖는 데이터 타입
	
	//결제 시 카드, 현금만 허용
	private int payNo;
	private String info;
}
