## Single module with spark dependency

around 5s

```shell script
~/g/scala-seed-project (master|●8✚1) $ sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Total time: 5 sec
[info]   root / update: 5 sec
[success] Total time: 5 s, completed Apr 18, 2020, 7:12:21 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace
~/g/scala-seed-project (master|●8✚1) $ time sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Total time: 5 sec
[info]   root / update: 5 sec
[success] Total time: 6 s, completed Apr 18, 2020, 7:12:50 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace

________________________________________________________
Executed in   18.29 secs   fish           external 
   usr time   49.79 secs  354.00 micros   49.79 secs 
   sys time    2.17 secs  167.00 micros    2.17 secs 
```

## 2 modules

around 7s

```shell script
~/g/scala-seed-project (master|✚1) $ sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Total time: 8 sec
[info]   core / update: 5 sec
[info]   root / update: 2 sec
[success] Total time: 8 s, completed Apr 18, 2020, 7:17:20 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace
~/g/scala-seed-project (master|✚1) $ time sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Total time: 7 sec
[info]   core / update: 4 sec
[info]   root / update: 2 sec
[success] Total time: 8 s, completed Apr 18, 2020, 7:19:48 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace

________________________________________________________
Executed in   20.87 secs   fish           external 
   usr time   57.33 secs  272.00 micros   57.33 secs 
   sys time    2.11 secs  110.00 micros    2.11 secs
```

## 3 modules

around 9s

```shell script
~/g/scala-seed-project (master|✚1) $ sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Total time: 9 sec
[info]   util / update: 7 sec
[info]   core / update: 6 sec
[info]   root / update: 2 sec
[success] Total time: 10 s, completed Apr 18, 2020, 7:27:07 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace
~/g/scala-seed-project (master|✚1) $ time sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Total time: 9 sec
[info]   core / update: 7 sec
[info]   util / update: 6 sec
[info]   root / update: 2 sec
[success] Total time: 10 s, completed Apr 18, 2020, 7:27:46 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace

________________________________________________________
Executed in   22.69 secs   fish           external 
   usr time   64.79 secs  273.00 micros   64.79 secs 
   sys time    2.19 secs  121.00 micros    2.19 secs 
```

## 7 modules

around 17s

```shell script
~/g/scala-seed-project (master|✔) $ sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Total time: 19 sec
[info]   x5 / update  : 8 sec
[info]   core / update: 7 sec
[info]   x1 / update  : 7 sec
[info]   util / update: 6 sec
[info]   x2 / update  : 6 sec
[info]   x4 / update  : 5 sec
[info]   x3 / update  : 3 sec
[info]   root / update: 2 sec
[success] Total time: 19 s, completed Apr 18, 2020, 9:29:13 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace
~/g/scala-seed-project (master|✚1) $ time sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Total time: 17 sec
[info]   x2 / update  : 8 sec
[info]   x5 / update  : 8 sec
[info]   core / update: 6 sec
[info]   util / update: 6 sec
[info]   x3 / update  : 5 sec
[info]   x4 / update  : 4 sec
[info]   x1 / update  : 2 sec
[success] Total time: 17 s, completed Apr 18, 2020, 9:32:54 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace

________________________________________________________
Executed in   31.17 secs   fish           external 
   usr time   88.23 secs    0.00 micros   88.23 secs 
   sys time    3.15 secs  543.00 micros    3.15 secs 

```

## 12 modules

around 25s

```shell script
~/g/scala-seed-project (master|✚1) $ sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Resolving key references (11438 settings) ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
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
[info] Total time: 24 sec
[info]   x2 / update  : 9 sec
[info]   x3 / update  : 7 sec
[info]   x1 / update  : 7 sec
[info]   util / update: 7 sec
[info]   core / update: 6 sec
[info]   x4 / update  : 6 sec
[info]   x9 / update  : 6 sec
[info]   x7 / update  : 5 sec
[info]   x10 / update : 5 sec
[info]   x8 / update  : 4 sec
[info]   x6 / update  : 3 sec
[info]   x5 / update  : 2 sec
[success] Total time: 25 s, completed Apr 18, 2020, 9:36:00 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace
~/g/scala-seed-project (master|✚1) $ time sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Resolving key references (11438 settings) ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
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
[info] Total time: 24 sec
[info]   x10 / update : 10 sec
[info]   x2 / update  :  9 sec
[info]   x5 / update  :  7 sec
[info]   x1 / update  :  6 sec
[info]   util / update:  6 sec
[info]   x6 / update  :  6 sec
[info]   core / update:  6 sec
[info]   x7 / update  :  4 sec
[info]   x8 / update  :  3 sec
[info]   x4 / update  :  3 sec
[info]   x3 / update  :  3 sec
[info]   x9 / update  :  3 sec
[success] Total time: 24 s, completed Apr 18, 2020, 9:37:58 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace

________________________________________________________
Executed in   39.32 secs   fish           external 
   usr time  110.61 secs  343.00 micros  110.61 secs 
   sys time    3.43 secs  182.00 micros    3.43 secs 

```


## 22 modules

around 35s

