package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceRecord
 */
public class BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceRecord   {
  private String marketOrderCustomerProcessingCheckResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of any customer specific processing requirements applied to the market order 
   * @return marketOrderCustomerProcessingCheckResult
  **/

  public String getMarketOrderCustomerProcessingCheckResult() {
    return marketOrderCustomerProcessingCheckResult;
  }

  public void setMarketOrderCustomerProcessingCheckResult(String marketOrderCustomerProcessingCheckResult) {
    this.marketOrderCustomerProcessingCheckResult = marketOrderCustomerProcessingCheckResult;
  }


}

