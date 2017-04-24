package kr.co.jhta.controller.timechart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.jhta.service.timechart.TimeChartService;
import kr.co.jhta.vo.TimeChart;
import kr.co.jhta.vo.stu.Student;

@Controller
public class TimeChartController {
	
	@Autowired
	private TimeChartService timeChartService;
	
	// 학생 시간표
	@RequestMapping(value="/stud/studenttimechart", method=RequestMethod.GET)
	public String getAllTimeSubject(Student student, Model model) {
		
		List<TimeChart> timeChartList = timeChartService.getEnroll(student.getNo());
		model.addAttribute("timeChartList", timeChartList);
		
		return "/timechart/studenttimechart";
	}
}
