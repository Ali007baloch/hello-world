# hello-world for bash

## how to get the path of currently executing program

``` bash
echo 'self-name: '$0
echo "self-path: "$(cd `dirname $0`; pwd)
echo "curr-path: "$(pwd)
```
which one is the right ?

the second: ``echo "self-path: "$(cd `dirname $0`; pwd)``

![the path of currently executing program](https://cloud.githubusercontent.com/assets/23731186/20923692/b053f34e-bbe8-11e6-99fc-8544c35040dc.png)

suppose a script named ``start.sh`` placed in ``/some/path/appname/bin/start.sh``, how to get ``appname`` in shell ?

``` bash
apppath=$(cd `dirname $0`; cd ..;  pwd)
appname=`echo $apppath | awk -F "/" '{print $NF}'`
echo $appname
```
---


## how to rm .svn in mac

- 查询后执行命令
``` bash
find . -name ".svn" -type d -exec rm -rf {} +
```


- 控制路径深度

``` bash
find . -name "*.pac" -type f -maxdepth 1 -exec ls -l {} +
find . -name "*.pac" -type f -maxdepth 1 -exec rm -rf {} +
```

- 正则表达式

``` bash 

$ find . -regex './j.*\.pac' -maxdepth 1
./jiagou.pac

```
- 删除几天前

``` bash
#delete files modified min 20 ago
/usr/bin/find /opt/rsync/liveimg/eden/ -maxdepth 1 -type f -regex '/opt/rsync/liveimg/eden/.*\.jpg' -mmin +20 -delete;
```

----

## mac 默认shell

```
$ cat /etc/shells  # shell列表
$ chsh -s /bin/zsh   #修改默认shell为zsh
```

upgrade bash to version 4.X on mac
http://www.tuicool.com/articles/EjIrmmN
