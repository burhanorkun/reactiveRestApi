package com.orkun.reactiverestapi.reactiverestapi.service;

import com.orkun.reactiverestapi.reactiverestapi.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> getUserById(int id);

    Flux<User> getUsers();

    Mono<User> saveUser(User user);

    Mono<User> updateUser(int id, User user);

    Mono<Void> deleteUser(int id);

    Mono<User>  getGuestUserById(int id);
}
