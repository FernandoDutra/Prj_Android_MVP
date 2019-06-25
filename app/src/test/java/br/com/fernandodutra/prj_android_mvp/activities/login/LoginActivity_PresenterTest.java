package br.com.fernandodutra.prj_android_mvp.activities.login;

import org.junit.Before;
import org.junit.Test;

import br.com.fernandodutra.prj_android_mvp.R;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 10:03
 * Prj_Android_MVP
 */
public class LoginActivity_PresenterTest {

    private LoginActivity_Presenter mPresenter;
    private LoginActivityTest longinActivityTest;


    @Before
    public void setUp() throws Exception {
        longinActivityTest = new LoginActivityTest();

        mPresenter = new LoginActivity_Presenter(
                longinActivityTest,
                new BancoMock()
        );
    }

    @Test
    public void processarLogin_No_UserName() throws Exception {

        mPresenter.processarLogin(
                "",
                ""
        );

        assertEquals(R.string.error_name_required, longinActivityTest.responsta);
    }

    @Test
    public void processarLogin_No_Password() throws Exception {

        mPresenter.processarLogin(
                "Hugo",
                ""
        );

        assertEquals(R.string.error_password_required, longinActivityTest.responsta);
    }

    @Test
    public void processarLogin_Invalid_Credential() throws Exception {

        mPresenter.processarLogin(
                "Hugo",
                "123"
        );

        assertEquals(R.string.error_invalid_credencial, longinActivityTest.responsta);
    }

    @Test
    public void processarLogin_Nav() throws Exception {

        mPresenter.processarLogin(
                "Fernando",
                "@Fer123"
        );

        assertTrue(longinActivityTest.nav);
    }

    @Test
    public void processarLimpeza() throws Exception {
        mPresenter.processarLimpeza();

        assertTrue(longinActivityTest.cleanForm);
    }
}
