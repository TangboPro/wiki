package com.tang.wiki.role;

import com.tang.wiki.common.utils.MybatisGeneratorUtil;

import java.util.HashMap;
import java.util.Map;

public class Generator {
    private static String MODULE = "role";
    private static String DATABASE = "wiki";
    private static String TABLE_PREFIX = "sys";
    private static String PACKAGE_NAME = "com.tang.wiki.role";
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/";
    private static String JDBC_USERNAME = "root";
    private static String JDBC_PASSWORD = "1263656881";
    private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<String, String>();
    public static void main(String[] args) throws Exception {
        LAST_INSERT_ID_TABLES.put("sys_group","id");
        LAST_INSERT_ID_TABLES.put("sys_group_permission","id");
        LAST_INSERT_ID_TABLES.put("sys_permission","id");
        LAST_INSERT_ID_TABLES.put("sys_role","id");
        LAST_INSERT_ID_TABLES.put("sys_role_group","id");
        LAST_INSERT_ID_TABLES.put("sys_role_permission","id");
        LAST_INSERT_ID_TABLES.put("sys_user","id");
        LAST_INSERT_ID_TABLES.put("sys_user_group","id");
        LAST_INSERT_ID_TABLES.put("sys_user_permission","id");
        MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);
    }
//    public static void main(String[] args) throws Exception {
//        //MBG 执行过程中的警告信息
//        List<String> warnings = new ArrayList<String>();
//        //当生成的代码重复时，覆盖原代码
//        boolean overwrite = true;
//        //读取我们的 MBG 配置文件
//        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(is);
//        is.close();
//
//        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//        //创建 MBG
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        //执行生成代码
//        myBatisGenerator.generate(null);
//        //输出警告信息
//        for (String warning : warnings) {
//            System.out.println(warning);
//        }
//    }
}
