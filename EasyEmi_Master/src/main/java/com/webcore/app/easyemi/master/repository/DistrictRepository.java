package com.webcore.app.easyemi.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.master.dto.DistStateCountry;
import com.webcore.app.easyemi.master.dto.DistrictListDto;
import com.webcore.app.easyemi.master.model.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer>{
	
	@Query("select new com.webcore.app.easyemi.master.dto.DistrictListDto(dist.districtId, dist.districtName) from District dist")
	public List<DistrictListDto> getDistrictList();
	
	@Query("Select new com.webcore.app.easyemi.master.dto.DistStateCountry(dist.districtName, s.stateName, c.countryName)"
			+ " from District dist INNER JOIN dist.state s INNER JOIN s.country c where dist.districtId= ?1")
	public DistStateCountry getDistStateCountry(int districtId);	

}
