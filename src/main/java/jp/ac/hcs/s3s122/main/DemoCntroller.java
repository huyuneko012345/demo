package jp.ac.hcs.s3s122.main;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.ac.hcs.s3s122.course.CourseData;
import jp.ac.hcs.s3s122.course.CourseService;

@Controller
public class DemoCntroller {
	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}
	@RequestMapping("/course")
	public String getData(@ModelAttribute @Validated CourseData courseData) {
		System.out.println(courseData.getCouse_class());
		CourseService c=new CourseService();
		c.excute(courseData);
		return getIndex();
	}
}
