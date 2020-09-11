package com.glennposadas.urbandicsample

interface APIService {
//    let headers = [
////    "x-rapidapi-host": "mashape-community-urban-dictionary.p.rapidapi.com",
////    "x-rapidapi-key": "bffd915f49msh642ee56a0d63f80p173ce1jsnce67c23573c4"
////    ]

//    "https://mashape-community-urban-dictionary.p.rapidapi.com/define?term=wat"

    //@escaping
    suspend fun defineTerm(term: String): DefineTermResponse
}