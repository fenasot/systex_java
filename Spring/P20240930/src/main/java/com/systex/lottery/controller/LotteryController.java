package com.systex.lottery.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.systex.lottery.exception.InputParameterException;
import com.systex.lottery.service.LotteryService;

@Controller
@RequestMapping("/lottery")
public class LotteryController {

	@GetMapping("/lottery")
//	@GetMapping
	public String getLottery(Model model) {
		return "lottery/lottery";
	}
	@PostMapping("/lottery")
//	@PostMapping
	public String postlottery(@RequestParam String numbers, @RequestParam(defaultValue = "2") String times, Model model) {
		model.addAttribute("numbers", numbers);
		model.addAttribute("times", times);
		
		try {
			LotteryService a = new LotteryService(numbers);
			ArrayList<int[]> result = a.writeBingo(times);
			model.addAttribute("result", result);
		} catch (InputParameterException e) {
			model.addAttribute("errorMsg", e);
			return "lottery/lottery";
		}
		
		return "lottery/lotteryResult";
	}
}
