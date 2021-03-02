package cn.org.weixin4j.core;

import lombok.Data;

/**
 * 微信 Properties 配置
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Data
public class Weixin4jProperties implements Weixin4j {

    /**
     * 开发者ID
     */
    private String appId;

    /**
     * 开发者密码
     */
    private String appSecret;

    /**
     * 服务器地址
     */
    private String url;

    /**
     * 令牌
     */
    private String token;

    /**
     * 消息加解密密钥
     */
    private String encodingAesKey;

}
