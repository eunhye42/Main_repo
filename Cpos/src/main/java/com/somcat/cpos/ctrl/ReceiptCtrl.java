package com.somcat.cpos.ctrl;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.somcat.cpos.domain.ReceiptVO;
import com.somcat.cpos.service.ReceiptServiceIntf;

@Controller
@RequestMapping("/receipt/*")
public class ReceiptCtrl {
	private static Logger log = LoggerFactory.getLogger(ReceiptCtrl.class);
	
	@Inject
	ReceiptServiceIntf rsv;
	
	@GetMapping("/soldlist")
	public void getReceiptList(ReceiptVO rvo, Model model) {
		List<ReceiptVO> list = rsv.selectReceiptList(rvo);
		model.addAttribute("list", list);
	}
	
	@GetMapping(value = "/soldlist/{rno}")
	public ReceiptVO getReceiptDetail(@PathVariable("rno")int rno) {
		ReceiptVO rvo = rsv.selectReceiptDetail(rno);
		return rvo;
	}
}
