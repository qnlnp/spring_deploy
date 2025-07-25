package kr.co.sist.img;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImgController {

	@GetMapping("/img/img_view")
	public String img(Model model) {

		model.addAttribute("default_img", "default_img.jpg");// 바로 쓰는 경우
		ImgDTO iDTO = new ImgDTO();
		iDTO.setImg("default_img2.png");
		iDTO.setTitle("기본 댕댕이 이미지");

		model.addAttribute("iDTO", iDTO);

		return "img/img_view";
	}// img

}// class
