package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceAnalysis
 */
public class BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceAnalysis   {
  private String customerProcessingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerProcessingInstanceAnalysisReference
  **/

  public String getCustomerProcessingInstanceAnalysisReference() {
    return customerProcessingInstanceAnalysisReference;
  }

  public void setCustomerProcessingInstanceAnalysisReference(String customerProcessingInstanceAnalysisReference) {
    this.customerProcessingInstanceAnalysisReference = customerProcessingInstanceAnalysisReference;
  }


}

