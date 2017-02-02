以下步骤用于感受重试机制
1. 增加重试的包listener和类Retry TestngRetryListener
2. 创建一个新的case类，xrtestcase,里边只有一条case，用于理解重试
3. 新建一个xml文件xrTestCase.xml，用于测试 重试。

以下步骤用于感受失败case截图并打log
1. 工 具包utils中加上截图工具。
2. 增加监听器Listener，继承TestListenerAdapter，重写 onTestFailure和onTestSuccess方法，失败的打Log并截图，图片名称为case类.method
3. 用xrtestcase及xrTestCase.xml作验证。
4. 未解决问题：log重复打1次

以下步骤用于试验ReportNG
1. 引入相关jar文件
2. 配置XML文件，加上ReportNG的监听器。

以下步骤用于配置Xpath
1. 创建config文件夹，一个pageobject类对应一个properties属性文件 ，存放页面上所有元素的Xpath
2. 创建一个xpath类，存放各个属性文件的路径。
3. utils包中加上类和方法，接收文件的路径和属性文件的key值，返回其value值，即Xpath

以下步骤用于布置Jenkins
1. 安装war,java -jar jenkins.war ,先检查8080端口是否被占用，netstat -ano
2. 将项目放到Git上
3. 配置Jenkins，使其自动运行

