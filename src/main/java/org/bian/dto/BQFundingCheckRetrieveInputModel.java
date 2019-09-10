package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFundingCheckRetrieveInputModelFundingCheckInstanceAnalysis;
import org.bian.dto.BQFundingCheckRetrieveInputModelFundingCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFundingCheckRetrieveInputModel
 */
public class BQFundingCheckRetrieveInputModel   {
  private Object fundingCheckRetrieveActionTaskRecord = null;

  private String fundingCheckRetrieveActionRequest = null;

  private BQFundingCheckRetrieveInputModelFundingCheckInstanceReport fundingCheckInstanceReport = null;

  private BQFundingCheckRetrieveInputModelFundingCheckInstanceAnalysis fundingCheckInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fundingCheckRetrieveActionRequest
  **/

  public String getFundingCheckRetrieveActionRequest() {
    return fundingCheckRetrieveActionRequest;
  }

  public void setFundingCheckRetrieveActionRequest(String fundingCheckRetrieveActionRequest) {
    this.fundingCheckRetrieveActionRequest = fundingCheckRetrieveActionRequest;
  }


  /**
   * Get fundingCheckInstanceReport
   * @return fundingCheckInstanceReport
  **/

  public BQFundingCheckRetrieveInputModelFundingCheckInstanceReport getFundingCheckInstanceReport() {
    return fundingCheckInstanceReport;
  }

  public void setFundingCheckInstanceReport(BQFundingCheckRetrieveInputModelFundingCheckInstanceReport fundingCheckInstanceReport) {
    this.fundingCheckInstanceReport = fundingCheckInstanceReport;
  }


  /**
   * Get fundingCheckInstanceAnalysis
   * @return fundingCheckInstanceAnalysis
  **/

  public BQFundingCheckRetrieveInputModelFundingCheckInstanceAnalysis getFundingCheckInstanceAnalysis() {
    return fundingCheckInstanceAnalysis;
  }

  public void setFundingCheckInstanceAnalysis(BQFundingCheckRetrieveInputModelFundingCheckInstanceAnalysis fundingCheckInstanceAnalysis) {
    this.fundingCheckInstanceAnalysis = fundingCheckInstanceAnalysis;
  }


}

