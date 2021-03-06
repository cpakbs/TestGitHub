package net.question.chat.c;


/*
 	ActionForward클래스는 Action인터페이스를 구현한 객체에서 명령을 수행하고
 	결과값을 가지고 페이지를 포워딩(재요청)할때 사용되는 클래스임
 	
 	하는일 1. 페이지 이동방식 여부값을 저장한 후 반환해주는 역활
 			페이지 이동방식 여부값 true일때 -> 리다이렉트 방식 : response.sendRedirect();
 			페이지 이동박식 여부값이 false일때 -> 디스패치 방식 : forward(request,response);
 	
 	하는일 2. 이동할 페이지 경로 주소값을 변수에 저장하여 반환해주는 역활.
 */
public class ActionForward {
	//페이지 이동방식 여부값을 저장할 변수
	private boolean isRedirect=false; //true 또는 false가 저장됨
	
	//이동할 뷰페이지 경로 주소값을 저장할 변수
	private String path = null;
	
	
	
	//페이지 이동방식 여부값을 저장할 메소드
	public void setRedirect(boolean isRedirect) {
		this.isRedirect=isRedirect;
	}
	//페이지 이동방식 여부값을 반환(리턴) 하는 메소드
	public boolean isRedirect() {
		return isRedirect;
	}
	
	//이동할 뷰페이지의 경로 주소값을 저장할 메소드
	public void setPath(String path) {
		this.path=path;
	}
	//이동할 뷰페이지의 경로 주소값(path변수의값)을 반환(리턴) 하는 메소드
	public String getPath() {
		return path;
		
	}
}
