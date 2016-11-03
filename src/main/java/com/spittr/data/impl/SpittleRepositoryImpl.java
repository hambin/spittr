package com.spittr.data.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.spittr.Spittle;
import com.spittr.data.SpittleRepository;

@Service
public class SpittleRepositoryImpl implements SpittleRepository{

	List<Spittle> spittles = new ArrayList<Spittle>();
	public List<Spittle> findSpittles(long max, int count) {
		// TODO Auto-generated method stub
		return createSpittleList(count);
	}
	
	private List<Spittle> createSpittleList(int count){
		for(int i=0; i<count; i++){
			spittles.add(new Spittle("Spittle" + i, new Date()));
		}
		return spittles;
	}

}
