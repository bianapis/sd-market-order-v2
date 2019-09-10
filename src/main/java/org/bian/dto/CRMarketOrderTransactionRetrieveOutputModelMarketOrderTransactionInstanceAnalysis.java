package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceAnalysis
 */
public class CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceAnalysis   {
  private String marketOrderTransactionInstanceAnalysisData = null;

  private String marketOrderTransactionInstanceAnalysisReportType = null;

  private Object marketOrderTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return marketOrderTransactionInstanceAnalysisData
  **/

  public String getMarketOrderTransactionInstanceAnalysisData() {
    return marketOrderTransactionInstanceAnalysisData;
  }

  public void setMarketOrderTransactionInstanceAnalysisData(String marketOrderTransactionInstanceAnalysisData) {
    this.marketOrderTransactionInstanceAnalysisData = marketOrderTransactionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return marketOrderTransactionInstanceAnalysisReportType
  **/

  public String getMarketOrderTransactionInstanceAnalysisReportType() {
    return marketOrderTransactionInstanceAnalysisReportType;
  }

  public void setMarketOrderTransactionInstanceAnalysisReportType(String marketOrderTransactionInstanceAnalysisReportType) {
    this.marketOrderTransactionInstanceAnalysisReportType = marketOrderTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return marketOrderTransactionInstanceAnalysisReport
  **/

  public Object getMarketOrderTransactionInstanceAnalysisReport() {
    return marketOrderTransactionInstanceAnalysisReport;
  }

  public void setMarketOrderTransactionInstanceAnalysisReport(Object marketOrderTransactionInstanceAnalysisReport) {
    this.marketOrderTransactionInstanceAnalysisReport = marketOrderTransactionInstanceAnalysisReport;
  }


}

