package lambda;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Used to store the session information
 * 
 * @author sukumar.j@tringapps.com
 *
 */
@DynamoDBTable(tableName = "Session")
public class Session {

	@DynamoDBHashKey
	@DynamoDBAttribute(attributeName = "session_id")
	private String sessionId;
	@DynamoDBIndexHashKey(globalSecondaryIndexName = "user-version-index")
	@DynamoDBAttribute(attributeName = "user_id")
	private String userId; // identifier for the user
	private String email;// emailId for the user
	private String role; // role of the user (care provider, patient onboarding assistant, customer, etc)
	@DynamoDBAttribute(attributeName = "user_agent")
	private String userAgent; // user agent via which the customer logged in
	@DynamoDBAttribute(attributeName = "device_id")
	private String deviceId; // identifier of the device through which the customer logged in
	@DynamoDBAttribute(attributeName = "device_type")
	private String deviceType; // type of the device through which the customer logged in
	@DynamoDBAttribute(attributeName = "device_token")
	private String deviceToken; // push token for the device
	@DynamoDBAttribute(attributeName = "created_time")
	private long createdTime; // logged in time
	@DynamoDBAttribute(attributeName = "updated_time")
	private long updatedTime; // last accessed time
	@DynamoDBIndexRangeKey(globalSecondaryIndexName = "user-version-index")
	private String version; // in order to track the version to which the user hitting
	@DynamoDBAttribute(attributeName = "session_attribute")
	private Map<String, String> sessionAttribute = new HashMap<String, String>();

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}

	public long getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(long updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Map<String, String> getSessionAttribute() {
		return sessionAttribute;
	}

	public void setSessionAttribute(Map<String, String> sessionAttribute) {
		this.sessionAttribute = sessionAttribute;
	}

	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + ", userId=" + userId + ", email=" + email + ", role=" + role
				+ ", userAgent=" + userAgent + ", deviceId=" + deviceId + ", deviceType=" + deviceType
				+ ", deviceToken=" + deviceToken + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime
				+ ", version=" + version + ", sessionAttribute=" + sessionAttribute + "]";
	}

	public Session cloneMe(String token, long currentTime) {
		Session session = new Session();
		session.createdTime = currentTime;
		session.deviceId = this.deviceId;
		session.deviceToken = this.deviceToken;
		session.deviceType = this.deviceType;
		session.email = this.email;
		session.role = this.role;
		session.sessionAttribute = this.sessionAttribute;
		session.sessionId = token;
		session.updatedTime = currentTime;
		session.userAgent = this.userAgent;
		session.userId = this.userId;
		session.version = this.version;
		return session;
	}
}
