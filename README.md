# RPC
* RPC 的各种实现方式

* rmi/ RMI 实现远程调用，
\n 其中server提供远程服务， main 方法启动。
\n consumer 调用远程服务，是web启动，
\n api定义实体和接口。
\n master 为聚合项目，方便clean 和install
* hessian/ Hessian s实现远程调用
\n 其中 hessian-api 提供接口.
\n hessian-provider, web 服务，实现接口，暴露Hessian 服务
\n hessian-consumer, web 服务，调用Hessian 服务
