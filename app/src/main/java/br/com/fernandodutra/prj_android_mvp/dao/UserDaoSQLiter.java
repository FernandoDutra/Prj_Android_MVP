package br.com.fernandodutra.prj_android_mvp.dao;

import br.com.fernandodutra.prj_android_mvp.models.User;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 09:45
 * Prj_Android_MVP
 */
public class UserDaoSQLiter implements Dao<User> {

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
