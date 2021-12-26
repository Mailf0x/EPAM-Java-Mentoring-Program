package com.epam.mybatis.mapper;

import com.epam.mybatis.model.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {

    @Select("SELECT * FROM world.city")
    List<City> selectAll();
}
