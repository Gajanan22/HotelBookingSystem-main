package com.cts.hbs.service.interfac;

import com.cts.hbs.dto.LoginRequest;
import com.cts.hbs.dto.Response;
import com.cts.hbs.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
