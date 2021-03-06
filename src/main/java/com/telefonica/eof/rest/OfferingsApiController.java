package com.telefonica.eof.rest;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.time.OffsetDateTime;


import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telefonica.eof.dto.OffersBenefitsRequestDto;
import com.telefonica.eof.generated.model.ResponseType;
import com.telefonica.eof.mapper.ApplicationRequestMapper;
import com.telefonica.eof.service.OfferBenefitsServiceI;

import javax.validation.Valid;

@Api(value = "offerings")
//@RequestMapping(value = "/productCatalog")
@RestController
public class OfferingsApiController {

	@Autowired
	ApplicationRequestMapper appRequest;
	
	@Autowired
	OfferBenefitsServiceI offerBenefitsServiceI;

	@ApiOperation(value = "Retrieve a list of offerings", nickname = "getOfferings", notes = "", response = ResponseType.class, tags = {
			"offerings", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Offerings retrieved successfully", response = ResponseType.class) })
	@GetMapping(value = "/offerings", produces = { "application/json" })
	public ResponseEntity<ResponseType> getOfferings(

			@ApiParam(value = "If this API is used via a platform acting as a common entry point to different OBs, this identifier is used to route the request to the corresponding OB environment") @RequestHeader(value = "UNICA-ServiceId", required = false) String unICAServiceId,
			@ApiParam(value = "Identifier for the system originating the request") @RequestHeader(value = "UNICA-Application", required = false) String unICAApplication,
			@ApiParam(value = "Identificador del usuario del sistema y/o subsistema que inicia la petición") @RequestHeader(value = "UNICA-User", required = false) String unICAUser,
			@ApiParam(value = "Es la fecha y hora al momento de invocar al servicio por el consumidor") @RequestHeader(value = "UNICA-Timestamp", required = false) String unICATimestamp,
			@ApiParam(value = "Including the proof of access (using OAuth2.0 security model) to guarantee that the consumer has privileges to access the entity database") @RequestHeader(value = "Authorization", required = false) String authorization,

			@ApiParam(value = "To obtain the list of offerings matching to a given id in the other side mapping to the offeringId (to synchronize client and server identifiers) ") @Valid @RequestParam(value = "correlationId", required = false) String correlationId,
			@ApiParam(value = "to obtain the list of offerings associated with a given name ") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "to obtain the list of offerings that are either single offering or bundle of a set of single offerings") @Valid @RequestParam(value = "isBundle", required = false) Boolean isBundle,
			@ApiParam(value = "To obtain offerings with a specific status", allowableValues = "draft, active, expired") @Valid @RequestParam(value = "lifeCycleStatus", required = false) String lifeCycleStatus,
			@ApiParam(value = "To obtain the list of offerings belonging to a given category referenced by an id ") @Valid @RequestParam(value = "category.id", required = false) String categoryId,
			@ApiParam(value = "To obtain the list of offerings belonging to a given category referenced by name") @Valid @RequestParam(value = "category.name", required = false) String categoryName,
			@ApiParam(value = "To obtain the list of offerings belonging to a given subcategory (second or greater levelcategory) referenced by an id ") @Valid @RequestParam(value = "subcategory.id", required = false) String subcategoryId,
			@ApiParam(value = "To obtain the list of offerings belonging to a given subcategory (second or greater levelcategory) referenced by name") @Valid @RequestParam(value = "subcategory.name", required = false) String subcategoryName,
			@ApiParam(value = "To obtain the list of offerings belonging to a given channel referenced by id ") @Valid @RequestParam(value = "channel.id", required = false) String channelId,
			@ApiParam(value = "To obtain the list of offerings belonging to a given channel referenced by name") @Valid @RequestParam(value = "channel.name", required = false) String channelName,
			@ApiParam(value = "to obtain the list of offerings that include a given product specification (identified by id) within the list of composing products") @Valid @RequestParam(value = "productSpecification.id", required = false) String productSpecificationId,
			@ApiParam(value = "to obtain the list of offerings that include a given product specification (identified by name) within the list of composing products") @Valid @RequestParam(value = "productSpecification.name", required = false) String productSpecificationName,
			@ApiParam(value = "to obtain the list of offerings that are part of a given framework agreement") @Valid @RequestParam(value = "frameworkAgreeementId", required = false) String frameworkAgreeementId,
			@ApiParam(value = "to obtain the list of offerings that are targeted to an specific customer") @Valid @RequestParam(value = "customerId", required = false) String customerId,
			@ApiParam(value = "to obtain the list of offerings that are targeted to an specific account") @Valid @RequestParam(value = "accountId", required = false) String accountId,
			@ApiParam(value = "to obtain the list of offerings that are targeted to an specific instantiated product in the inventory for an specific product type") @Valid @RequestParam(value = "product.type", required = false) String productType,
			@ApiParam(value = "to obtain the list of offerings that are targeted to an specific instantiated product in the inventory for an specific product identified with the internal id used by the server. This is typically used together with product.type") @Valid @RequestParam(value = "product.id", required = false) String productId,
			@ApiParam(value = "to obtain the list of offerings that are targeted to an specific instantiated product in the inventory for an specific product identified with the public number associated to the product (e.g.: use of an msisdn to refer to a subscription to a mobileline product). This is typically used together with product.type") @Valid @RequestParam(value = "product.publicId", required = false) String productPublicId,
			@ApiParam(value = "To obtain the offerings that can be offered after this value") @Valid @RequestParam(value = "startDate", required = false) OffsetDateTime startDate,
			@ApiParam(value = "To obtain offerings that can be offered before this value") @Valid @RequestParam(value = "endDate", required = false) OffsetDateTime endDate,
			@ApiParam(value = "To limit the amount of results") @Valid @RequestParam(value = "limit", required = false) String limit,
			@ApiParam(value = "To get the results starting from an offset value. Use for pagination") @Valid @RequestParam(value = "offset", required = false) String offset,
			@ApiParam(value = "To retrieve offerings with prices returned in a specific currency") @Valid @RequestParam(value = "productOfferingPrice.price.units", required = false) String productOfferingPricePriceUnits,
			@ApiParam(value = "To retrieve offerings with prices applying the change rate of a specific past date") @Valid @RequestParam(value = "productOfferingPrice.currencyChangeDate", required = false) OffsetDateTime productOfferingPriceCurrencyChangeDate,
			@ApiParam(value = "To retrieve offerings with prices that are valid after this date") @Valid @RequestParam(value = "productOfferingPrice.startPriceDate", required = false) OffsetDateTime productOfferingPriceStartPriceDate,
			@ApiParam(value = "To retrieve offerings with prices that are valid before this date") @Valid @RequestParam(value = "productOfferingPrice.endPriceDate", required = false) OffsetDateTime productOfferingPriceEndPriceDate,
			@ApiParam(value = "To retrieve offerings with prices of the item when bought by a specific consumer e.g.: Buying a VM from Brazil (type=OB) or purchasing a plan by a VIP customer (type=customer)") @Valid @RequestParam(value = "productOfferingPrice.priceConsumer.entityType", required = false) String productOfferingPricePriceConsumerEntityType,
			@ApiParam(value = "To retrieve offerings with prices of the item when bought by a specific consumer e.g.: Buying a VM from Brazil (id=BR) or purchasing a plan by a VIP customer (id=CustomerId).") @Valid @RequestParam(value = "productOfferingPrice.priceConsumer.id", required = false) String productOfferingPricePriceConsumerId,
			@ApiParam(value = "To retrieve offerings with prices of the item in a specific region e.g.: a VM deployed in USA.") @Valid @RequestParam(value = "productOfferingPrice.priceLocation", required = false) String productOfferingPricePriceLocation,
			@ApiParam(value = "Es el precio del rango inicial de la oferta") @Valid @RequestParam(value = "productOfferingPrice.startPriceAmout", required = false) BigDecimal productOfferingPriceStartPriceAmout,
			@ApiParam(value = "Es el precio del rango final de la oferta") @Valid @RequestParam(value = "productOfferingPrice.endPriceAmout", required = false) BigDecimal productOfferingPriceEndPriceAmout,
			@ApiParam(value = "To define the information elements expected in the response") @Valid @RequestParam(value = "fields", required = false) String fields,
			@ApiParam(value = "To filter offers that can be offered to a user with a credit score equal or greater to the one sent in this parameter. Credit Score is a measure of the creditworthiness calculated on the basis of a combination of factors such as their income and credit history.") @Valid @RequestParam(value = "creditScore", required = false) Integer creditScore,
			@ApiParam(value = "To filter offers that can be offered to a user with a credit limit equal or greater to the one sent in this parameter. Credit Limit is the maximum amount of money that may be charged on the customer's accounts and local currency is assumed") @Valid @RequestParam(value = "creditLimit", required = false) BigDecimal creditLimit,
			@ApiParam(value = "To filter offers that can be offered to a user in a certain site or store") @Valid @RequestParam(value = "siteId", required = false) String siteId,
			@ApiParam(value = "To filter offers that can be offered to a user in a site or store in a certain region") @Valid @RequestParam(value = "region", required = false) String region,
			@ApiParam(value = "To filter offers that can be offered to a user in a certain site or store in a state or province") @Valid @RequestParam(value = "stateOrProvince", required = false) String stateOrProvince,
			@ApiParam(value = "To filter offers that can be offered to a certain customer segment") @Valid @RequestParam(value = "customer.segment", required = false) String customerSegment,
			@ApiParam(value = "To filter offers that can be offered to a certain customer segment") @Valid @RequestParam(value = "customer.subsegment", required = false) String customerSubsegment,
			@ApiParam(value = "To filter offers that can be offered only for new customers coming from other operators (in case is set to true) or only for existing customers or fresh new customers (in case it is false)") @Valid @RequestParam(value = "isPortability", required = false) Boolean isPortability,
			@ApiParam(value = "Current plan type of the potential customer in external operator (only when isPortability=true)", allowableValues = "prepaid, postpaid") @Valid @RequestParam(value = "portabilityCurrentPlanType", required = false) String portabilityCurrentPlanType,
			@ApiParam(value = "Date since the potential customer is with his current company. Used to filter offers depending on customer eagerness to churn. Use only when isPortability=true") @Valid @RequestParam(value = "portabilityCustomerSince", required = false) LocalDate portabilityCustomerSince,
			@ApiParam(value = "Current company of the potential customer. Use only when isPortability=true") @Valid @RequestParam(value = "portabilityCurrentCompany", required = false) String portabilityCurrentCompany,
			@ApiParam(value = "Dealer ID, in case this sale is being performed by a third party and not directly by Telef?nica.") @Valid @RequestParam(value = "dealerId", required = false) String dealerId,
			@ApiParam(value = "To query offers that include broadband products with a minimum download rate measured in mbps.") @Valid @RequestParam(value = "broadband.minDlDataRate", required = false) Integer broadbandMinDlDataRate,
			@ApiParam(value = "To query offers that include broadband products with a maximum download rate measured in mbps.") @Valid @RequestParam(value = "broadband.maxDlDataRate", required = false) Integer broadbandMaxDlDataRate,
			@ApiParam(value = "To query offers that include broadband products with a certain connection type.", allowableValues = "fiber, dsl") @Valid @RequestParam(value = "broadband.connection", required = false) String broadbandConnection,
			@ApiParam(value = "To filter offers that can be offered only for customers willing to churn to avoid so (in case is set to true) or for the rest (in case it is false)") @Valid @RequestParam(value = "isRetention", required = false) Boolean isRetention,
			@ApiParam(value = "Campo que permite buscar por id de ofertas. Este campo puede buscar por varias ofertas separadas por comas ','.") @Valid @RequestParam(value = "productOfferingCatalogId", required = false) String productOfferingCatalogId,
			@ApiParam(value = "Current offering Id. This offering is the one the user has currently instantiated and is to be replaced by any of the offerings returned by this operation") @Valid @RequestParam(value = "currentOffering", required = false) String currentOffering,
			@ApiParam(value = "currentOffering must be filled too if this query parameter is used. To filter offers that are more expensive (upsell, isUpgrade=true) or cheaper or the same (downsell, isUpgrade=false) than the customer's current offering") @Valid @RequestParam(value = "isUpgrade", required = false) Boolean isUpgrade,
			@ApiParam(value = "Filters offerings that are suitable to a certain action", allowableValues = "newSubscriber, offeringChange, additionalServices") @Valid @RequestParam(value = "action", required = false) String action,
			@ApiParam(value = "Filters offerings that can be offered in a certain commercial area") @Valid @RequestParam(value = "commercialAreaId", required = false) String commercialAreaId,
			@ApiParam(value = "Es el id de la orden") @Valid @RequestParam(value = "productOrder.id", required = false) String productOrderId,
			@ApiParam(value = "Es le id del plan") @Valid @RequestParam(value = "plan.id", required = false) String planId,
			@ApiParam(value = "Es el tipo de plan del producto") @Valid @RequestParam(value = "plan.type", required = false) String planType,
			@ApiParam(value = "Tipo de fuente, puede ser OFERTA, DISPOSITIVO") @Valid @RequestParam(value = "sourceType", required = false) String sourceType,
			@ApiParam(value = "Información para el serviceability") @Valid @RequestParam(value = "networkTechnology", required = false) String networkTechnology,
			@ApiParam(value = "Información para el serviceability") @Valid @RequestParam(value = "serviceability.maxSpeed", required = false) String serviceabilityMaxSpeed,
			@ApiParam(value = "Información para el serviceability") @Valid @RequestParam(value = "serviceability.id", required = false) String serviceabilityId,
			@ApiParam(value = "Es el grupo del plan") @Valid @RequestParam(value = "plan.group", required = false) String planGroup,
			@ApiParam(value = "Es el plan rank inicial") @Valid @RequestParam(value = "plan.rankInitial", required = false) String planRankInitial,
			@ApiParam(value = "Es el plan rank de la oferta") @Valid @RequestParam(value = "plan.rank", required = false) String planRank,
			@ApiParam(value = "Es la duración del comprmiso del plan") @Valid @RequestParam(value = "plan.commitmentDuration", required = false) String planCommitmentDuration,
			@ApiParam(value = "Nombre de la compañía a filtrar") @Valid @RequestParam(value = "invoiceCompany", required = false) String invoiceCompany,
			@ApiParam(value = "Es el subtipo de acción:   RO: Replace Offer CAPL: Cambio de Plan CAEQ: Cambio de equipo Este campo sera envia por el forntend") @Valid @RequestParam(value = "orderSubType", required = false) String orderSubType,
			@ApiParam(value = "Grupo valor del suscriptor") @Valid @RequestParam(value = "subscriberGroupValue", required = false) String subscriberGroupValue,
			@ApiParam(value = "Campo que me permite excluir ofertas de la lista de resultado. Es campo puede recibir mas de un id separado por ','") @Valid @RequestParam(value = "excludeOffersId", required = false) String excludeOffersId,
			@ApiParam(value = "Grupo valor del suscriptor") @Valid @RequestParam(value = "paginationInfo.size", required = false) Integer paginationInfoSize,
			@ApiParam(value = "Número de artículos en la página.") @Valid @RequestParam(value = "paginationInfo.pageCount", required = false) Integer paginationInfoPageCount,
			@ApiParam(value = "Numero maximo de paginas") @Valid @RequestParam(value = "paginationInfo.page", required = false) Integer paginationInfoPage,
			@ApiParam(value = "Numero maximo de resultados") @Valid @RequestParam(value = "paginationInfo.maxResultCount", required = false) Integer paginationInfoMaxResultCount,
			@ApiParam(value = "Nombre de una propiedad que se utilizará para ordenar.") @Valid @RequestParam(value = "sortCriteria.name", required = false) String sortCriteriaName,
			@ApiParam(value = "Indica si esto es ascendente o descendente.") @Valid @RequestParam(value = "sortCriteria.ascending", required = false) Boolean sortCriteriaAscending) throws Exception {

	    try {
		OffersBenefitsRequestDto offersBenefitsRequestDto = appRequest.fromParamstoBody(correlationId, name, isBundle, lifeCycleStatus,
				categoryId, categoryName, subcategoryId, subcategoryName, channelId, channelName,
				productSpecificationId, productSpecificationName, frameworkAgreeementId, customerId, accountId,
				productType, productId, productPublicId, startDate, endDate, limit, offset,
				productOfferingPricePriceUnits, productOfferingPriceCurrencyChangeDate,
				productOfferingPriceStartPriceDate, productOfferingPriceEndPriceDate,
				productOfferingPricePriceConsumerEntityType, productOfferingPricePriceConsumerId,
				productOfferingPricePriceLocation, productOfferingPriceStartPriceAmout,
				productOfferingPriceEndPriceAmout, fields, creditScore, creditLimit, siteId, region, stateOrProvince,
				customerSegment, customerSubsegment, isPortability, portabilityCurrentPlanType,
				portabilityCustomerSince, portabilityCurrentCompany, dealerId, broadbandMinDlDataRate,
				broadbandMaxDlDataRate, broadbandConnection, isRetention, productOfferingCatalogId, currentOffering,
				isUpgrade, action, commercialAreaId, productOrderId, planId, planType, sourceType, networkTechnology,
				serviceabilityMaxSpeed, serviceabilityId, planGroup, planRankInitial, planRank, planCommitmentDuration,
				invoiceCompany, orderSubType, subscriberGroupValue, excludeOffersId, paginationInfoSize,
				paginationInfoPageCount, paginationInfoPage, paginationInfoMaxResultCount, sortCriteriaName,
				sortCriteriaAscending);

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("UNICA-ServiceId", unICAServiceId);
		
		System.out.println(offersBenefitsRequestDto.toString());
		
		offerBenefitsServiceI.getOfferBenefitsFi(offersBenefitsRequestDto);

		return new ResponseEntity<>(new ResponseType(), httpHeaders, HttpStatus.OK);
	    } catch (Exception e) {
		throw new Exception(e);
	    }
		
	}

}
