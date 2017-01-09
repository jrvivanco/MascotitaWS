package org.jrvivanco.mascotita.restApi;

import org.jrvivanco.mascotita.restApi.model.MascotaMediaRecentResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

 /**
 * Created by jrvivanco on 07/01/2017.
 * Definir metodos que recibiran las peticiones al web service
 */

public interface IEndPointsApi {

    //Busqueda de usuarios por username
    @GET(ConstantesRestApi.USERS + "{user_id}" + ConstantesRestApi.MEDIA_SEARCH + "?" + ConstantesRestApi.KEY_ACCESS_TOKEN + ConstantesRestApi.ACCESS_TOKEN)
    //@GET("users/search?q=user_id&access_token=access_token")
     Call<MascotaMediaRecentResponse> getUsersSearch(@Path("user_id") String user_id);
}
