package com.sms.rain_sms;

public class Response {
	
	int id = 0;
	String text = ""; 
	String suffix = ""; 
	int answer = 0;
	int range = 1;
	

	public Response()
	{
		
	}
	
	public Response(int _id, String _text)
	{
		id = _id; 
		text = _text; 
	}
	
	// getting id
    public int getId(){
        return this.id;
    }
    // setting id
    public void setId(int _id){
        this.id = _id;
    }
	
    // getting text
    public String getText(){
        return this.text;
    }
    // setting text
    public void setText(String _text){
        this.text = _text;
    }
    
    public String getSuffix(){
        return this.suffix;
    }
    public void setSuffix(String _suffix){
    	this.suffix = _suffix;
    }
   
    
    public int getAnswer()
    {
    	return this.answer; 
    }
    public void setAnswer(int _answer)
    {
    	this.answer = _answer;
    }
    public int getRange()
    {
    	return this.range; 
    }
    public void setRange(int _range)
    {
    	this.range = _range;
    }
    
    
   

    public String toShortString()
    {
    	return "["+id+"]  "+text+" , "+suffix+"["+answer+"]["+range+"]"; 
    }
}
