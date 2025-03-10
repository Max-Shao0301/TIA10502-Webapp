package com.apply.model;

import java.sql.Timestamp;
import java.util.List;

public class ApplyService {
	private ApplyDAO_interface dao;

	public ApplyService() {
		dao = new ApplyJDBCDAO();
	}
	
	public ApplyVO addApply(String email, String name, String phone, Integer gender,
			byte[] licencePhoto, String plateNumber, String introduction, Integer results,
			 Timestamp submissionDate, Timestamp reviewDate) {
		ApplyVO applyVO = new ApplyVO();
		applyVO.setEmail(email);
		applyVO.setName(name);
		applyVO.setPhone(phone);
		applyVO.setGender(gender);
		applyVO.setLicencePhoto(licencePhoto);
		applyVO.setPlateNumber(plateNumber);
		applyVO.setIntroduction(introduction);
		applyVO.setResults(results);
		applyVO.setSubmissionDate(submissionDate);
		applyVO.setReviewDate(reviewDate);
		dao.insert(applyVO);
		
		return applyVO;
		
		
	}
	public ApplyVO updateApply(Integer applyId, Integer results) {
		ApplyVO applyVO = new ApplyVO();
		applyVO.setApplyId(applyId);
		applyVO.setResults(results);
		dao.update(applyVO);
		
		return applyVO;
		
	}
	
	public void deleteApply(Integer applyId) {
		dao.delete(applyId);
	}
	
	public ApplyVO getOneApply(Integer applyId) {
		return dao.findByPrimaryKey(applyId);
	}
	public List<ApplyVO> getAll(){
		return dao.getAll();
	}
	
	
	
	
}
