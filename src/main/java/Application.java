

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	private StreamBridge streamBridge;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Consumer<OrderJson> acmeretail/onlineservices/order/created/v2/{regionId}/{orderId}.publish() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}


	@Bean
	public Consumer<CustomerJson> acmeretail/onlineservices/customer/updated/v2/{regionId}/{customerId}.publish() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}

	public void sendAcmeretail/c360/customerinsight/generated/v1/{insighttype}/{customerid}.subscribe(
		CustomerInsight payload, String insighttype, String customerid
		) {
		String topic = String.format("acmeretail/c360/customerinsight/generated/v1/%s/%s",
			insighttype, customerid);
		streamBridge.send(topic, payload);
	}
}
