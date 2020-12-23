package com.ctl.rxkuma7.multiplemongo.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ctl.rxkuma7.multiplemongo.model.CustomerOrder;


public interface SecondaryRepository extends MongoRepository<CustomerOrder, String> {
	@Query(value ="{$and:[{'orderReference.salesChannel':{$eq:'ESHOP-Customer Care'}},"
			+ "{'orderDocument.addlOrderAttributes.orderAttributeGroup.orderAttributeGroupInfo.orderAttributes.orderAttributeName': {$eq:'orderCreationDateTime'}}, "
			+ "{'orderDocument.addlOrderAttributes.orderAttributeGroup.orderAttributeGroupInfo.orderAttributes.orderAttributeValue':{ $gte:?0, $lt:?1}},"
			+ "{'orderDocument.serviceAddress.source':?2}]}",count = true)
	public Long findQualificationCount(String startDate, String endDate,String source);

}
