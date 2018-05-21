package com.controllers;

import org.hibernate.annotations.common.util.impl.Log;

import com.entities.Alumno;
import com.service.ApiService;
import com.service.ApiServiceGenerate;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainClass {

	private static final String TAG = MainClass.class.getSimpleName();
	
	public static void main(String[] args) {
			System.out.println("Hola mundo");

			ApiService service = ApiServiceGenerate.createService(ApiService.class);			
			Call<Alumno> call;
	        call = service.login("107702","eren");
	        
	        call.enqueue(new Callback<Alumno>() {
	            public void onResponse(Call<Alumno> call, Response<Alumno> response) {
	                try{
	                    int statusCode = response.code();
	                    
	                    

	                    if (response.isSuccessful()){
	                        Alumno alu = response.body();
	                        System.out.println(alu.toString());
	                    }else {
	                        
	                        throw new Exception("Error en el servicio");
	                    }
	                }catch(Throwable t) {
	                    try {
	                    	System.out.println(t.toString());
	                    }catch (Throwable x){
	                    	System.out.println(x.toString());
	                    }
	                }
	            }

	          
	            public void onFailure(Call<Alumno> call, Throwable t) {
	                System.out.println(t.toString());
	            }
	        });
	
	}

}
