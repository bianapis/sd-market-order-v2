package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFundingCheckRetrieveInputModelFundingCheckInstanceReport
 */
public class BQFundingCheckRetrieveInputModelFundingCheckInstanceReport   {
  private String fundingCheckInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fundingCheckInstanceReportReference
  **/

  public String getFundingCheckInstanceReportReference() {
    return fundingCheckInstanceReportReference;
  }

  public void setFundingCheckInstanceReportReference(String fundingCheckInstanceReportReference) {
    this.fundingCheckInstanceReportReference = fundingCheckInstanceReportReference;
  }


}

