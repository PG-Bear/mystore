package icu.insomniac.mystore.demo.code;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;


public class MyCode {
    public static void main(String[] args) {
        generate();
    }
    public static  void generate() {
        AutoGenerator generator = new AutoGenerator();

        // 全局配置
        GlobalConfig config = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        // 设置输出到的目录
        config.setOutputDir(projectPath + "/src/main/java");
        config.setAuthor("kelex");
        config.setServiceName("%sService");
        config.setServiceImplName("%sServiceImpl");
        config.setMapperName("%sDao");
        // 生成结束后是否打开文件夹
        config.setOpen(true);
        //为模型对象生成结果映射
        config.setBaseResultMap(true);

        // 全局配置添加到 generator 上
        generator.setGlobalConfig(config);

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        //修改数据库名称
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/mystore?serverTimezone=UTC&useSSL=false");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("kelex");

        // 数据源配置添加到 generator
        generator.setDataSource(dataSourceConfig);

        // 包配置, 生成的代码放在哪个包下
        PackageConfig packageConfig = new PackageConfig();
        //修改为项目的包名称
        packageConfig.setParent("icu.insomniac.mystore.demo");
        packageConfig.setEntity("model");
        packageConfig.setMapper("dao");
        packageConfig.setXml("mapper");

        // 包配置添加到 generator
        generator.setPackageInfo(packageConfig);

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        // 下划线驼峰命名转换
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        // 开启lombok
        strategyConfig.setEntityLombokModel(true);
        // 开启RestController,注释了就是传统controller
        strategyConfig.setRestControllerStyle(true);
        //需要生成的表,注释了全部表生成代码
        // strategyConfig.setInclude(new String[]{"stu"});
        generator.setStrategy(strategyConfig);
        generator.setTemplateEngine(new FreemarkerTemplateEngine());

        // 开始生成
        generator.execute();
    }
}
