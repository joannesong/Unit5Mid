package nyc.c4q.unit5midassesssment;

import nyc.c4q.unit5midassesssment.model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by joannesong on 1/24/18.
 */

public interface UserService {

//    String us = "us";
//    String info = "name,location,cell,email,dob,picture";
//    int results = 20;
//
//    @GET("api/")
//    Call<User> getInfo(@Query("nat") String us,
//                       @Query("inc") String info,
//                       @Query("results") int results);

    @GET("?nat=us&inc=name,location,cell,email,dob,picture&results=20")
    Call<User> getInfo();

}
