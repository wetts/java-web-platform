## HDFS

分布式文件系统，提供高吞吐量的应用程序数据访问，对外部客户机而言，HDFS 就像一个传统的分级文件系统。可以创建、删除、移动或重命名文件，等等。但是 HDFS 的架构是基于一组特定的节点构建的，这是由它自身的特点决定的。这些节点包括 NameNode（仅一个），它在 HDFS 内部提供元数据服务；DataNode，它为 HDFS 提供存储块。由于仅存在一个 NameNode，因此这是 HDFS 的一个缺点（单点失败）。

存储在 HDFS 中的文件被分成块，然后将这些块复制到多个计算机中（DataNode）。这与传统的 RAID 架构大不相同。块的大小（通常为 64MB）和复制的块数量在创建文件时由客户机决定。NameNode 可以控制所有文件操作。HDFS 内部的所有通信都基于标准的 TCP/IP 协议。

## MapReduce 

一个分布式海量数据处理的软件框架集计算集群。 

## HBase 

基于Hadoop Distributed File System，是一个开源的，基于列存储模型的可扩展的分布式数据库，支持大型表的存储结构化数据。

## Hive 

类似CloudBase，也是基于hadoop分布式计算平台上的提供data warehouse的sql功能的一套软件。使得存储在hadoop里面的海量数据的汇总，即席查询简单化。hive提供了一套QL的查询语言，以sql为基础，使用起来很方便。

## Pig 

是一个并行计算的高级的数据流语言和执行框架 ，SQL-like语言，是在MapReduce上构建的一种高级查询语言，把一些运算编译进MapReduce模型的Map和Reduce中，并且用户可以定义自己的功能。

Pig可以非常方便的处理HDFS和HBase的数据，和Hive一样,Pig可以非常高效的处理其需要做的，通过直接操作Pig查询可以节省大量的劳动和时间。当你想在你的数据上做一些转换，并且不想编写MapReduce jobs就可以用Pig。

## ZooKeeper 

Google的Chubby一个开源的实现。它是一个针对大型分布式系统的可靠协调系统，提供的功能包括：配置维护、名字服务、分布式同步、组服务等。ZooKeeper的目标就是封装好复杂易出错的关键服务，将简单易用的接口和性能高效、功能稳定的系统提供给用户。

## Avro 

doug cutting主持的RPC项目，主要负责数据的序列化。有点类似Google的protobuf和Facebook的thrift。avro用来做以后hadoop的RPC，使hadoop的RPC模块通信速度更快、数据结构更紧凑。

## Mahout 

一个可扩展的机器学习和数据挖掘库

## Cassandra 

无单点故障的可扩展的多主数据库

## Chukwa 

一个管理大型分布式系统的数据采集系统 由yahoo贡献。

---

## Pig VS Hive

Hive更适合于数据仓库的任务，Hive主要用于静态的结构以及需要经常分析的工作。Hive与SQL相似促使 其成为Hadoop与其他BI工具结合的理想交集。

Pig赋予开发人员在大数据集领域更多的灵活性，并允许开发简洁的脚本用于转换数据流以便嵌入到较大的 应用程序。

Pig相比Hive相对轻量，它主要的优势是相比于直接使用Hadoop Java APIs可大幅削减代码量。正因为如此，Pig仍然是吸引大量的软件开发人员。

Hive和Pig都可以与HBase组合使用，Hive和Pig还为HBase提供了高层语言支持，使得在HBase上进行数据统计处理变的非常简单。

## Hive VS HBase

Hive是建立在Hadoop之上为了减少MapReduce jobs编写工作的批处理系统，HBase是为了支持弥补Hadoop对实时操作的缺陷的项目。

想象你在操作RMDB数据库，如果是全表扫描，就用Hive+Hadoop，如果是索引访问，就用HBase+Hadoop。

Hive query就是MapReduce jobs可以从5分钟到数小时不止，HBase是非常高效的，肯定比Hive高效的多。