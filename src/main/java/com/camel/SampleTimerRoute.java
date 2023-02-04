package com.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SampleTimerRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:sampleTimer")
		.log("SampleTimerRoute is Calling:::${body}")
		.to("log:sampleEndpoint");
	}

}
