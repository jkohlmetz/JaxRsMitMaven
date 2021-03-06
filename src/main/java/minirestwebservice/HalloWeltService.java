package minirestwebservice;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path( HalloWeltService.webContextPath )
public class HalloWeltService
{
   static final String webContextPath = "/helloworld";

   @GET @Produces( MediaType.TEXT_PLAIN )
   public String halloPlainText( @QueryParam("name") String name )
   {
      return "Plain-Text: Guten Tag " + name;
   }

   @GET @Produces( MediaType.TEXT_HTML )
   public String halloHtml( @QueryParam("name") String name )
   {
      return "<html><title>Hallo "+ name + "</title><body><h2>Html: Guten Tag " + name + "</h2></body></html>";
   }
}

