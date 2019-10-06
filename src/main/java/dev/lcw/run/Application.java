package dev.lcw.run;

import dev.lcw.run.generated.strava.ApiException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/strava")
public class Application {

    @Inject
    private StravaService stravaService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        try {
            return stravaService.printClubInfo();
        }
        catch (ApiException e)
        {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}