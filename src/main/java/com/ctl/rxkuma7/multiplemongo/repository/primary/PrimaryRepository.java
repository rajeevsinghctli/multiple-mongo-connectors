package com.ctl.rxkuma7.multiplemongo.repository.primary;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ctl.rxkuma7.multiplemongo.model.CustomerOrder;



public interface PrimaryRepository extends MongoRepository<CustomerOrder, String> {
	
	@Query("{$and:[{'orderReference.salesChannel':{$eq:'ESHOP-Customer Care'}},{'orderReference.customerOrderStatus':{$ne:'INACTIVE'}},"
			+ "{'orderDocument.addlOrderAttributes.orderAttributeGroup.orderAttributeGroupInfo.orderAttributes.orderAttributeValue':{$nin:['CRIS']}},"
			+ "{'orderDocument.serviceAddress.source':?0},{'orderReference.orderDate':{ $gte:?1, $lt:?2}}]})")
	public List<CustomerOrder> findByCustomerOrderBysource(String source, String startDate, String endDate);

}
