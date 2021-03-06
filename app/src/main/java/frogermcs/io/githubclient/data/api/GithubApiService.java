package frogermcs.io.githubclient.data.api;

import java.util.List;

import frogermcs.io.githubclient.data.api.response.RepositoryResponse;
import frogermcs.io.githubclient.data.api.response.UserResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;


public interface GithubApiService {
    @GET("/users/{username}")
    Observable<UserResponse> getUser(
            @Path("username") String username
    );

    @GET("/users/{username}/repos")
    Observable<List<RepositoryResponse>> getUsersRepositories(
            @Path("username") String username
    );

}
