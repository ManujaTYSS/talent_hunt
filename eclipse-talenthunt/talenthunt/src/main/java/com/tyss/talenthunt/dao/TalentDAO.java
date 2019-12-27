package com.tyss.talenthunt.dao;

import java.util.List;

import com.tyss.talenthunt.dto.RequirmentBean;
import com.tyss.talenthunt.dto.CandidateCreationBean;
import com.tyss.talenthunt.dto.ScheduleInterviewBean;

public interface TalentDAO {
	public RequirmentBean addrequirement(RequirmentBean reqinfo);

	public boolean updateRequirment(RequirmentBean reqinfo);
	
	public List<RequirmentBean> getAllRequirements();
	
	public CandidateCreationBean addCandidate(CandidateCreationBean candidateInfo);
	
	public List<CandidateCreationBean> getCandidate();
	
	public ScheduleInterviewBean addInterview(ScheduleInterviewBean interview);
	
	public List<ScheduleInterviewBean> getAllInterview();
}
