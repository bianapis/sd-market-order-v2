/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MarketOrderApiService {

	SDMarketOrderActivateOutputModel activate(SDMarketOrderActivateInputModel request);
	
	SDMarketOrderConfigureOutputModel configure(String sdReferenceId, SDMarketOrderConfigureInputModel request);
	
	BQTradeInitiationExchangeOutputModel exchangeTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationExchangeInputModel request);
	
	SDMarketOrderFeedbackOutputModel feedback(String sdReferenceId, SDMarketOrderFeedbackInputModel request);
	
	CRMarketOrderTransactionInitiateOutputModel initiate(String sdReferenceId, CRMarketOrderTransactionInitiateInputModel request);
	
	CRMarketOrderTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQComplianceRetrieveOutputModel retrieveCompliance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCustomerProcessingRetrieveOutputModel retrieveCustomerprocessing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFundingCheckRetrieveOutputModel retrieveFundingcheck(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTradeInitiationRetrieveOutputModel retrieveTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDMarketOrderRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRMarketOrderTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRMarketOrderTransactionUpdateInputModel request);
	
}
