package br.com.fernandodutra.prj_android_mvp.activities.login;

import android.os.Bundle;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 09:39
 * Prj_Android_MVP
 */
public class LoginActivity_Contract {

    interface View {
        void exibirMensagem(int resourceTxT);

        void nav(Bundle mBundle);

        void limparFormulario();
    }

    interface Presenter {
        void processarLogin(String nome, String senha);

        void processarLimpeza();
    }

}
