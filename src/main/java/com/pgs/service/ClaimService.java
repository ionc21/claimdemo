package com.pgs.service;

import com.pgs.model.ClaimInput;
import com.pgs.model.ClaimOutput;
import com.pgs.model.ClaimStatus;

public interface ClaimService {
	
	public ClaimOutput apply(ClaimInput claimInput);
	public ClaimStatus cancel(String claimNo);

}
