package ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.repos

import io.reactivex.rxjava3.core.Single
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.entity.GithubUser
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.entity.GithubUserRepo

interface IGithubRepos {
    fun getRepos(user: GithubUser): Single<List<GithubUserRepo>>
}