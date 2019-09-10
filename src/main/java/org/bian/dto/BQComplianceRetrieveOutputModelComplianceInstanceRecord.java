package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceRetrieveOutputModelComplianceInstanceRecord
 */
public class BQComplianceRetrieveOutputModelComplianceInstanceRecord   {
  private String marketOrderTransactionComplianceCheckType = null;

  private String marketOrderTransactionComplianceCheckResult = null;

  private String marketOrderTransactionComplianceTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of compliance check performed (e.g. AML, Watch lists) 
   * @return marketOrderTransactionComplianceCheckType
  **/

  public String getMarketOrderTransactionComplianceCheckType() {
    return marketOrderTransactionComplianceCheckType;
  }

  public void setMarketOrderTransactionComplianceCheckType(String marketOrderTransactionComplianceCheckType) {
    this.marketOrderTransactionComplianceCheckType = marketOrderTransactionComplianceCheckType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the compliance check 
   * @return marketOrderTransactionComplianceCheckResult
  **/

  public String getMarketOrderTransactionComplianceCheckResult() {
    return marketOrderTransactionComplianceCheckResult;
  }

  public void setMarketOrderTransactionComplianceCheckResult(String marketOrderTransactionComplianceCheckResult) {
    this.marketOrderTransactionComplianceCheckResult = marketOrderTransactionComplianceCheckResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the overall compliance checking process 
   * @return marketOrderTransactionComplianceTaskResult
  **/

  public String getMarketOrderTransactionComplianceTaskResult() {
    return marketOrderTransactionComplianceTaskResult;
  }

  public void setMarketOrderTransactionComplianceTaskResult(String marketOrderTransactionComplianceTaskResult) {
    this.marketOrderTransactionComplianceTaskResult = marketOrderTransactionComplianceTaskResult;
  }


}

