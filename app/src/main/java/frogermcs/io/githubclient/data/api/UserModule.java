package frogermcs.io.githubclient.data.api;

import dagger.Module;
import dagger.Provides;
import frogermcs.io.githubclient.data.UserScope;
import frogermcs.io.githubclient.data.model.User;



@Module
public class UserModule {
    private User user;

    public UserModule(User user) {
        this.user = user;
    }
    @Provides
    @UserScope
    User provideUser() {
        return user;
    }
    @Provides
    @UserScope
    RepositoriesManager provideRepositoriesManager(User user, GithubApiService githubApiService) {
        return new RepositoriesManager(user, githubApiService);
    }
}
