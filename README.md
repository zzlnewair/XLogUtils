# XLogUtils


Android �����������õ���־���

    1 ֧����������������͡����顢Map��List��Intent��Bundle��֧��Json��XML��ʽ�����
    2 ֧������ANR���ز����Զ���ʽ��������sdcard���档
    3 �Զ���������������������޷���������ʱ���޷�����ʱ����ʵ��Parser�ӿ���д����������Զ��������  
    4 �������ò���Buidlerģʽ
	
	
	
	ʹ�÷�����
	XLogUtilsLibΪ��
    XLogUtilsExampleʹ������
	
	
    1 ����
        this.logConfig = LogConfig.Buidler
                .buidler()
                .setContext(this)
                .setOpen(true)
                .setTag("zzl-xlog")
                .build();
	2 ����ANR���ز���
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
   3 ʹ��  XLog.d("mylog"); 
