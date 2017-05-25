# XLogUtils


Android 轻量级简单易用的日志组件

    1 支持输出基本数据类型、数组、Map、List、Intent、Bundle，支持Json、XML格式化输出
    2 支持设置ANR拦截捕获，自动格式化保存在sdcard里面。
    3 自定义解析器，当输入类型无法满足需求时或无法解析时，可实现Parser接口重写方法来添加自定义解析器  
    4 参数配置采用Buidler模式
	
	
	
	使用方法：
	XLogUtilsLib为库
    XLogUtilsExample使用例子
	
	
    1 配置
        this.logConfig = LogConfig.Buidler
                .buidler()
                .setContext(this)
                .setOpen(true)
                .setTag("zzl-xlog")
                .build();
	2 设置ANR拦截捕获
     ThreadCatchInterceptor.getInstance().install(new ThreadCatchInterceptor.CallBack() {

            @Override
            public void error(Throwable throwable) {
                XLog.i(throwable);
            }

            @Override
            public void finish(String path) {
                XLog.i(path);
            }
        });	
   3 使用  XLog.d("mylog"); 
