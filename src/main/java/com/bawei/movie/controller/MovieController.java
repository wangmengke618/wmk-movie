package com.bawei.movie.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.movie.domain.Movie;
import com.bawei.movie.service.MovieService;
import com.bawei.movie.vo.MovieVo;

@Controller
public class MovieController {

	@Resource
	private MovieService  movieService;
	
	@RequestMapping("/list")
	public String list(MovieVo movieVo,Model model) {
		List<Movie> movies=movieService.selects(movieVo);
		model.addAttribute("movies", movies);
		return "list";
		
	}
}
