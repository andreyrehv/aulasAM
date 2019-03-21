package com.example.aluno.telalogin

class FunLogin {
    companion object {
        public fun login(username:String, password:String) : Boolean{
            var ret : Boolean = false
            if(username is String && password is String){
                if(username.equals("admin") && password.equals("andrey")){
                    ret = true;
                }
            }
            return ret;
        }
    }
}