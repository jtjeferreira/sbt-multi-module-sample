## Results

| run       | time |
|-----------|------|
| 22 modules (sbt 1.4.3) | 19s  |
| 22 modules (sbt 1.4.3) COURSIER_PROGRESS=false | 11s  |

## 22 modules sbt 1.4.3

```shell script
time sbt update                                                                                                        sáb 21 nov 2020 20:39:57
[info] welcome to sbt 1.4.3 (AdoptOpenJDK Java 11.0.8)
[info] loading settings for project global-plugins from plugins.sbt ...
[info] loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 0 sec
[info] loading project definition from /home/joao/git/sbt-multi-module-sample/project
[info] Total time: 0 sec
[info] loading settings for project root from build.sbt ...
[info] resolving key references (22991 settings) ...
[info] set current project to Scala Seed Project (in build file:/home/joao/git/sbt-multi-module-sample/)
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Total time: 18 sec
[info]   x12 / update : 12 sec
[info]   x1 / update  : 11 sec
[info]   x20 / update :  8 sec
[info]   x16 / update :  8 sec
[info]   x6 / update  :  8 sec
[info]   x11 / update :  8 sec
[info]   x17 / update :  7 sec
[info]   x8 / update  :  7 sec
[info]   x3 / update  :  7 sec
[info]   x5 / update  :  7 sec
[info]   x19 / update :  7 sec
[info]   x14 / update :  7 sec
[info]   x10 / update :  6 sec
[info]   x13 / update :  6 sec
[info]   x15 / update :  6 sec
[info]   x9 / update  :  6 sec
[info]   x4 / update  :  5 sec
[info]   x18 / update :  5 sec
[info]   x7 / update  :  5 sec
[info]   x2 / update  :  4 sec
[info]   core / update:  3 sec
[info]   util / update:  3 sec
[success] Total time: 19 s, completed Nov 21, 2020, 8:40:25 PM
[25,743s][info][gc,heap,exit] Heap
[25,743s][info][gc,heap,exit]  garbage-first heap   total 1048576K, used 533185K [0x00000000c0000000, 0x0000000100000000)
[25,743s][info][gc,heap,exit]   region size 1024K, 148 young (151552K), 15 survivors (15360K)
[25,743s][info][gc,heap,exit]  Metaspace       used 105983K, capacity 114728K, committed 116672K, reserved 1144832K
[25,743s][info][gc,heap,exit]   class space    used 16484K, capacity 20905K, committed 21964K, reserved 1048576K

________________________________________________________
Executed in   26,78 secs   fish           external 
   usr time   95,27 secs  276,00 micros   95,27 secs 
   sys time    3,84 secs   88,00 micros    3,84 secs 


```

## 22 modules sbt 1.4.3 COURSIER_PROGRESS=false

```
time sbt update                                                                                                         sáb 21 nov 2020 20:51:09
[info] welcome to sbt 1.4.3 (AdoptOpenJDK Java 11.0.8)
[info] loading settings for project global-plugins from plugins.sbt ...
[info] loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 0 sec
[info] loading project definition from /home/joao/git/sbt-multi-module-sample/project
[info] Total time: 0 sec
[info] loading settings for project root from build.sbt ...
[info] resolving key references (22991 settings) ...
[info] set current project to Scala Seed Project (in build file:/home/joao/git/sbt-multi-module-sample/)
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Total time: 10 sec
[info]   x11 / update : 4 sec
[info]   x17 / update : 4 sec
[info]   x9 / update  : 4 sec
[info]   x4 / update  : 4 sec
[info]   x14 / update : 3 sec
[info]   x15 / update : 3 sec
[info]   x16 / update : 3 sec
[info]   x18 / update : 3 sec
[info]   x2 / update  : 3 sec
[info]   x7 / update  : 3 sec
[info]   x6 / update  : 3 sec
[info]   x3 / update  : 3 sec
[info]   x19 / update : 2 sec
[info]   x1 / update  : 2 sec
[info]   x20 / update : 2 sec
[info]   x5 / update  : 2 sec
[info]   x8 / update  : 2 sec
[info]   x12 / update : 2 sec
[info]   x13 / update : 2 sec
[info]   core / update: 2 sec
[info]   util / update: 2 sec
[info]   x10 / update : 2 sec
[success] Total time: 11 s, completed Nov 21, 2020, 8:51:34 PM
[17,552s][info][gc,heap,exit] Heap
[17,552s][info][gc,heap,exit]  garbage-first heap   total 1048576K, used 827742K [0x00000000c0000000, 0x0000000100000000)
[17,552s][info][gc,heap,exit]   region size 1024K, 404 young (413696K), 5 survivors (5120K)
[17,552s][info][gc,heap,exit]  Metaspace       used 105853K, capacity 114587K, committed 119120K, reserved 1144832K
[17,552s][info][gc,heap,exit]   class space    used 16470K, capacity 20896K, committed 23252K, reserved 1048576K

________________________________________________________
Executed in   18,68 secs   fish           external 
   usr time  122,47 secs  260,00 micros  122,47 secs 
   sys time    3,58 secs   94,00 micros    3,58 secs 
```