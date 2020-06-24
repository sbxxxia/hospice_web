package com.sbxxxia.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbxxxia.web.domains.FacilityDTO;

@Repository
public interface FacilityMapper {
	public void insertFacility(FacilityDTO facility);
	public void updateFacility(FacilityDTO facility);
	public void deleteFacility(FacilityDTO facility);
	public int count();
	public List<FacilityDTO> selectFacilities();
	public FacilityDTO selectFacility(String facilitySeq);
}
