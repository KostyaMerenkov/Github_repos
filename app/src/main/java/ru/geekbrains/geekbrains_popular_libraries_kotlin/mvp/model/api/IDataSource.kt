package ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.api

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Header
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.entity.GithubUser

interface IDataSource {

    @GET("users")
    fun getUsers() : Single<List<GithubUser>>

    //@Header("Authorization") token: String
//    @GET
//    fun getUserRepos(@Url url: String) : Single

}