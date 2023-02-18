package com.matrix.vodservice.utils;
/**
 * @author Jingping.Xie
 * @date 2023/1/26 19:56
 */

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;

/**
 * @projectName: max_kspring
 * @package: com.matrix.vodservice.utils
 * @className: AliyunVodSDKUtils
 * @author: jingpingxie
 * @description: TODO
 * @date: 2023/1/26 19:56
 * @version: 1.0
 */
public class AliyunVodSDKUtils {
    public static DefaultAcsClient initVodClient(String accessKeyId, String accessKeySecret) throws ClientException {
        String regionId = "cn-shanghai";  // 点播服务接入区域
        DefaultProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        return client;
    }
}

