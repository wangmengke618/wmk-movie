package com.bawei.movie.dao;

import java.util.List;

import com.bawei.movie.domain.Movie;
import com.bawei.movie.vo.MovieVo;

public interface MovieMapper {

	List<Movie> selects(MovieVo movieVo);

	
}
