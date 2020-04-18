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
