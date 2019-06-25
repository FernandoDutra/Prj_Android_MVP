package br.com.fernandodutra.prj_android_mvp.dao;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 09:44
 * Prj_Android_MVP
 */
public interface Dao<T> {

    boolean procurarRegistro(T item);

}