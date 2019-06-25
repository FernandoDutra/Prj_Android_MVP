package br.com.fernandodutra.prj_android_mvp.activities.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.fernandodutra.prj_android_mvp.R;
import br.com.fernandodutra.prj_android_mvp.activities.menu.MenuActivity;
import br.com.fernandodutra.prj_android_mvp.dao.UserDaoSQLiter;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 09:39
 * Prj_Android_MVP
 */
public class LoginActivity extends AppCompatActivity implements LoginActivity_Contract.View {

    private Context context;

    private LoginActivity_Contract.Presenter mPresenter;

    private EditText et_nome;
    private EditText et_senha;

    private Button btn_cancelar;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        inicializarVariavies();
        inicializarAcoes();
    }

    private void inicializarVariavies() {
        context = LoginActivity.this;
        //
        et_nome = (EditText) findViewById(R.id.et_nome);
        et_senha = (EditText) findViewById(R.id.et_senha);
        //
        btn_cancelar = (Button) findViewById(R.id.btn_cancelar);
        btn_login = (Button) findViewById(R.id.btn_login);
        //
        mPresenter = new LoginActivity_Presenter(
                this,
                new UserDaoSQLiter()
        );
    }

    private void inicializarAcoes() {
        btn_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.processarLimpeza();
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.processarLogin(
                        et_nome.getText().toString(),
                        et_senha.getText().toString()
                );
            }
        });
    }

    @Override
    public void limparFormulario() {
        et_nome.setText("");
        et_senha.setText("");
        //
        et_nome.requestFocus();
    }

    @Override
    public void exibirMensagem(int resourceTxT) {
        Toast.makeText(context, resourceTxT, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void nav(Bundle mBundle) {
        Intent mIntent = new Intent(context, MenuActivity.class);
        mIntent.putExtras(mBundle);
        //
        startActivity(mIntent);
        //
        finish();
    }
}
