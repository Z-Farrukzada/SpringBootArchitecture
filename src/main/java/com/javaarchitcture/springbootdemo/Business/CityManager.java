package com.javaarchitcture.springbootdemo.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaarchitcture.springbootdemo.DataAccess.ICityDal;
import com.javaarchitcture.springbootdemo.Entities.City;


@Service
public class CityManager implements ICityService{

	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		return this.cityDal.getAll();
	}

	@Override
	public void add(City city) {
		this.cityDal.add(city);
		
	}

	@Override
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	public void delete(City city) {
		this.cityDal.delete(city);
		
	}
	@Override
	public City getById(int id) {
		return this.cityDal.getById(id);
	}

	
}
