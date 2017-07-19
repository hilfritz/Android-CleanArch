package com.hilfritz.android_clean_architecture.presentation.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.hilfritz.android_clean_architecture.R;
import com.hilfritz.android_clean_architecture.domain.executor.Executor;
import com.hilfritz.android_clean_architecture.domain.executor.MainThread;
import com.hilfritz.android_clean_architecture.domain.executor.impl.ThreadExecutor;
import com.hilfritz.android_clean_architecture.domain.repository.MessageRepository;
import com.hilfritz.android_clean_architecture.domain.repository.impl.MessageRepositoryImpl;
import com.hilfritz.android_clean_architecture.presentation.presenters.MainPresenter;
import com.hilfritz.android_clean_architecture.presentation.presenters.impl.MainPresenterImpl;
import com.hilfritz.android_clean_architecture.threading.MainThreadImpl;

public class MainActivity extends AppCompatActivity implements MainPresenter.View{
    MainPresenterImpl presenter;
    TextView textView;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INITIALIZE VIEWS
        textView = ((TextView)findViewById(R.id.txtView));
        textView.setMovementMethod(new ScrollingMovementMethod());
        progressBar = ((ProgressBar)findViewById(R.id.progressBar));

        //INITIALIZE THE VARIABLES
        MainThread mainThread = MainThreadImpl.getInstance();
        Executor executor = ThreadExecutor.getInstance();
        MessageRepository messageRepository = new MessageRepositoryImpl();


        presenter = new MainPresenterImpl(executor,mainThread, this, messageRepository);



    }

    @Override
    public void onResume() {
        super.onResume();
        showProgress();
        presenter.resume();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(android.view.View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(android.view.View.GONE);
    }

    @Override
    public void showError(String message) {
        hideProgress();
        textView.setText("[error]"+message);
    }

    @Override
    public void displayWelcomeMessage(String str) {
        hideProgress();
        textView.setText(str);
    }
}
