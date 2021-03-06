package hiPkg;

import java.util.ArrayList;


public class Policy {
	
	private int id;
	private ArrayList<Client> clients;
	private String contactNo;
	private String email;
	private PolicyType type;
	

	public Policy(ArrayList<Client> clients, String contactNo, String email, PolicyType type) {
		this.clients = clients;
		this.contactNo = contactNo;
		this.email = email;
		this.type = type;
	}
	public Policy(ArrayList<Client> clients, String contactNo, String email, PolicyType type, int id) {
		this.clients = clients;
		this.contactNo = contactNo;
		this.email = email;
		this.type = type;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Client> getClients() {
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PolicyType getType() {
		return type;
	}
	public void setType(PolicyType type) {
		this.type = type;
	}
	public String toString(){
		String toReturn = "";
		toReturn += type+"\n";
		toReturn += "Email: " + email+"\n";
		toReturn += "Contact Number: " + contactNo+"\n\n"; 
		//toReturn += "People: \n";
		for(int i = 0; i<clients.size(); i++){
			toReturn += "Person Number " + i+1+"\n"; 
			toReturn += clients.get(i).toString()+"\n";
		}
		toReturn += "Cost: " + getQuote();
		
		return toReturn;
	}
	public double getQuote(){
		double cost = 0;
		for(int i = 0; i<clients.size(); i++){
			//base price
			cost += 100;
			for(int j = 0; j<clients.get(i).getConditions().size(); j++){
				cost += clients.get(i).getConditions().get(j).getDegree();
			}
		}
		cost = cost*type.getImpact();
		return cost ;
		
	}
	
	
	

}
