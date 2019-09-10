package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFundingCheckRetrieveOutputModelFundingCheckInstanceReport
 */
public class BQFundingCheckRetrieveOutputModelFundingCheckInstanceReport   {
  private Object fundingCheckInstanceReportRecord = null;

  private String fundingCheckInstanceReportType = null;

  private String fundingCheckInstanceReportParameters = null;

  private Object fundingCheckInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fundingCheckInstanceReportRecord
  **/

  public Object getFundingCheckInstanceReportRecord() {
    return fundingCheckInstanceReportRecord;
  }

  public void setFundingCheckInstanceReportRecord(Object fundingCheckInstanceReportRecord) {
    this.fundingCheckInstanceReportRecord = fundingCheckInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fundingCheckInstanceReportType
  **/

  public String getFundingCheckInstanceReportType() {
    return fundingCheckInstanceReportType;
  }

  public void setFundingCheckInstanceReportType(String fundingCheckInstanceReportType) {
    this.fundingCheckInstanceReportType = fundingCheckInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fundingCheckInstanceReportParameters
  **/

  public String getFundingCheckInstanceReportParameters() {
    return fundingCheckInstanceReportParameters;
  }

  public void setFundingCheckInstanceReportParameters(String fundingCheckInstanceReportParameters) {
    this.fundingCheckInstanceReportParameters = fundingCheckInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fundingCheckInstanceReport
  **/

  public Object getFundingCheckInstanceReport() {
    return fundingCheckInstanceReport;
  }

  public void setFundingCheckInstanceReport(Object fundingCheckInstanceReport) {
    this.fundingCheckInstanceReport = fundingCheckInstanceReport;
  }


}

