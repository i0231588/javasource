package database2;

//클래스간 데이터 전달을 위해 사용하는 객체
//~~DTO, ~~VO

//db데이터 내용을 전송하는 용도로 주로 사용
//table 컬럼과 동일하게 작성

public class DeptDTO {
	
	private int deptno;
	private String dname;
	private String loc;
	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}
