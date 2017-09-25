package org.demo.mavenapp.mapper;

import org.demo.mavenapp.model.domain.City;
import org.demo.mavenapp.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper extends BaseMapper<City> {
}