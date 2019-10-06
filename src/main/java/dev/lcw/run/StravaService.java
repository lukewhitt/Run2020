package dev.lcw.run;

import dev.lcw.run.generated.strava.ApiClient;
import dev.lcw.run.generated.strava.ApiException;
import dev.lcw.run.generated.strava.api.AthletesApi;
import dev.lcw.run.generated.strava.api.ClubsApi;
import dev.lcw.run.generated.strava.model.SummaryClub;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class StravaService {

    @ConfigProperty(name = "strava.accessToken")
    private String defaultAccessToken;

    private ApiClient apiClient;

    private ApiClient getApiClient() {
        if (apiClient == null) {
            apiClient = new ApiClient();
            apiClient.setAccessToken(defaultAccessToken);
        }

        return apiClient;
    }

    public String printAtheleteInfo() throws ApiException
    {
        AthletesApi athletesApi = new AthletesApi(getApiClient());

        List<SummaryClub> clubs = athletesApi.getLoggedInAthlete().getClubs();

        clubs.forEach(c -> {

        });

        if (clubs == null) {
            return athletesApi.getLoggedInAthlete().toString();
        } else {
            return clubs.toString();
        }
    }

    public String printClubInfo() throws ApiException
    {
        ClubsApi clubsApi = new ClubsApi(getApiClient());

        return clubsApi.getClubActivitiesById(543805, 1, 15).toString();

    }
}
