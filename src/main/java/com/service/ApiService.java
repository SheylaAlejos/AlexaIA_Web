package com.service;



import com.entities.Alumno;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;



public interface ApiService {

	String API_BASE_URL="https://campus.tecsup.edu.pe:443/campus-rest/";

    @FormUrlEncoded
    @POST("login")
    Call<Alumno> login(@Field("usuario")String usuario,
                       @Field("clave") String clave);
}
