package frogermcs.io.githubclient.ui.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import frogermcs.io.githubclient.AppComponent;
import frogermcs.io.githubclient.GithubClientApplication;

/**
 * Created by Miroslaw Stanek on 23.04.15.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setupActivityComponent();
    }
    protected abstract void setupActivityComponent();
}