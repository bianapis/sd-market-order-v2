package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceReport
 */
public class BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceReport   {
  private String customerProcessingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerProcessingInstanceReportReference
  **/

  public String getCustomerProcessingInstanceReportReference() {
    return customerProcessingInstanceReportReference;
  }

  public void setCustomerProcessingInstanceReportReference(String customerProcessingInstanceReportReference) {
    this.customerProcessingInstanceReportReference = customerProcessingInstanceReportReference;
  }


}