```shell script
~/g/scala-seed-project (master|✚2) $ time sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 5 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 1 sec
[info] Loading settings for project root from build.sbt ...
[info] Resolving key references (19978 settings) ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
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
[info] Total time: 35 sec
[info]   x5 / update  : 11 sec
[info]   x19 / update : 10 sec
[info]   x10 / update :  8 sec
[info]   x20 / update :  8 sec
[info]   util / update:  6 sec
[info]   core / update:  6 sec
[info]   x16 / update :  6 sec
[info]   x8 / update  :  5 sec
[info]   x14 / update :  5 sec
[info]   x18 / update :  5 sec
[info]   x4 / update  :  5 sec
[info]   x9 / update  :  4 sec
[info]   x12 / update :  4 sec
[info]   x11 / update :  4 sec
[info]   x17 / update :  4 sec
[info]   x2 / update  :  3 sec
[info]   x7 / update  :  3 sec
[info]   x3 / update  :  3 sec
[info]   x13 / update :  2 sec
[info]   x6 / update  :  2 sec
[info]   x1 / update  :  2 sec
[success] Total time: 36 s, completed Apr 18, 2020, 10:01:58 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace

________________________________________________________
Executed in   68.75 secs   fish           external 
   usr time  143.44 secs  834.00 micros  143.44 secs 
   sys time    4.79 secs  431.00 micros    4.79 secs 

~/g/scala-seed-project (master|✚2) $ time sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Resolving key references (19978 settings) ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
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
[info] Total time: 34 sec
[info]   x7 / update  : 9 sec
[info]   x19 / update : 9 sec
[info]   core / update: 6 sec
[info]   x14 / update : 6 sec
[info]   util / update: 6 sec
[info]   x18 / update : 6 sec
[info]   x17 / update : 6 sec
[info]   x12 / update : 5 sec
[info]   x1 / update  : 5 sec
[info]   x13 / update : 5 sec
[info]   x8 / update  : 5 sec
[info]   x16 / update : 4 sec
[info]   x3 / update  : 3 sec
[info]   x2 / update  : 3 sec
[info]   x5 / update  : 3 sec
[info]   x11 / update : 3 sec
[info]   x6 / update  : 3 sec
[info]   x4 / update  : 3 sec
[info]   x10 / update : 3 sec
[info]   x20 / update : 2 sec
[info]   x9 / update  : 2 sec
[info]   x15 / update : 2 sec
[success] Total time: 34 s, completed Apr 18, 2020, 10:04:00 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace

________________________________________________________
Executed in   50.64 secs   fish           external 
   usr time  132.09 secs  331.00 micros  132.09 secs 
   sys time    4.67 secs  173.00 micros    4.67 secs 

```

## 22 modules (but only core and util depends on spark)

around 35s like before

```shell script
~/g/scala-seed-project (master|✚2) $ sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Resolving key references (19936 settings) ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
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
[info] Total time: 33 sec
[info]   x13 / update : 8 sec
[info]   x17 / update : 8 sec
[info]   x7 / update  : 8 sec
[info]   x8 / update  : 8 sec
[info]   core / update: 7 sec
[info]   util / update: 6 sec
[info]   x20 / update : 6 sec
[info]   x2 / update  : 5 sec
[info]   x4 / update  : 5 sec
[info]   x11 / update : 4 sec
[info]   x6 / update  : 4 sec
[info]   x16 / update : 4 sec
[info]   x5 / update  : 4 sec
[info]   x15 / update : 3 sec
[info]   x1 / update  : 3 sec
[info]   x18 / update : 3 sec
[info]   x10 / update : 2 sec
[info]   x3 / update  : 2 sec
[info]   x12 / update : 2 sec
[info]   x14 / update : 2 sec
[success] Total time: 34 s, completed Apr 18, 2020, 10:36:46 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace
~/g/scala-seed-project (master|✚2) $ time sbt update
[info] Loading settings for project global-plugins from sbt-updates.sbt,plugins.sbt,idea.sbt ...
[info] Loading global plugins from /home/joao/.sbt/1.0/plugins
[info] Total time: 2 sec
[info] Loading project definition from /home/joao/git/scala-seed-project/project
[info] Total time: 0 sec
[info] Loading settings for project root from build.sbt ...
[info] Resolving key references (19936 settings) ...
[info] Set current project to Scala Seed Project (in build file:/home/joao/git/scala-seed-project/)
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
[info] Total time: 0 sec
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
[info] Total time: 34 sec
[info]   x15 / update : 11 sec
[info]   x7 / update  :  8 sec
[info]   x2 / update  :  8 sec
[info]   x3 / update  :  7 sec
[info]   core / update:  6 sec
[info]   x1 / update  :  5 sec
[info]   util / update:  5 sec
[info]   x5 / update  :  5 sec
[info]   x6 / update  :  5 sec
[info]   x11 / update :  5 sec
[info]   x12 / update :  5 sec
[info]   x13 / update :  4 sec
[info]   x17 / update :  4 sec
[info]   x8 / update  :  3 sec
[info]   x14 / update :  3 sec
[info]   x20 / update :  3 sec
[info]   x10 / update :  2 sec
[info]   x9 / update  :  2 sec
[info]   x16 / update :  2 sec
[info]   x18 / update :  2 sec
[info]   x4 / update  :  2 sec
[info]   x19 / update :  2 sec
[success] Total time: 34 s, completed Apr 18, 2020, 10:38:58 PM
wrote /home/joao/git/scala-seed-project/target/traces/build.trace

________________________________________________________
Executed in   50.06 secs   fish           external 
   usr time  130.31 secs  146.68 millis  130.17 secs 
   sys time    4.10 secs    0.00 millis    4.10 secs 

```
