package ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.repos

import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.api.IDataSource
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.entity.GithubUser
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.entity.GithubUserRepo
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.repo.IGithubUsersRepo
import java.lang.RuntimeException

class RetrofitGithubRepos(val api: IDataSource) : IGithubRepos {
    override fun getRepos(user: GithubUser) = user.reposUrl.let {
        api.getUserRepos(user.reposUrl).subscribeOn(Schedulers.io())
    }
}