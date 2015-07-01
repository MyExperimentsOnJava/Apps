package com.java4u.spring.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;


@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/test/{name}")
	public String getHelloMsg(@PathParam("name")String name)
	{
		
		return "Hello "+name+" for the rest world";
	}
	
	@GET
	@Path("/jsonTest/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getHelloWorldMsgJson(@PathParam("name")String name)
	{
		return "Hello "+name+"for the json world";
	}
	
	@GET
	@Path("/jsonTrack")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrack()
	{
		Track track = new Track();
		track.setAddress("One");
		track.setName("name");
		track.setId("Id");
		return track;
	}
	
	@GET
	@Path("/xmlTrack")
	@Produces(MediaType.APPLICATION_XML)
	public Track getTrackXML()
	{
		Track track = new Track();
		track.setAddress("One");
		track.setName("name");
		track.setId("Id");
		return track;
	}
	
	@GET
	@Path("/testQuery")
	public String getMessageQuery(@QueryParam("from")String from , @QueryParam("to")String to)
	{
		return "This is from "+from+" and to "+to;
	}
	
	@GET
	@Path("/testMatrix")
	public String getMessageMatrix(@MatrixParam("from")String from , @MatrixParam("to")String to)
	{
		return "This is from "+from+" and to "+to;
	}
	
	

	@GET
	@Path("/testContext")
	public String getMessageURIContext(@Context UriInfo info)
	{
		String from = info.getQueryParameters().getFirst("from");
		List<String> to = info.getQueryParameters().get("to");
		return "This is from "+from+" and to "+to;
	}
	
	
}
