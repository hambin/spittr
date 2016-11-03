package com.spittr.data;

import java.util.List;

import org.springframework.context.annotation.Bean;

import com.spittr.Spittle;

public interface SpittleRepository {
	
	List<Spittle> findSpittles(long max, int count);
}
