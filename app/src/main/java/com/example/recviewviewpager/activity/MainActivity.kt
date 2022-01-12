package com.example.recviewviewpager.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.recviewviewpager.R
import com.example.recviewviewpager.adapter.CustomAdapter
import com.example.recviewviewpager.modul.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         initView()
        val member = prepareMemberList()
        refreshAdapter(member)


    }
   fun refreshAdapter(member: List<Member>){
    val adapter = CustomAdapter(member)
       recyclerView.adapter = adapter
   }

@SuppressLint("WrongConstant")
fun initView(){
    recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.HORIZONTAL,false)
     val pagerSnapHelper = PagerSnapHelper()
      pagerSnapHelper.attachToRecyclerView(recyclerView)
}
    fun prepareMemberList():List<Member>{
        val member = ArrayList<Member>()
        for (i in 0..5){
            member.add(Member("Gare"+i,"Yato"+i))
        }
        return member
    }
}