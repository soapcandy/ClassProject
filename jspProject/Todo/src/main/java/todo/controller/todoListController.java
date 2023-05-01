package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class todoListController extends HttpServlet{


	
	// 화면에 리스트 출력: get 방식 요청
	// 브라우저의 url창에 입력해서 요청 -> get
	
	// doGet() 메소드를 오버라이딩
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TodoListController... doGer()...");
		
		// 1. 사용자 요청의 분석
		// 2. Service에 요청 -> 응답 데이터 반환
		// 3. 응답데이터 request의 속성에 저장: view로 데이터 전달
		// 4. view 지정 -> forward
		
		String viewPath = "/WEB-INF/views/todo/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
	}

}
