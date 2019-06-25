package br.com.fernandodutra.prj_android_mvp.activities.login;

import android.os.Bundle;

import br.com.fernandodutra.prj_android_mvp.R;
import br.com.fernandodutra.prj_android_mvp.dao.Dao;
import br.com.fernandodutra.prj_android_mvp.models.User;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 09:40
 * Prj_Android_MVP
 */
public class LoginActivity_Presenter implements LoginActivity_Contract.Presenter {

    private LoginActivity_Contract.View mView;
    private Dao<User> userDao;

    public LoginActivity_Presenter(LoginActivity_Contract.View mView, Dao<User> userDao) {
        this.mView = mView;
        this.userDao = userDao;
    }

    @Override
    public void processarLogin(String nome, String senha) {

        if (nome.trim().isEmpty()){
            mView.exibirMensagem(R.string.error_name_required);

            return;
        }
        //
        if (senha.trim().isEmpty()){
            mView.exibirMensagem(R.string.error_password_required);

            return;
        }
        //
        if (userDao.procurarRegistro(
                new User(nome, senha))
                ){
            mView.nav(new Bundle());
        } else {
            mView.exibirMensagem(R.string.error_invalid_credencial);
        }
    }

    @Override
    public void processarLimpeza() {
        // limpezas de banco
        mView.limparFormulario();
    }
}
