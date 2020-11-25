package com.star.common.util;

/**
 *
 */
public class AliSandboxieConst {

    //沙箱APPID
    public static final String APP_ID = "2016110200786783";
    //自己本地生成的私钥
    public static final String APP_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCZ+rhilUmQAGRwyKOYy3FObM7FfnnqhP/ZvuPrhPAwwa/5Z1K2i4sT9PvKEb/Xsh83tYxkG884kFJoYbAKerC7at1THw2zvE0DdFjAaAEXLbVMlXwgIT0/4vxFs1mxeHKVPL31rb600IUr5ZIwimraXypns/CHU/acLCsQ1cMvF77o8hb2rodJqHyTtVEfWFmboNac4RwaXsriUwiElqd+xBDyMBqvo2IGZbLwSZ+drONY8k0dI4G2STgPkfzZLp9Dutimt/QgebfgftywtINlRRi0aF4qL7QwOpxsicjAo3xa7OpBZmMDuCg+4z7wMGAeti2kxz0RaHUdy0yqNtCxAgMBAAECggEATTKXKM3B4NFhie39n0g4GWKR1BAR3ZMqlqeOq3Ct3zPsHvU/UcfqRWoopml5rhFed1as+S+8F5a7yhtX4Bkc7AmqxtalzvvT/KxjJqu+CDnhUHENlyozBAmwAt3lVQWXJN0cO8UM/KgibByfy3hKFAtsPivHpoFg/XFjcgBJ6ByNTZQiqxBRtx9Kru1MWRRH/IlnlCiXVw9l+Z526fzz6V4akSTG8BICnvB2mE940DEbZXaHBeMgFDTe2QFTEJBGakjMdOTdWMQSwOQtryNI3iscVrK9BPEmGX/HrkTteNBvtTsYnGT31LD7R6tO4qfr79iicwMFp8qBRA4Ab36c8QKBgQDmcyHr9PMhEHnQqNCaFO9MC5OWxeO/Uz1RYO38PPj25HMLMBCvLQKwVn3rKbc01z0AxyfrTqGpV+qAoY6JaEh+WlXwZ/wAkHIcQeS5D79yfxkuOXC0Rrt+bwt7Wahwhq8bcANMOx26apEV5FW15mEeBCXbIzwrEGl9Zr4qdh23jQKBgQCrDSAU8qvlcddDFVk7eZKAnGvd0gR61O5m8kOwaJcHb0zmwS9iP1+Pl7ZvBL0O4QGSGJrL6+UdabLwwmZuepK48pAauj9tqd7M9F6j2SwKqZoS30PFiN7bhKF5NYAOY891izyIsCNmDhohaMh29HR+B1yH7RtWW9d7Dpu4FOSytQKBgCtfuh++H9C2WCckzvZhQFTwzNuQ7XfCRAVAGCrkkvttLhYJ+untr9bewJ51YI0qgcnWsjXAu/6ylGmXfstv/E0D1a8E81Jr3X5iDJmkVCVJtMSVfRgBRCLc5a1Wx7Q+NVEVuRks+0Bt9FbJfjRZYygSIcnoDNgSI7i9kMdPKfK1AoGAJXK+L1fhol4GDr3Bx2+aT2Xvh6TPLkUn3In1n82GIy6O24Y35X6SYVGJs0yKR5OjUGTqnvKKOqJFdshYvJ9BOBSC0Bcug8fI634kqiKFrd/rx23x3HFWuSCUaYD5BC194fIV0qcdWN6FggL6wHBMgLsD2w5iCcoZputP1EFewHECgYB2t+RikJ4FqNkRg/WPsRUEkpOOwoxVqYE1VNxatXCXji2dDDPU+EccjnCXBAjv56HOJRzn8Ln+2q/vFVELc0KTTwy4EBnvxDCpVuAUSLRtpOivN7dFqQnsASbi9WLpDZSWvP6AeabQPrbZkNTpnd2RsH2fvB2G1YlscJwe/scC8w==";
    //编码
    public static final String CHARSET = "UTF-8";
    //支付宝的公钥，不是应用公钥
    public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAogUh5+W8fiMqp6egz9jDMHkXrUGGnKKYob0+7PAVxTAvJAzDQbRLWZNDstFPHe6WkTH2OfdGBwULaHXkm4ftvZIakaGOCDYRVMlJa/3llR/SVDDPr47d86UY0eGMmKRwNPwBmPaIyQEnEdiRcVWHCG2yVBLD6AqK2wAj62U1NYVixNJf6p3UQFzco8Dc84KVKbVfwOJ8J3CvxMQHuAKraPoDxg/IPQq8fRNm7udEXb3wOd+gFCU2BWkjGdGS76NO1lupvD8yEiFZIAv4BBdPhaTVT8afO0kgUoVtrCrw1UAPJbFE8JXx6a6Hh3815NwvuZndfhsa8P07mJlhtlUnKQIDAQAB";
    //这是沙箱接口路径,正式环境下路径应该为https://openapi.alipay.com/gateway.do
    public static final String GATEWAY_URL = "https://openapi.alipaydev.com/gateway.do";
    //响应格式
    public static final String FORMAT = "JSON";
    //签名方式
    public static final String SIGN_TYPE = "RSA2";
    //支付宝异步通知路径,付款完毕后会异步调用本项目的方法,必须为公网地址
    public static final String NOTIFY_URL = "http://5kz4c7.natappfree.cc/ssm/alipaySandboxie";
    //支付宝同步通知路径,也就是当付款完毕后跳转本项目的页面,可以不是公网地址
    public static final String RETURN_URL = "http://127.0.0.1:8088/ssm/return";
    //日志路径
    public static final String log_path = "/log";

}
