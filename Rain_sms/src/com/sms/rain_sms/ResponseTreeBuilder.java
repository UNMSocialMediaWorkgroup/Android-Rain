package com.sms.rain_sms;

import java.util.Locale;

public class ResponseTreeBuilder {

	DatabaseHandler db; 
	
	
	public ResponseTreeBuilder(DatabaseHandler _db)
	{
		db = _db; 
	}
	
	public boolean PopulateResponses(String _treeID)
    {
    	if(_treeID.toLowerCase(Locale.getDefault()).contains("rain"))
    	{
    		PopulateRainResponses(); 
    		return true; 
    	}
    	else if(_treeID.toLowerCase(Locale.getDefault()).contains("test"))
    	{
    		PopulateTestResponses(); 
    		return true; 
    	}
    	else 
    	{
    		return false; 
    	}
    	
    
    	
    }  
    
	public void PopulateRainResponses()
    {
		AddResponse( 1,"How many minutes does it take light to reach us from the sun?"," minutes", 8, 0);
		AddResponse( 2,"How much energy does the earth recieve from the sun in a day, in terawatts?","TW", 120000, 10000);
		AddResponse( 3,"What percent of the available energy from the sun is captured by plants?","%", 5, 1);
		AddResponse( 4,"Approximately how many electric vehicles are registered in Albuquerque?"," vehicles", 1000, 10);
		AddResponse( 5,"How many electric vehicle charging stations does UNM have?","", 0, 0);
		AddResponse( 6,"How many solar array systems does UNM have?","", 4, 0);
		AddResponse( 7,"What is the size in KiloWatts of the Electrical and Computer Engineering building solar array?","KW", 15, 1);
		AddResponse( 8,"What is the size in KiloWatts of the Yale Parking Structure solar array?","KW", 75, 5);
		AddResponse( 9,"Since what year have space missions used solar energy to power spaceships?","", 1958, 1);
		AddResponse( 10,"How many miles can an electric car travel on a full 65 KilloWatt Hour battery?"," miles", 250, 5);//tesla motors

		
    }
	
	public void PopulateTestResponses()
    {

		AddResponse( 1,"What is 2+2?","", 4, 0);
		AddResponse( 2,"The answer to this question is 93.","", 93, 7);
		AddResponse( 3,"How much can a wood chuck?"," woods", 972, 50);
		AddResponse( 4,"At what temperature does Hydrogen fuse in millions Kelvin?"," million K",16, 1);
		AddResponse( 5,"How many hours do cats sleep in an average day?", " hours", 17, 2);
		AddResponse( 6,"Approximately how many comets have astronomers discovered?","", 4000, 500);
    }
	
    public void AddResponse(int _id, String  _text, String _suffix, int  _answer, int _range)
    {
    	Response response = new Response(); 
    	response.setId(			_id);
        response.setText(		_text);
        response.setSuffix(		_suffix);
        response.setAnswer(     _answer);
        response.setRange(      _range);
        db.addResponse(response);
    }
	
	
}
