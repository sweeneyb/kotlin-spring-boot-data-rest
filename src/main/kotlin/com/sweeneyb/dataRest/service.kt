package com.sweeneyb.dataRest

import org.springframework.stereotype.Service

@Service
class HelloService(val restaurantRepository: RestaurantRepository) {

    fun hello() = "Hello!"

    fun count() = restaurantRepository.count()

}
