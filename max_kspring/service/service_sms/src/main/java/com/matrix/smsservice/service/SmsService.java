package com.matrix.smsservice.service;

import java.util.Map;

public interface SmsService {
    boolean sendSmsPhone(String phone, Map<String, String> param);
}
