/**
 * @author denchouka
 * @description 连接mysql的配置
 * @date 2024/8/14 21:59
 */
public class DataSource {

    private static final String USERNAME =  "root";

    private static final String PASSWORD = "mysql830";

    // private static final String URL = "jdbc:mysql://127.0.0.1:3306/xc_content?characterEncoding=UTF-8&useUnicode=true&useSSL=false&serverTimezone=Asia/Shanghai&tinyInt1isBit=false&allowPublicKeyRetrieval=true";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/xc_content";

    private static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";

    public static String getUserName() {
        return USERNAME;
    }

    public static String getPassword() {
        return PASSWORD;
    }

    public static String getUrl() {
        return URL;
    }

    public static String getDriverClassName() {
        return DRIVER_CLASS_NAME;
    }

}
