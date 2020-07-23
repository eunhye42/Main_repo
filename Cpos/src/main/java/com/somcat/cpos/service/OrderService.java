package com.somcat.cpos.service;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.somcat.cpos.domain.Criterion;
import com.somcat.cpos.domain.OrderVO;
import com.somcat.cpos.persistence.OrderDAOIntf;

@Service
public class OrderService implements OrderServiceIntf {
	private static Logger log = LoggerFactory.getLogger(OrderService.class);

	@Inject
	OrderDAOIntf odao;
	
	
	@Override
	public int registOrder(OrderVO ovo) {
		return odao.insertOrder(ovo);
	}
	
	@Override
	public List<OrderVO> getList(Criterion cri, String member_id, Date order_date) {
		return null;
	}


	@Override
	public int modifyOrder(OrderVO ovo) {
		return 0;
	}

	@Override
	public int cancelOrder(int order_no) {
		return 0;
	}
}
