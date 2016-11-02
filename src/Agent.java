
public class Agent {
	
private Space _location;
private String _name;
public Space getLocation() {
	return _location;
}
public void setLocation(Space _location) {
	this._location = _location;
}
public String getName() {
	return _name;
}
public void setName(String _name) {
	this._name = _name;
}
public String toString(){
	return getName();
}
public String toStringLong(){
	return toString() + " is in " + getLocation().toString();
}
public boolean usePortal(){
	if(this.getLocation().getPortal() != null){
		System.out.println(this.getName()+" is moving from " + this.getLocation() + " to " + this.getLocation().getPortal().getDestination());
		this.getLocation().getPortal().transport(this);
		return true;
	}
	else{
		return false;
	}
	
}
}
