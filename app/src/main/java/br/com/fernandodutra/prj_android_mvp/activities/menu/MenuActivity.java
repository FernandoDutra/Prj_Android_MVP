package br.com.fernandodutra.prj_android_mvp.activities.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import br.com.fernandodutra.prj_android_mvp.activities.login.LoginActivity;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 09:41
 * Prj_Android_MVP
 */
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        Intent mIntent = new Intent(MenuActivity.this, LoginActivity.class);
        startActivity(mIntent);
        //
        finish();
    }

}
