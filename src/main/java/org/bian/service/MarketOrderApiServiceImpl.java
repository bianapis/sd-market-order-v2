/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MarketOrderApiServiceImpl implements MarketOrderApiService {

	public SDMarketOrderActivateOutputModel activate(SDMarketOrderActivateInputModel request){
		return JsonReader.read("activate-SDMarketOrderActivateOutputModel.json",new TypeReference<SDMarketOrderActivateOutputModel>(){});
	}
	
	public SDMarketOrderConfigureOutputModel configure(String sdReferenceId, SDMarketOrderConfigureInputModel request){
		return JsonReader.read("configure-SDMarketOrderConfigureOutputModel.json",new TypeReference<SDMarketOrderConfigureOutputModel>(){});
	}
	
	public BQTradeInitiationExchangeOutputModel exchangeTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationExchangeInputModel request){
		return JsonReader.read("exchange-BQTradeInitiationExchangeOutputModel.json",new TypeReference<BQTradeInitiationExchangeOutputModel>(){});
	}
	
	public SDMarketOrderFeedbackOutputModel feedback(String sdReferenceId, SDMarketOrderFeedbackInputModel request){
		return JsonReader.read("feedback-SDMarketOrderFeedbackOutputModel.json",new TypeReference<SDMarketOrderFeedbackOutputModel>(){});
	}
	
	public CRMarketOrderTransactionInitiateOutputModel initiate(String sdReferenceId, CRMarketOrderTransactionInitiateInputModel request){
		return JsonReader.read("initiate-CRMarketOrderTransactionInitiateOutputModel.json",new TypeReference<CRMarketOrderTransactionInitiateOutputModel>(){});
	}
	
	public CRMarketOrderTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRMarketOrderTransactionRetrieveOutputModel.json",new TypeReference<CRMarketOrderTransactionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQComplianceRetrieveOutputModel retrieveCompliance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQComplianceRetrieveOutputModel.json",new TypeReference<BQComplianceRetrieveOutputModel>(){});
	}
	
	public BQCustomerProcessingRetrieveOutputModel retrieveCustomerprocessing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCustomerProcessingRetrieveOutputModel.json",new TypeReference<BQCustomerProcessingRetrieveOutputModel>(){});
	}
	
	public BQFundingCheckRetrieveOutputModel retrieveFundingcheck(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFundingCheckRetrieveOutputModel.json",new TypeReference<BQFundingCheckRetrieveOutputModel>(){});
	}
	
	public BQTradeInitiationRetrieveOutputModel retrieveTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTradeInitiationRetrieveOutputModel.json",new TypeReference<BQTradeInitiationRetrieveOutputModel>(){});
	}
	
	public SDMarketOrderRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDMarketOrderRetrieveOutputModel.json",new TypeReference<SDMarketOrderRetrieveOutputModel>(){});
	}
	
	public CRMarketOrderTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRMarketOrderTransactionUpdateInputModel request){
		return JsonReader.read("update-CRMarketOrderTransactionUpdateOutputModel.json",new TypeReference<CRMarketOrderTransactionUpdateOutputModel>(){});
	}
	
}
