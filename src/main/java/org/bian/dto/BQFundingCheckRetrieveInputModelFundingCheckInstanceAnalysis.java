package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFundingCheckRetrieveInputModelFundingCheckInstanceAnalysis
 */
public class BQFundingCheckRetrieveInputModelFundingCheckInstanceAnalysis   {
  private String fundingCheckInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fundingCheckInstanceAnalysisReference
  **/

  public String getFundingCheckInstanceAnalysisReference() {
    return fundingCheckInstanceAnalysisReference;
  }

  public void setFundingCheckInstanceAnalysisReference(String fundingCheckInstanceAnalysisReference) {
    this.fundingCheckInstanceAnalysisReference = fundingCheckInstanceAnalysisReference;
  }


}

