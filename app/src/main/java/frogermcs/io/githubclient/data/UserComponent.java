package frogermcs.io.githubclient.data;


import dagger.Subcomponent;
import frogermcs.io.githubclient.data.api.UserModule;


@UserScope
@Subcomponent(
        modules = {
                UserModule.class
        }
)
public interface UserComponent {


}