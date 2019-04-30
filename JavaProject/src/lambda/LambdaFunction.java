package lambda;
import java.util.logging.Logger;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class LambdaFunction {

	public static final String ACCESS_KEY = "AKIAI4EM226FJIKPLTCQ";
	public static final String SECRET_KEY = "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";
	public static final Regions REGION = Regions.US_WEST_1;
	Logger log =  Logger.getLogger(this.getClass().getName());
	public Response executeLambda(Request request ) {
		log.info("Hi,"+ request.getFirstName());
		log.info(request.getFirstName()+" -- "+ request.getLastName());
		
		AmazonDynamoDBClientBuilder builder = AmazonDynamoDBClientBuilder.standard();
//		builder.withCredentials(new AWSStaticCredentialsProvider(
			//	new BasicAWSCredentials(ACCESS_KEY,SECRET_KEY)));
		builder.withRegion(REGION);
		AmazonDynamoDB amazonDynamoDB =  builder.build();
		log.info("amazonDynamoDB object builded...."+ amazonDynamoDB.listTables());
		DynamoDBMapper dynamoDbMapper = new DynamoDBMapper(amazonDynamoDB);
		Session session = dynamoDbMapper.load(Session.class,request.getLastName());
		log.info("Session object retrieved...."+ session.getEmail());
		Response response = new Response();
		response.setUserId(session.getUserId());
		response.setEmail(session.getEmail());
		log.info("email,"+ response.getEmail());
		return response;
	}
}
