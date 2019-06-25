package br.com.fernandodutra.prj_android_mvp.activities.login;

import br.com.fernandodutra.prj_android_mvp.dao.Dao;
import br.com.fernandodutra.prj_android_mvp.models.User;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 10:04
 * Prj_Android_MVP
 */
public class BancoMock implements Dao<User> {

    @Override
    public boolean procurarRegistro(User user) {
        if (!user.getNome().equalsIgnoreCase("Fernando") ||
                !user.getSenha().equals("@Fer123")
                ) {
            return false;
        } else {
            return true;
        }
    }
}