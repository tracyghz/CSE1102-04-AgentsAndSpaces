
public class Space {
private String _name;
private String _description;
private Portal _portal;

public String getName(){
    return _name;	
}
public String getDescription(){
    return _description;
}
public Portal getPortal(){
	return _portal;
}
public void setName(String _newName){
	_name = _newName;
}
public void setDescription(String _newDescription){
	_description = _newDescription;
}
public void setPortal(Portal _newPortal){
	_portal = _newPortal;
}
public String toString(){
	return _name;
}
public String toStringLong(){
    
	String _nm = getName();
	String _dscpt = getDescription();
	String _StringLong = _nm+": "+_dscpt;
	if (getPortal()!=null)
    {
	_StringLong = _StringLong + " with a ";	
	Portal pt = getPortal();
	String pt_info = pt.toStringLong();
	_StringLong = _StringLong + pt_info;
	}
	
	return _StringLong;
	
	
}
}

