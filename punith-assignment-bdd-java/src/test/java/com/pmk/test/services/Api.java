package com.pmk.test.services;


import com.pmk.test.framework.helpers.ApiHelper;
import com.pmk.test.models.api.ItemModel;
import com.jayway.restassured.response.Response;

import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;

public class Api extends ApiHelper {


    public static Response getList(String endpoint) {
        return givenConfig().when().get(endpoint);
    }

    public static Response postDetails(List<ItemModel> itemModels) {
        return givenConfig().
                body(gson().toJson(itemModels)).
                when().
                post("posts");
    }


    public static Response updateDetails(List<ItemModel> itemModels) {
        return givenConfig().
                body(gson().toJson(itemModels)).
                when().
                put("posts/1");
    }
    public static Response deleteItem(String id) {
        return givenConfig().
                when().delete("posts/" + id);
    }
    public static Response compareItem(String param,String exp) {
        return (Response) givenConfig().
                when().get("/posts").then().body("data."+param, hasItems(exp));
    }
   /* public static Response compareUserid(String param) {
        return (Response) givenConfig().
                when().get("/posts").then().body("data."+param, hasItems("[29, 29, 31, 32, 32, 33, 33, 34, 35, 36, 37, 38, 39, 40, 41, 41, 42, 42, 43, 45]"));
    }*/
}
