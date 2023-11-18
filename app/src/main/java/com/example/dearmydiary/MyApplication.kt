package com.example.dearmydiary

import androidx.multidex.MultiDexApplication
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

//MultiDexApplication 상속
class MyApplication : MultiDexApplication() {
    companion object {
        // 전역으로 쓰이는ㄴ ?????
        // static 과 비슷함/ 헤당 클래스 명으로 멤버에접근가능
        // 인증기능에 접근하는 인스턴스가 필요함
        lateinit var auth: FirebaseAuth
        var email : String? = null
        fun checkAuth():Boolean {
            var currentUser = auth.currentUser
            // 현재 유저가 있다면, 해당 유저의 이메일 정보를 가지고 오고
            // 유저 이메일 인증 확인 했는지 유무에 따라서 false
            return  currentUser?.let {
                email = currentUser.email
                currentUser.isEmailVerified
            } ?: let {
                false
            }
        }
    } // companion object


    // 생명주기, 최초 1회 동작을 합니다.
    override fun onCreate() {
        super.onCreate()
        auth = Firebase.auth

    }


}