# mybatis 自动生成代码
## 在 “Command line” 选项中输入“mybatis-generator:generate  -e”

> 这里加了“-e ”选项是为了让该插件输出详细信息，这样可以帮助我们定位问题。

# 动态数据源路由使用
@DataSourcePolicy 指定切换规则
> DataSourceSelectPolicy
>> 1. DataSourceSelectPolicy.AUTO 自动选择
>> 2. DataSourceSelectPolicy.MANUAL 手动选择

> Type 数据库自动选择类型（DataSourceSelectPolicy 设置为 AUTO 生效）