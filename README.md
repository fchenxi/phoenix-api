# phoenix-api
Integrate the pehoneix with mybaits
1. build cloudera hadoop
http://blog.cloudera.com/blog/2015/11/new-apache-phoenix-4-5-2-package-from-clou
dera-labs/

http://blog.csdn.net/d6619309/article/details/50358309

2. Install phoenix
http://blog.cloudera.com/blog/2015/11/new-apache-phoenix-4-5-2-package-from-clou
dera-labs/
http://archive.cloudera.com/cloudera-labs/phoenix/parcels/1.1/

2.1 secondary index
	
<property>
 <name>hbase.regionserver.wal.codec</name>
 <value>org.apache.hadoop.hbase.regionserver.wal.IndexedWALEditCodec</value>
</property>

3. Integrate the phoenix with mybaits
http://blog.csdn.net/tiantang_1986/article/details/49329425

3.1 use 
phoenix-sqlline.py cloud.cn:2181

4. hbase memory
http://www.cnblogs.com/shitouer/archive/2013/02/05/configuring-hbase-memstore-wh
at-you-should-know.html
http://blog.cloudera.com/blog/2012/06/hbase-io-hfile-input-output/

5. hbase online case
http://koven2049.iteye.com/category/148316

6. cdh-hbase1.0.0
hlog
hbase hlog -j /hbase/WALs/cloud.cn,60020,1470111690015/cloud.cn%2C60020%2C147011
1690015.null0.1470147715454

hfile
hbase/data/hbase/meta/1588230740/info/121e4dfc67674858a131cd833ae0603dnfo

http://blog.csdn.net/jet47/article/details/51996881
6.3 Integrate the quartz with oozie

http://www.mamicode.com/info-detail-1106773.html

7.kerberos for hbase

http://blog.csdn.net/wk022/article/details/50948523

kadmin.local: modprinc -maxrenewlife 7days krbtgt/ganglia.localdoamin/LOCALDOMAIN
kadmin.local: modprinc -maxrenewlife 1week krbtgt/HADOOP.COM@HADOOP.COM
