package com.avan.paging1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val mainViewModel : MainViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter = FeedAdapter()
        rvFeeds.adapter = adapter
        //rvFeeds layout manager is set in xml

        mainViewModel.feedList.observe(this, Observer {
            if (it.size > 0)
                adapter.submitList(it)
        })
    }
}
