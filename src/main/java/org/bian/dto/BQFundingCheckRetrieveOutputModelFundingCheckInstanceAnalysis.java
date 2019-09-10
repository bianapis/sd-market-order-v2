package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFundingCheckRetrieveOutputModelFundingCheckInstanceAnalysis
 */
public class BQFundingCheckRetrieveOutputModelFundingCheckInstanceAnalysis   {
  private Object fundingCheckInstanceAnalysisRecord = null;

  private String fundingCheckInstanceAnalysisReportType = null;

  private String fundingCheckInstanceAnalysisParameters = null;

  private Object fundingCheckInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fundingCheckInstanceAnalysisRecord
  **/

  public Object getFundingCheckInstanceAnalysisRecord() {
    return fundingCheckInstanceAnalysisRecord;
  }

  public void setFundingCheckInstanceAnalysisRecord(Object fundingCheckInstanceAnalysisRecord) {
    this.fundingCheckInstanceAnalysisRecord = fundingCheckInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fundingCheckInstanceAnalysisReportType
  **/

  public String getFundingCheckInstanceAnalysisReportType() {
    return fundingCheckInstanceAnalysisReportType;
  }

  public void setFundingCheckInstanceAnalysisReportType(String fundingCheckInstanceAnalysisReportType) {
    this.fundingCheckInstanceAnalysisReportType = fundingCheckInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fundingCheckInstanceAnalysisParameters
  **/

  public String getFundingCheckInstanceAnalysisParameters() {
    return fundingCheckInstanceAnalysisParameters;
  }

  public void setFundingCheckInstanceAnalysisParameters(String fundingCheckInstanceAnalysisParameters) {
    this.fundingCheckInstanceAnalysisParameters = fundingCheckInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fundingCheckInstanceAnalysisReport
  **/

  public Object getFundingCheckInstanceAnalysisReport() {
    return fundingCheckInstanceAnalysisReport;
  }

  public void setFundingCheckInstanceAnalysisReport(Object fundingCheckInstanceAnalysisReport) {
    this.fundingCheckInstanceAnalysisReport = fundingCheckInstanceAnalysisReport;
  }


}

