package org.demo.mavenapp.service.impl;

import org.demo.mavenapp.model.domain.City;
import org.demo.mavenapp.service.CityService;
import org.springframework.stereotype.Service;

@Service("cityService")
public class CityServiceImpl extends BaseServiceImpl<City, Integer> implements CityService {
}