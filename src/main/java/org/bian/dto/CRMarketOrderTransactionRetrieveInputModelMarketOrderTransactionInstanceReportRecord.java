package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceReportRecord
 */
public class CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceReportRecord   {
  private String marketOrderTransactionInstanceReportReference = null;

  private String marketOrderTransactionInstanceReportType = null;

  private String marketOrderTransactionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return marketOrderTransactionInstanceReportReference
  **/

  public String getMarketOrderTransactionInstanceReportReference() {
    return marketOrderTransactionInstanceReportReference;
  }

  public void setMarketOrderTransactionInstanceReportReference(String marketOrderTransactionInstanceReportReference) {
    this.marketOrderTransactionInstanceReportReference = marketOrderTransactionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return marketOrderTransactionInstanceReportType
  **/

  public String getMarketOrderTransactionInstanceReportType() {
    return marketOrderTransactionInstanceReportType;
  }

  public void setMarketOrderTransactionInstanceReportType(String marketOrderTransactionInstanceReportType) {
    this.marketOrderTransactionInstanceReportType = marketOrderTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return marketOrderTransactionInstanceReportParameters
  **/

  public String getMarketOrderTransactionInstanceReportParameters() {
    return marketOrderTransactionInstanceReportParameters;
  }

  public void setMarketOrderTransactionInstanceReportParameters(String marketOrderTransactionInstanceReportParameters) {
    this.marketOrderTransactionInstanceReportParameters = marketOrderTransactionInstanceReportParameters;
  }


}

