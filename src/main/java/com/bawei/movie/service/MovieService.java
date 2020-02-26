package com.bawei.movie.service;

import java.util.List;

import com.bawei.movie.domain.Movie;
import com.bawei.movie.vo.MovieVo;

public interface MovieService {

	List<Movie> selects(MovieVo movieVo);
 
}
