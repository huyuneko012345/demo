package jp.ac.hcs.s3s122.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
@Transactional
public class CourseService {


	
@Autowired
private RestTemplate restTemplate;
private static final String URL="http://localhost:9000/api?sex_class={sex_class}&couse_class={couse_class}&"
		+ "deviation={deviation}&java={java}&algo={algo}&oop1={oop1}";
String a ="http://zipcloud.ibsnet.co.jp/api/search?zipcode={zipcode}";
public void excute(CourseData courseData) {
	System.out.println(courseData.getSex_class()+courseData.getCouse_class()+ courseData.getDeviation()+ courseData.getJava()+courseData.getAlgo()+courseData.getOop1());
	String json =request(courseData);
	System.out.println(json);
	
}

public String request(CourseData courseData) {
	String json=restTemplate.getForObject(URL, String.class, courseData.getSex_class(), courseData.getCouse_class(), courseData.getDeviation(), courseData.getJava(),courseData.getAlgo(),courseData.getOop1());
	System.out.println(0);
	return json;
	
}

}
