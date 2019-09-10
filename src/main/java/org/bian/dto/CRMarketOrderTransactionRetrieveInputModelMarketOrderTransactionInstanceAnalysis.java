package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceAnalysis
 */
public class CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceAnalysis   {
  private String marketOrderTransactionInstanceAnalysisReference = null;

  private String marketOrderTransactionInstanceAnalysisReportType = null;

  private String marketOrderTransactionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return marketOrderTransactionInstanceAnalysisReference
  **/

  public String getMarketOrderTransactionInstanceAnalysisReference() {
    return marketOrderTransactionInstanceAnalysisReference;
  }

  public void setMarketOrderTransactionInstanceAnalysisReference(String marketOrderTransactionInstanceAnalysisReference) {
    this.marketOrderTransactionInstanceAnalysisReference = marketOrderTransactionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return marketOrderTransactionInstanceAnalysisParameters
  **/

  public String getMarketOrderTransactionInstanceAnalysisParameters() {
    return marketOrderTransactionInstanceAnalysisParameters;
  }

  public void setMarketOrderTransactionInstanceAnalysisParameters(String marketOrderTransactionInstanceAnalysisParameters) {
    this.marketOrderTransactionInstanceAnalysisParameters = marketOrderTransactionInstanceAnalysisParameters;
  }


}

