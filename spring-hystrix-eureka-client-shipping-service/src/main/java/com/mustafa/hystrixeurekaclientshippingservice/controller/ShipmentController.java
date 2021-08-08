package com.mustafa.hystrixeurekaclientshippingservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mustafa.hystrixeurekaclientshippingservice.domain.Shipment;


@RestController
public class ShipmentController {

	private static Map<String, List<Shipment>> shipmentDB = new HashMap<String, List<Shipment>>();

	static {
		shipmentDB = new HashMap<String, List<Shipment>>();

		List<Shipment> lst = new ArrayList<Shipment>();
		Shipment shipment = new Shipment("UPS", "125 S Canal St", "708-200-8888","4/4/2021","Candy", "5.5");
		lst.add(shipment);
		shipment = new Shipment("FedEx", "555 W Madison St", "708-550-8888","4/5/2021","Phone", "6.2");
		lst.add(shipment);

		shipmentDB.put("customer1", lst);

		lst = new ArrayList<Shipment>();
		shipment = new Shipment("DHL", "10 S State St", "708-000-7777","5/10/2021","Table", "25.2");
		lst.add(shipment);
		shipment = new Shipment("UPS", "1 N Wabash St", "708-111-2525","5/20/2021","Chair", "20.2");
		lst.add(shipment);

		shipmentDB.put("customer2", lst);

	}

	@RequestMapping(value = "/getShipmentDetailsForCustomer/{customername}", method = RequestMethod.GET)
	public List<Shipment> getShipments(@PathVariable String customername) {
		System.out.println("Getting Shipment details for " + customername);

		List<Shipment> shipmentList = shipmentDB.get(customername);
		if (shipmentList == null) {
			shipmentList = new ArrayList<Shipment>();
			Shipment std = new Shipment("Not Found", "Not Found","Not Found","Not Found","Not Found","Not Found");
			shipmentList.add(std);
		}
		return shipmentList;
	}
}
