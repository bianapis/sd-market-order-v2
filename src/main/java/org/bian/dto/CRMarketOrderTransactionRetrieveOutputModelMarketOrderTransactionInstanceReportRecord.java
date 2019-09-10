package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceReportRecord
 */
public class CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceReportRecord   {
  private String marketOrderTransactionInstanceReportData = null;

  private String marketOrderTransactionInstanceReportType = null;

  private Object marketOrderTransactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return marketOrderTransactionInstanceReportData
  **/

  public String getMarketOrderTransactionInstanceReportData() {
    return marketOrderTransactionInstanceReportData;
  }

  public void setMarketOrderTransactionInstanceReportData(String marketOrderTransactionInstanceReportData) {
    this.marketOrderTransactionInstanceReportData = marketOrderTransactionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return marketOrderTransactionInstanceReport
  **/

  public Object getMarketOrderTransactionInstanceReport() {
    return marketOrderTransactionInstanceReport;
  }

  public void setMarketOrderTransactionInstanceReport(Object marketOrderTransactionInstanceReport) {
    this.marketOrderTransactionInstanceReport = marketOrderTransactionInstanceReport;
  }


}

