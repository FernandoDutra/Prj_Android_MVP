package br.com.fernandodutra.prj_android_mvp.activities.login;

import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 10:01
 * Prj_Android_MVP
 */
public class LoginActivityTest implements LoginActivity_Contract.View {

    public int responsta = -1;
    public boolean nav = false;
    public boolean cleanForm = false;

    @Override
    public void exibirMensagem(int resourceTxT) {
        responsta = resourceTxT;
    }

    @Override
    public void nav(Bundle mBundle) {
        nav = true;
    }

    @Override
    public void limparFormulario() {
        cleanForm = true;
    }
}