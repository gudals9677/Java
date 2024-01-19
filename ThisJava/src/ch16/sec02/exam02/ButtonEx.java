package ch16.sec02.exam02;

public class ButtonEx {
	public static void main(String[] args) {
		
		Button btnOk = new Button();
		
		btnOk.setClickListener(() -> System.out.println("OK 버튼을 클릭했습니다."));
	
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(() -> System.out.println("Cancle 버튼을 클릭"));
		
		btnCancel.click();
		
	}
}