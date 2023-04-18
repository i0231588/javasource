package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		EmpDAO empDAO = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag) {
			System.out.println("-------------------");
			System.out.println("1.사원 추가");
			System.out.println("2.사원 삭제");
			System.out.println("3.사원 수정");
			System.out.println("4.사원 조회(사번)");
			System.out.println("5.사원 조회(이름)");
			System.out.println("6. 종료");
			System.out.println("-------------------");
			
			System.out.print("메뉴: ");
			//메뉴번호 입력받기
			System.out.println("메뉴번호 입력: ");
			int num = Integer.parseInt(sc.nextLine());
			
			//switch
			switch (num) {
			case 1:
				//삽입할 사원정보 입력받기
				EmpDTO empDTO = new EmpDTO();
				System.out.println("새 사원 추가");
				System.out.println("사원번호: ");
				empDTO.setEmpno(Integer.parseInt(sc.nextLine()));
				System.out.println("사원명: ");
				empDTO.setEname(sc.nextLine());
				System.out.println("직무: ");
				empDTO.setJob(sc.nextLine());
				System.out.println("매니저 번호: ");
				empDTO.setMgr(Integer.parseInt(sc.nextLine()));
				System.out.println("급여: ");
				empDTO.setSal(Integer.parseInt(sc.nextLine()));
				System.out.println("추가수당: ");
				empDTO.setComm(Integer.parseInt(sc.nextLine()));
				System.out.println("부서번호: ");
				empDTO.setDeptno(Integer.parseInt(sc.nextLine()));
				
				System.out.println(empDAO.insert(empDTO)?"사원추가성공":"사원추가실패");
				
	
				break;
			case 2:
				System.out.println("삭제할 사원번호 입력: ");
				int empno = Integer.parseInt(sc.nextLine());
				
				System.out.println(empDAO.remove(empno)?"삭제성공":"삭제실패");
				
				break;
			case 3:
				System.out.println("수정할 정보 입력: ");
				System.out.println("사원번호 : ");
				empno = Integer.parseInt(sc.nextLine());
				
				System.out.println("수정 급여: ");
				int sal = Integer.parseInt(sc.nextLine());
				System.out.println(empDAO.update(sal, empno)?"급여 변경 성공":"급여 변경 실패");
				
		
				
				break;
			case 4:
				System.out.print("사번 입력: ");
				empno = Integer.parseInt(sc.nextLine());
				
				
				EmpDTO dto = empDAO.getRow(empno);
				
//				System.out.println(dto);
				System.out.println("\n*** 사원정보 조회 ***");
				System.out.println("사원 번호: "+ dto.getEmpno());
				System.out.println("사원 명: "+ dto.getEname());
				System.out.println("직무: "+ dto.getJob());
				System.out.println("급여: "+ dto.getSal());
				System.out.println("추가수당: "+ dto.getComm());
				System.out.println("부서번호: "+ dto.getDeptno());
				System.out.println();
				break;
			case 5:
				//이름 입력받기
				System.out.println("조회할 사원명 입력");
				String ename = sc.nextLine();
				ArrayList<EmpDTO> list = empDAO.getList(ename);
				
				System.out.println();
				System.out.println("사번\t 사원명 \t 직무 \t 입사일");
				System.out.println("-------------------------------");
				for (EmpDTO empDTO1 : list) {
					System.out.print(empDTO1.getEmpno()+"\t");
					System.out.print(empDTO1.getEname()+"\t");
					System.out.print(empDTO1.getJob()+"\t");
					System.out.print(empDTO1.getHiredate()+"\n");
				}
				break;
			case 6:
				flag = false;
				break;

			default:System.out.println("메뉴 번호 확인");
			
				break;
			}
		}
		
		
		
		
		
		
	}

}
