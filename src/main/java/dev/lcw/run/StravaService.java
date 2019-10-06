package dev.lcw.run;

import dev.lcw.run.generated.strava.ApiClient;
import dev.lcw.run.generated.strava.ApiException;
import dev.lcw.run.generated.strava.api.AthletesApi;
import dev.lcw.run.generated.strava.api.ClubsApi;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StravaService {

    @ConfigProperty(name = "strava.accessToken")
    String defaultAccessToken;

    private static final int HP_RUNNERS_ID = 543805;

    private ApiClient apiClient;

    private ApiClient getApiClient() {
        if (apiClient == null) {
            apiClient = new ApiClient();
            apiClient.setAccessToken(defaultAccessToken);
        }

        return apiClient;
    }

    public String printAthleteInfo() throws ApiException
    {
        AthletesApi athletesApi = new AthletesApi(getApiClient());
        return athletesApi.getLoggedInAthlete().toString();
    }

    public String printClubInfo() throws ApiException
    {
        ClubsApi clubsApi = new ClubsApi(getApiClient());
        return clubsApi.getClubById(HP_RUNNERS_ID).toString();
    }
}
