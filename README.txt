对于cxf_demo3
可以按下面的命令运行
cmd进入windows命令行
cd 到cxf_demo3 工程下面 使用mvn clean install 编译cxf_demo3
然后开启两个cmd窗口，分别进入到cxf_demo3下面
一个窗口先执行mvn -Pserver
另外一个窗口执行mvn -Pclient
这时候可以观察server和client命令行里面的变化了
