package cn.org.weixin4j.core;

/**
 * 微信配置
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public interface Weixin4j {

    /**
     * 开发者ID
     *
     * @return 返回 开发者ID
     */
    String getAppId();

    /**
     * 开发者密码
     *
     * @return 返回 开发者密码
     */
    String getAppSecret();

    /**
     * 服务器地址
     *
     * @return 返回 服务器地址
     */
    String getUrl();

    /**
     * 令牌
     *
     * @return 返回 令牌
     */
    String getToken();

    /**
     * 消息加解密密钥
     *
     * @return 返回 消息加解密密钥
     */
    String getEncodingAesKey();

}
