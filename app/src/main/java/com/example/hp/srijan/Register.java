package com.example.hp.srijan;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class Register extends Fragment {


    public Register() {
        // Required empty public constructor
    }


    View fragmentView;
    WebView browser;
    ProgressBar progressbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentView =  inflater.inflate(R.layout.fragment_register, container, false);
        return  fragmentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        browser = (WebView)fragmentView.findViewById(R.id.wbView);
        progressbar = (ProgressBar)fragmentView.findViewById(R.id.progressBar);

        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setLoadWithOverviewMode(true);
        browser.getSettings().setUseWideViewPort(true);

        browser.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                //System.out.println("hello");
                return true;
            }
        });
        try {
            browser.loadUrl("http://srijaniitism.org/register/");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        browser.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if(newProgress<100&&progressbar.getVisibility() ==ProgressBar.GONE)
                {
                    progressbar.setVisibility(ProgressBar.VISIBLE);
                }
                progressbar.setProgress(newProgress);
                if(newProgress == 100){
                    progressbar.setVisibility(ProgressBar.GONE);
                }
            }
        });
    }
}
