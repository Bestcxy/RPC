# RPC
* RPC 的各种实现方式

* rmi/ RMI 实现远程调用，
其中server提供远程服务， main 方法启动。


consumer 调用远程服务，是web启动，


api定义实体和接口。


master 为聚合项目，方便clean 和install


* hessian/ Hessian 实现远程调用


其中 hessian-api 提供接口.


hessian-provider, web 服务，实现接口，暴露Hessian 服务


hessian-consumer, web 服务，调用Hessian 服务

* httpinvoker-master/ HttpInvoker 实现远程调用


其中 httpinvoker-api 提供接口.


httpinvoker-provider, web 服务，实现接口，暴露HttpInvoker 服务


httpinvoker-consumer, web 服务，调用HttpInvoker 服务
