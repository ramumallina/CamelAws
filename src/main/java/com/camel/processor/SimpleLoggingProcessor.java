package com.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SimpleLoggingProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		String payload= exchange.getIn().getBody(String.class);
		System.out.println("payload is:::"+ payload);
		exchange.getIn().setBody(payload, String.class);
	}

}
