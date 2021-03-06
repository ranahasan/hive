set datanucleus.cache.collections=false;
set hive.stats.autogather=false;
set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;

create table analyze_srcpart like srcpart;
insert overwrite table analyze_srcpart partition (ds, hr) select * from srcpart where ds is not null;

explain analyze table analyze_srcpart PARTITION(ds='2008-04-08',hr) compute statistics;

analyze table analyze_srcpart PARTITION(ds='2008-04-08',hr) compute statistics;

describe extended analyze_srcpart PARTITION(ds='2008-04-08',hr=11);
describe extended analyze_srcpart PARTITION(ds='2008-04-08',hr=12);

describe extended analyze_srcpart;
