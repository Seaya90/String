package di_collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	//List 타입
	private List<String> addressList;
	//Set 타입
	private Set<String> addressSet;
	//Map 타입 : key-value
	private Map<String, String> addressMap;
	//Properties 타입
	private Properties addressProps;
	
	public CollectionBean() {
		System.out.println("CollectionBean() - 객체생성");
	}

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public Set<String> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}

	public Map<String, String> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}

	public Properties getAddressProps() {
		return addressProps;
	}

	public void setAddressProps(Properties addressProps) {
		this.addressProps = addressProps;
	}
	
}
