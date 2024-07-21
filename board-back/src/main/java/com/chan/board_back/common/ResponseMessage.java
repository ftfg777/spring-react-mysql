package com.chan.board_back.common;

public interface ResponseMessage {

    // HTTP Status 200
    String SUCCESS = "Success.";

    // HTTP Status 400
    String VALIDATION_FAILED = "Validation failed.";
    String DUPLICATE_EMAIL = "Duplicate email.";
    String DUPLICATE_NICKNAME = "Duplicate nickname.";
    String DUPLICATE_TEL_NUMBER = "Duplicate tel Number.";
    String NOT_EXISTED_USER = "this user Not existed.";
    String NOT_EXTSTED_BOARD = "this board Not existed.";

    // HTTP Status 401
    String SIGN_IN_FAIL = "login information mismatch.";
    String AUTHORIZATION_FAIL = "Authorization fail.";

    // HTTP Status 403
    String NO_PERMISSION = "Do not have permission.";

    // HTTP Status 500
    String DATABASE_ERROR = "Database error.";



}
