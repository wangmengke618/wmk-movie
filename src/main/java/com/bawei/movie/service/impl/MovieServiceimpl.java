package com.bawei.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.movie.dao.MovieMapper;
import com.bawei.movie.domain.Movie;
import com.bawei.movie.service.MovieService;
import com.bawei.movie.vo.MovieVo;

@Service
public class MovieServiceimpl implements MovieService{

	@Resource
	  private MovieMapper movieMapper;
	 
	@Override
	public List<Movie> selects(MovieVo movieVo) {
		
		return movieMapper.selects(movieVo);
	}


}
