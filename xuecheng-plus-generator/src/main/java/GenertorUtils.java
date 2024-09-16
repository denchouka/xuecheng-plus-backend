import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author denchouka
 * @description 自动生成代码的工具类
 * @date 2024/8/15 23:17
 */
public class GenertorUtils {

    /**
     * 生成代码的共通方法
     * @param schemaName schema名
     * @param hasEntity 是否生成Entity类
     * @param hasMapper 是否生成Mapper类 (包括xml)
     * @param hasXml 是否生成MapperXml
     * @param hasService 是否生成Service类 (包括impl)
     * @param hasController 是否生成Controller类
     * @param tableNames 要自动生成代码的表名
     */
    public static void genertorCommon(String schemaName, boolean hasEntity, boolean hasMapper, boolean hasXml, boolean hasService, boolean hasController, String... tableNames) {
        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/xuecheng-plus-generator/src/main/java/");
        globalConfig.setAuthor("denchouka");
        // 生成后不打开
        globalConfig.setOpen(false);

        // 数据库配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl(DataSource.getUrl());
        dataSourceConfig.setUsername(DataSource.getUserName());
        dataSourceConfig.setPassword(DataSource.getPassword());
        dataSourceConfig.setDriverName(DataSource.getDriverClassName());

        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(schemaName + ".com.xuecheng");
        packageConfig.setEntity("po");

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setEntityBooleanColumnRemoveIsPrefix(true);
        strategyConfig.setEntityTableFieldAnnotationEnable(true);
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setCapitalMode(true);
        strategyConfig.setInclude(tableNames);

        // 模板配置
        TemplateConfig templateConfig = new TemplateConfig();
        if (!hasEntity) templateConfig.disable(TemplateType.ENTITY);
        if (!hasMapper) templateConfig.disable(TemplateType.MAPPER);
        if (!hasXml) templateConfig.disable(TemplateType.XML);
        if (!hasService) templateConfig.disable(TemplateType.SERVICE);
        if (!hasController) templateConfig.disable(TemplateType.CONTROLLER);

        // 生成
        AutoGenerator generator = new AutoGenerator();
        generator.setGlobalConfig(globalConfig);
        generator.setDataSource(dataSourceConfig);
        generator.setPackageInfo(packageConfig);
        generator.setStrategy(strategyConfig);
        generator.setTemplate(templateConfig);
        generator.execute();
    }
}
