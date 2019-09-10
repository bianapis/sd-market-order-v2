package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFundingCheckRetrieveOutputModelFundingCheckInstanceAnalysis;
import org.bian.dto.BQFundingCheckRetrieveOutputModelFundingCheckInstanceRecord;
import org.bian.dto.BQFundingCheckRetrieveOutputModelFundingCheckInstanceReport;
import org.bian.dto.BQFundingCheckRetrieveOutputModelMarketOrderTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFundingCheckRetrieveOutputModel
 */
public class BQFundingCheckRetrieveOutputModel   {
  private BQFundingCheckRetrieveOutputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord = null;

  private BQFundingCheckRetrieveOutputModelFundingCheckInstanceRecord fundingCheckInstanceRecord = null;

  private String fundingCheckRetrieveActionTaskReference = null;

  private Object fundingCheckRetrieveActionTaskRecord = null;

  private String fundingCheckRetrieveActionResponse = null;

  private BQFundingCheckRetrieveOutputModelFundingCheckInstanceReport fundingCheckInstanceReport = null;

  private BQFundingCheckRetrieveOutputModelFundingCheckInstanceAnalysis fundingCheckInstanceAnalysis = null;


  /**
   * Get marketOrderTransactionInstanceRecord
   * @return marketOrderTransactionInstanceRecord
  **/

  public BQFundingCheckRetrieveOutputModelMarketOrderTransactionInstanceRecord getMarketOrderTransactionInstanceRecord() {
    return marketOrderTransactionInstanceRecord;
  }

  public void setMarketOrderTransactionInstanceRecord(BQFundingCheckRetrieveOutputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord) {
    this.marketOrderTransactionInstanceRecord = marketOrderTransactionInstanceRecord;
  }


  /**
   * Get fundingCheckInstanceRecord
   * @return fundingCheckInstanceRecord
  **/

  public BQFundingCheckRetrieveOutputModelFundingCheckInstanceRecord getFundingCheckInstanceRecord() {
    return fundingCheckInstanceRecord;
  }

  public void setFundingCheckInstanceRecord(BQFundingCheckRetrieveOutputModelFundingCheckInstanceRecord fundingCheckInstanceRecord) {
    this.fundingCheckInstanceRecord = fundingCheckInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Funding Check instance retrieve service call 
   * @return fundingCheckRetrieveActionTaskReference
  **/

  public String getFundingCheckRetrieveActionTaskReference() {
    return fundingCheckRetrieveActionTaskReference;
  }

  public void setFundingCheckRetrieveActionTaskReference(String fundingCheckRetrieveActionTaskReference) {
    this.fundingCheckRetrieveActionTaskReference = fundingCheckRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fundingCheckRetrieveActionTaskRecord
  **/

  public Object getFundingCheckRetrieveActionTaskRecord() {
    return fundingCheckRetrieveActionTaskRecord;
  }

  public void setFundingCheckRetrieveActionTaskRecord(Object fundingCheckRetrieveActionTaskRecord) {
    this.fundingCheckRetrieveActionTaskRecord = fundingCheckRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fundingCheckRetrieveActionResponse
  **/

  public String getFundingCheckRetrieveActionResponse() {
    return fundingCheckRetrieveActionResponse;
  }

  public void setFundingCheckRetrieveActionResponse(String fundingCheckRetrieveActionResponse) {
    this.fundingCheckRetrieveActionResponse = fundingCheckRetrieveActionResponse;
  }


  /**
   * Get fundingCheckInstanceReport
   * @return fundingCheckInstanceReport
  **/

  public BQFundingCheckRetrieveOutputModelFundingCheckInstanceReport getFundingCheckInstanceReport() {
    return fundingCheckInstanceReport;
  }

  public void setFundingCheckInstanceReport(BQFundingCheckRetrieveOutputModelFundingCheckInstanceReport fundingCheckInstanceReport) {
    this.fundingCheckInstanceReport = fundingCheckInstanceReport;
  }


  /**
   * Get fundingCheckInstanceAnalysis
   * @return fundingCheckInstanceAnalysis
  **/

  public BQFundingCheckRetrieveOutputModelFundingCheckInstanceAnalysis getFundingCheckInstanceAnalysis() {
    return fundingCheckInstanceAnalysis;
  }

  public void setFundingCheckInstanceAnalysis(BQFundingCheckRetrieveOutputModelFundingCheckInstanceAnalysis fundingCheckInstanceAnalysis) {
    this.fundingCheckInstanceAnalysis = fundingCheckInstanceAnalysis;
  }


}

