package woowahan.baemin_waiting.team_six.store;

public class StoreVO {
	private int storeId; //store_id
	private String storeDesc;
	private String storeImgUrl;
	private String storeTel;
	private String storeName;
	private String storeRunningTime;
	private String storeAddr;
	private String storeLongitude;
	private String storeLatitude;
	public StoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StoreVO(int storeId, String storeDesc, String storeImgUrl, String storeTel, String storeName,
			String storeRunningTime, String storeAddr, String storeLongitude, String storeLatitude) {
		super();
		this.storeId = storeId;
		this.storeDesc = storeDesc;
		this.storeImgUrl = storeImgUrl;
		this.storeTel = storeTel;
		this.storeName = storeName;
		this.storeRunningTime = storeRunningTime;
		this.storeAddr = storeAddr;
		this.storeLongitude = storeLongitude;
		this.storeLatitude = storeLatitude;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreDesc() {
		return storeDesc;
	}
	public void setStoreDesc(String storeDesc) {
		this.storeDesc = storeDesc;
	}
	public String getStoreImgUrl() {
		return storeImgUrl;
	}
	public void setStoreImgUrl(String storeImgUrl) {
		this.storeImgUrl = storeImgUrl;
	}
	public String getStoreTel() {
		return storeTel;
	}
	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreRunningTime() {
		return storeRunningTime;
	}
	public void setStoreRunningTime(String storeRunningTime) {
		this.storeRunningTime = storeRunningTime;
	}
	public String getStoreAddr() {
		return storeAddr;
	}
	public void setStoreAddr(String storeAddr) {
		this.storeAddr = storeAddr;
	}
	public String getStoreLongitude() {
		return storeLongitude;
	}
	public void setStoreLongitude(String storeLongitude) {
		this.storeLongitude = storeLongitude;
	}
	public String getStoreLatitude() {
		return storeLatitude;
	}
	public void setStoreLatitude(String storeLatitude) {
		this.storeLatitude = storeLatitude;
	}
	@Override
	public String toString() {
		return "StoreVO [storeId=" + storeId + ", storeDesc=" + storeDesc + ", storeImgUrl=" + storeImgUrl
				+ ", storeTel=" + storeTel + ", storeName=" + storeName + ", storeRunningTime=" + storeRunningTime
				+ ", storeAddr=" + storeAddr + ", storeLongitude=" + storeLongitude + ", storeLatitude=" + storeLatitude
				+ "]";
	}
	
	
}
