## Results

| run                                            | time | update task |
|------------------------------------------------|------|-------------|
| 60 modules (sbt 1.5.8)                         | 36s  | 26s         |
| 60 modules (sbt 1.5.8) COURSIER_PROGRESS=false | 25s  | 15s         |
| 60 modules (sbt 1.7.3)                         | 31s  | 22s         |
| 60 modules (sbt 1.7.3) COURSIER_PROGRESS=false | 18s  | 9s          |

## 60 modules sbt 1.5.8

```
time sbt update
WARNING: A terminally deprecated method in java.lang.System has been called
WARNING: System::setSecurityManager has been called by sbt.TrapExit$ (file:/Users/joao/.sbt/boot/scala-2.12.14/org.scala-sbt/sbt/1.5.8/run_2.12-1.5.8.jar)
WARNING: Please consider reporting this to the maintainers of sbt.TrapExit$
WARNING: System::setSecurityManager will be removed in a future release
[info] welcome to sbt 1.5.8 (Homebrew Java 17.0.4.1)
[info] loading project definition from /Users/joao/git/sbt-multi-module-sample/project
[info] Total time: 0 sec
[info] loading settings for project root from build.sbt ...
[info] resolving key references (48263 settings) ...
[info] set current project to Scala Seed Project (in build file:/Users/joao/git/sbt-multi-module-sample/)
[debug] not up to date. inChanged = false, force = true
[debug] Updating util...
[debug] not up to date. inChanged = false, force = true
[debug] Updating core...
[debug] Done updating util
[debug] Done updating core
[debug] not up to date. inChanged = false, force = true
[debug] Updating x55...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x24...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x44...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x10...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x47...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x56...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x11...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x43...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x33...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x57...
[debug] Done updating x57
[debug] Done updating x33
[debug] not up to date. inChanged = false, force = true
[debug] Updating x21...
[debug] Done updating x11
[debug] not up to date. inChanged = false, force = true
[debug] Updating x40...
[debug] Done updating x43
[debug] not up to date. inChanged = false, force = true
[debug] Updating x16...
[debug] Done updating x56
[debug] not up to date. inChanged = false, force = true
[debug] Updating x1...
[debug] Done updating x47
[debug] not up to date. inChanged = false, force = true
[debug] Updating x23...
[debug] Done updating x10
[debug] not up to date. inChanged = false, force = true
[debug] Updating x6...
[debug] Done updating x44
[debug] not up to date. inChanged = false, force = true
[debug] Updating x7...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x53...
[debug] Done updating x55
[debug] not up to date. inChanged = false, force = true
[debug] Updating x31...
[debug] Done updating x24
[debug] Done updating x53
[debug] not up to date. inChanged = false, force = true
[debug] Updating x60...
[debug] Done updating x7
[debug] not up to date. inChanged = false, force = true
[debug] Updating x13...
[debug] Done updating x6
[debug] not up to date. inChanged = false, force = true
[debug] Updating x17...
[debug] Done updating x23
[debug] not up to date. inChanged = false, force = true
[debug] Updating x14...
[debug] Done updating x1
[debug] not up to date. inChanged = false, force = true
[debug] Updating x4...
[debug] Done updating x16
[debug] not up to date. inChanged = false, force = true
[debug] Updating x42...
[debug] Done updating x40
[debug] not up to date. inChanged = false, force = true
[debug] Updating x3...
[debug] Done updating x21
[debug] not up to date. inChanged = false, force = true
[debug] Updating x8...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x45...
[debug] Done updating x45
[debug] Done updating x8
[debug] not up to date. inChanged = false, force = true
[debug] Updating x41...
[debug] Done updating x3
[debug] not up to date. inChanged = false, force = true
[debug] Updating x39...
[debug] Done updating x42
[debug] not up to date. inChanged = false, force = true
[debug] Updating x2...
[debug] Done updating x4
[debug] not up to date. inChanged = false, force = true
[debug] Updating x38...
[debug] Done updating x14
[debug] not up to date. inChanged = false, force = true
[debug] Updating x51...
[debug] Done updating x17
[debug] not up to date. inChanged = false, force = true
[debug] Updating x18...
[debug] Done updating x13
[debug] not up to date. inChanged = false, force = true
[debug] Updating x59...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x5...
[debug] Done updating x31
[debug] not up to date. inChanged = false, force = true
[debug] Updating x36...
[debug] Done updating x2
[debug] not up to date. inChanged = false, force = true
[debug] Updating x32...
[debug] Done updating x60
[debug] Done updating x5
[debug] not up to date. inChanged = false, force = true
[debug] Updating x54...
[debug] Done updating x59
[debug] not up to date. inChanged = false, force = true
[debug] Updating x48...
[debug] Done updating x18
[debug] not up to date. inChanged = false, force = true
[debug] Updating x29...
[debug] Done updating x51
[debug] not up to date. inChanged = false, force = true
[debug] Updating x49...
[debug] Done updating x38
[debug] not up to date. inChanged = false, force = true
[debug] Updating x12...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x27...
[debug] Done updating x39
[debug] Done updating x41
[debug] not up to date. inChanged = false, force = true
[debug] Updating x50...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x37...
[debug] Done updating x32
[debug] not up to date. inChanged = false, force = true
[debug] Updating x30...
[debug] Done updating x37
[debug] Done updating x50
[debug] not up to date. inChanged = false, force = true
[debug] Updating x58...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x9...
[debug] Done updating x27
[debug] Done updating x12
[debug] not up to date. inChanged = false, force = true
[debug] Updating x26...
[debug] Done updating x49
[debug] not up to date. inChanged = false, force = true
[debug] Updating x52...
[debug] Done updating x29
[debug] not up to date. inChanged = false, force = true
[debug] Updating x20...
[debug] Done updating x48
[debug] not up to date. inChanged = false, force = true
[debug] Updating x35...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x15...
[debug] Done updating x36
[debug] not up to date. inChanged = false, force = true
[debug] Updating x19...
[debug] Done updating x30
[debug] not up to date. inChanged = false, force = true
[debug] Updating x28...
[debug] Done updating x54
[debug] Done updating x15
[debug] not up to date. inChanged = false, force = true
[debug] Updating x46...
[debug] Done updating x35
[debug] not up to date. inChanged = false, force = true
[debug] Updating x34...
[debug] Done updating x20
[debug] not up to date. inChanged = false, force = true
[debug] Updating x25...
[debug] Done updating x52
[debug] not up to date. inChanged = false, force = true
[debug] Updating x22...
[debug] Done updating x26
[debug] Done updating x9
[debug] Done updating x58
[debug] Done updating x28
[debug] Done updating x22
[debug] Done updating x25
[debug] Done updating x34
[debug] Done updating x19
[debug] Done updating x46
[debug] not up to date. inChanged = false, force = true
[debug] Updating ...
[debug] Done updating
[info] Total time: 25 sec
[info]   x31 / update: 6 sec
[info]   x60 / update: 6 sec
[info]   x24 / update: 6 sec
[info]   x54 / update: 6 sec
[info]   x36 / update: 6 sec
[info]   x55 / update: 5 sec
[info]   x44 / update: 4 sec
[info]   x13 / update: 4 sec
[info]   x48 / update: 4 sec
[info]   x41 / update: 4 sec
[info]   x10 / update: 4 sec
[info]   x21 / update: 4 sec
[info]   x47 / update: 3 sec
[info]   x58 / update: 3 sec
[info]   x17 / update: 3 sec
[info]   x29 / update: 3 sec
[info]   x39 / update: 3 sec
[info]   x56 / update: 3 sec
[info]   x40 / update: 3 sec
[info]   x19 / update: 3 sec
[info]   x9 / update : 3 sec
[info]   x43 / update: 3 sec
[info]   x14 / update: 3 sec
[info]   x32 / update: 3 sec
[info]   x49 / update: 3 sec
[info]   x11 / update: 3 sec
[info]   x16 / update: 3 sec
[info]   x33 / update: 3 sec
[info]   x4 / update : 3 sec
[info]   x12 / update: 3 sec
[info]   x57 / update: 3 sec
[info]   x1 / update : 3 sec
[info]   x38 / update: 3 sec
[info]   x27 / update: 3 sec
[info]   x42 / update: 3 sec
[info]   x26 / update: 3 sec
[info]   x51 / update: 3 sec
[info]   x23 / update: 3 sec
[info]   x3 / update : 3 sec
[info]   x52 / update: 3 sec
[info]   x18 / update: 3 sec
[info]   x6 / update : 3 sec
[info]   x8 / update : 2 sec
[info]   x20 / update: 2 sec
[info]   x30 / update: 2 sec
[info]   x59 / update: 2 sec
[info]   x7 / update : 2 sec
[info]   x50 / update: 2 sec
[info]   x28 / update: 2 sec
[info]   x46 / update: 2 sec
[info]   x45 / update: 2 sec
[info]   x35 / update: 2 sec
[info]   x5 / update : 2 sec
[info]   x53 / update: 2 sec
[info]   x37 / update: 2 sec
[info]   x15 / update: 2 sec
[info]   x34 / update: 2 sec
[info]   x2 / update : 2 sec
[info]   x25 / update: 2 sec
[info]   x22 / update: 2 sec
[success] Total time: 26 s, completed Nov 9, 2022, 4:43:36 PM
[35.686s][info][gc,heap,exit] Heap
[35.686s][info][gc,heap,exit]  garbage-first heap   total 2017280K, used 777483K [0x0000000700000000, 0x0000000800000000)
[35.686s][info][gc,heap,exit]   region size 2048K, 65 young (133120K), 24 survivors (49152K)
[35.686s][info][gc,heap,exit]  Metaspace       used 90971K, committed 91520K, reserved 1130496K
[35.686s][info][gc,heap,exit]   class space    used 12629K, committed 12864K, reserved 1048576K

________________________________________________________
Executed in   36.00 secs    fish           external
   usr time   72.71 secs    0.14 millis   72.71 secs
   sys time    6.77 secs    1.46 millis    6.77 secs
```

## 60 modules sbt 1.5.8 COURSIER_PROGRESS=false

```
export COURSIER_PROGRESS=false
time sbt update
WARNING: A terminally deprecated method in java.lang.System has been called
WARNING: System::setSecurityManager has been called by sbt.TrapExit$ (file:/Users/joao/.sbt/boot/scala-2.12.14/org.scala-sbt/sbt/1.5.8/run_2.12-1.5.8.jar)
WARNING: Please consider reporting this to the maintainers of sbt.TrapExit$
WARNING: System::setSecurityManager will be removed in a future release
[info] welcome to sbt 1.5.8 (Homebrew Java 17.0.4.1)
[info] loading project definition from /Users/joao/git/sbt-multi-module-sample/project
[info] Total time: 0 sec
[info] loading settings for project root from build.sbt ...
[info] resolving key references (48263 settings) ...
[info] set current project to Scala Seed Project (in build file:/Users/joao/git/sbt-multi-module-sample/)
[debug] not up to date. inChanged = false, force = true
[debug] not up to date. inChanged = false, force = true
[debug] Updating core...
[debug] Updating util...
[debug] Done updating core
[debug] Done updating util
[debug] not up to date. inChanged = false, force = true
[debug] Updating x48...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x16...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x47...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x3...
[debug] not up to date. inChanged = false, force = true
[debug] not up to date. inChanged = false, force = true
[debug] Updating x53...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x28...
[debug] not up to date. inChanged = false, force = true
[debug] not up to date. inChanged = false, force = true
[debug] Updating x49...
[debug] Updating x51...
[debug] Updating x43...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x52...
[debug] Done updating x48
[debug] Done updating x47
[debug] Done updating x16
[debug] Done updating x28
[debug] Done updating x3
[debug] Done updating x51
[debug] Done updating x49
[debug] Done updating x52
[debug] Done updating x43
[debug] Done updating x53
[debug] not up to date. inChanged = false, force = true
[debug] Updating x34...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x40...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x45...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x55...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x31...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x27...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x46...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x8...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x44...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x37...
[debug] Done updating x34
[debug] Done updating x40
[debug] Done updating x8
[debug] Done updating x55
[debug] Done updating x31
[debug] Done updating x46
[debug] Done updating x44
[debug] Done updating x27
[debug] Done updating x37
[debug] Done updating x45
[debug] not up to date. inChanged = false, force = true
[debug] Updating x10...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x20...
[debug] not up to date. inChanged = false, force = true
[debug] not up to date. inChanged = false, force = true
[debug] Updating x5...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x21...
[debug] Updating x24...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x36...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x18...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x19...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x29...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x25...
[debug] Done updating x10
[debug] not up to date. inChanged = false, force = true
[debug] Updating x30...
[debug] Done updating x18
[debug] Done updating x20
[debug] Done updating x24
[debug] Done updating x19
[debug] Done updating x25
[debug] Done updating x36
[debug] Done updating x21
[debug] Done updating x29
[debug] Done updating x5
[debug] not up to date. inChanged = false, force = true
[debug] Updating x39...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x56...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x60...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x58...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x42...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x57...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x33...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x11...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x12...
[debug] Done updating x30
[debug] not up to date. inChanged = false, force = true
[debug] Updating x32...
[debug] Done updating x39
[debug] Done updating x56
[debug] Done updating x60
[debug] Done updating x58
[debug] Done updating x42
[debug] not up to date. inChanged = false, force = true
[debug] Updating x35...
[debug] Done updating x33
[debug] Done updating x57
[debug] Done updating x11
[debug] not up to date. inChanged = false, force = true
[debug] Updating x13...
[debug] Done updating x12
[debug] not up to date. inChanged = false, force = true
[debug] Updating x4...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x26...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x9...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x2...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x22...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x17...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x1...
[debug] Done updating x32
[debug] not up to date. inChanged = false, force = true
[debug] Updating x38...
[debug] Done updating x35
[debug] Done updating x13
[debug] not up to date. inChanged = false, force = true
[debug] Updating x7...
[debug] Done updating x26
[debug] not up to date. inChanged = false, force = true
[debug] Updating x23...
[debug] Done updating x9
[debug] Done updating x2
[debug] Done updating x17
[debug] Done updating x22
[debug] Done updating x4
[debug] Done updating x1
[debug] not up to date. inChanged = false, force = true
[debug] Updating x54...
[debug] Done updating x38
[debug] not up to date. inChanged = false, force = true
[debug] Updating x14...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x50...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x6...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x15...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x59...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x41...
[debug] Done updating x7
[debug] Done updating x23
[debug] Done updating x54
[debug] Done updating x14
[debug] Done updating x6
[debug] Done updating x50
[debug] Done updating x15
[debug] Done updating x59
[debug] Done updating x41
[debug] not up to date. inChanged = false, force = true
[debug] Updating ...
[debug] Done updating
[info] Total time: 14 sec
[info]   x40 / projectDescriptors: 5 sec
[info]   x43 / projectDescriptors: 5 sec
[info]   x47 / projectDescriptors: 5 sec
[info]   x45 / projectDescriptors: 5 sec
[info]   x31 / projectDescriptors: 5 sec
[info]   x25 / projectDescriptors: 5 sec
[info]   x54 / projectDescriptors: 5 sec
[info]   x51 / projectDescriptors: 5 sec
[info]   x30 / projectDescriptors: 5 sec
[info]   x28 / projectDescriptors: 5 sec
[success] Total time: 15 s, completed Nov 9, 2022, 4:45:18 PM
[25.102s][info][gc,heap,exit] Heap
[25.102s][info][gc,heap,exit]  garbage-first heap   total 3393536K, used 814758K [0x0000000700000000, 0x0000000800000000)
[25.102s][info][gc,heap,exit]   region size 2048K, 104 young (212992K), 19 survivors (38912K)
[25.102s][info][gc,heap,exit]  Metaspace       used 92544K, committed 93184K, reserved 1130496K
[25.102s][info][gc,heap,exit]   class space    used 13163K, committed 13440K, reserved 1048576K

________________________________________________________
Executed in   25.45 secs    fish           external
   usr time   84.54 secs    0.18 millis   84.54 secs
   sys time    7.49 secs    2.08 millis    7.49 secs
```

## 60 modules sbt 1.7.3

```
time sbt exit
[info] welcome to sbt 1.7.3 (Homebrew Java 17.0.4.1)
[info] loading project definition from /Users/joao/git/sbt-multi-module-sample/project
[info] Total time: 770 ms
[info] loading settings for project root from build.sbt ...
[info] resolving key references (48763 settings) ...
[info] set current project to Scala Seed Project (in build file:/Users/joao/git/sbt-multi-module-sample/)
[9.603s][info][gc,heap,exit] Heap
[9.603s][info][gc,heap,exit]  garbage-first heap   total 733184K, used 417177K [0x0000000700000000, 0x0000000800000000)
[9.603s][info][gc,heap,exit]   region size 2048K, 93 young (190464K), 10 survivors (20480K)
[9.603s][info][gc,heap,exit]  Metaspace       used 73084K, committed 73600K, reserved 1114112K
[9.603s][info][gc,heap,exit]   class space    used 10269K, committed 10496K, reserved 1048576K

________________________________________________________
Executed in    9.89 secs    fish           external
   usr time   17.59 secs    0.15 millis   17.59 secs
   sys time    1.10 secs    1.17 millis    1.09 secs

joao@nznotebook068 ~/g/sbt-multi-module-sample (master)> time sbt update
[info] welcome to sbt 1.7.3 (Homebrew Java 17.0.4.1)
[info] loading project definition from /Users/joao/git/sbt-multi-module-sample/project
[info] Total time: 768 ms
[info] loading settings for project root from build.sbt ...
[info] resolving key references (48763 settings) ...
[info] set current project to Scala Seed Project (in build file:/Users/joao/git/sbt-multi-module-sample/)
[debug] not up to date. inChanged = false, force = true
[debug] not up to date. inChanged = false, force = true
[debug] Updating util...
[debug] Updating core...
[debug] Done updating core
[debug] Done updating util
[debug] not up to date. inChanged = false, force = true
[debug] Updating x23...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x43...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x21...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x10...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x14...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x54...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x28...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x19...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x31...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x53...
[debug] Done updating x21
[debug] Done updating x28
[debug] not up to date. inChanged = false, force = true
[debug] Updating x15...
[debug] Done updating x10
[debug] not up to date. inChanged = false, force = true
[debug] Updating x45...
[debug] Done updating x54
[debug] not up to date. inChanged = false, force = true
[debug] Updating x22...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x18...
[debug] Done updating x23
[debug] not up to date. inChanged = false, force = true
[debug] Updating x39...
[debug] Done updating x53
[debug] Done updating x31
[debug] not up to date. inChanged = false, force = true
[debug] Updating x12...
[debug] Done updating x19
[debug] not up to date. inChanged = false, force = true
[debug] Updating x47...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x26...
[debug] Done updating x15
[debug] not up to date. inChanged = false, force = true
[debug] Updating x35...
[debug] Done updating x14
[debug] Done updating x39
[debug] not up to date. inChanged = false, force = true
[debug] Updating x51...
[debug] Done updating x18
[debug] not up to date. inChanged = false, force = true
[debug] Updating x36...
[debug] Done updating x45
[debug] not up to date. inChanged = false, force = true
[debug] Updating x33...
[debug] Done updating x22
[debug] not up to date. inChanged = false, force = true
[debug] Updating x16...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x24...
[debug] Done updating x43
[debug] Done updating x47
[debug] not up to date. inChanged = false, force = true
[debug] Updating x34...
[debug] Done updating x26
[debug] not up to date. inChanged = false, force = true
[debug] Updating x55...
[debug] Done updating x12
[debug] not up to date. inChanged = false, force = true
[debug] Updating x9...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x17...
[debug] Done updating x33
[debug] not up to date. inChanged = false, force = true
[debug] Updating x29...
[debug] Done updating x36
[debug] Done updating x16
[debug] not up to date. inChanged = false, force = true
[debug] Updating x58...
[debug] Done updating x35
[debug] not up to date. inChanged = false, force = true
[debug] Updating x7...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x13...
[debug] Done updating x55
[debug] not up to date. inChanged = false, force = true
[debug] Updating x4...
[debug] Done updating x24
[debug] not up to date. inChanged = false, force = true
[debug] Updating x20...
[debug] Done updating x9
[debug] Done updating x17
[debug] not up to date. inChanged = false, force = true
[debug] Updating x40...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x32...
[debug] Done updating x29
[debug] not up to date. inChanged = false, force = true
[debug] Updating x57...
[debug] Done updating x51
[debug] not up to date. inChanged = false, force = true
[debug] Updating x6...
[debug] Done updating x58
[debug] Done updating x7
[debug] not up to date. inChanged = false, force = true
[debug] Updating x38...
[debug] Done updating x13
[debug] not up to date. inChanged = false, force = true
[debug] Updating x11...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x25...
[debug] Done updating x34
[debug] Done updating x20
[debug] not up to date. inChanged = false, force = true
[debug] Updating x8...
[debug] Done updating x4
[debug] not up to date. inChanged = false, force = true
[debug] Updating x59...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x56...
[debug] Done updating x40
[debug] Done updating x32
[debug] not up to date. inChanged = false, force = true
[debug] Updating x27...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x1...
[debug] Done updating x25
[debug] not up to date. inChanged = false, force = true
[debug] Updating x30...
[debug] Done updating x38
[debug] Done updating x11
[debug] not up to date. inChanged = false, force = true
[debug] Updating x37...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x2...
[debug] Done updating x56
[debug] Done updating x8
[debug] not up to date. inChanged = false, force = true
[debug] Updating x42...
[debug] Done updating x59
[debug] not up to date. inChanged = false, force = true
[debug] Updating x44...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x49...
[debug] Done updating x57
[debug] Done updating x27
[debug] not up to date. inChanged = false, force = true
[debug] Updating x41...
[debug] Done updating x1
[debug] not up to date. inChanged = false, force = true
[debug] Updating x50...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x46...
[debug] Done updating x6
[debug] not up to date. inChanged = false, force = true
[debug] Updating x3...
[debug] Done updating x37
[debug] not up to date. inChanged = false, force = true
[debug] Updating x60...
[debug] Done updating x2
[debug] not up to date. inChanged = false, force = true
[debug] Updating x48...
[debug] Done updating x49
[debug] Done updating x44
[debug] not up to date. inChanged = false, force = true
[debug] Updating x52...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x5...
[debug] Done updating x42
[debug] Done updating x41
[debug] Done updating x46
[debug] Done updating x50
[debug] Done updating x30
[debug] Done updating x60
[debug] Done updating x48
[debug] Done updating x52
[debug] Done updating x3
[debug] Done updating x5
[debug] not up to date. inChanged = false, force = true
[debug] Updating ...
[debug] Done updating
[info] Total time: 21470 ms
[info]   x43 / update : 6546 ms
[info]   x14 / update : 5863 ms
[info]   x34 / update : 5051 ms
[info]   x51 / update : 4988 ms
[info]   x57 / update : 4579 ms
[info]   x6 / update  : 4224 ms
[info]   x30 / update : 4129 ms
[info]   x19 / update : 3781 ms
[info]   x31 / update : 3705 ms
[info]   x3 / update  : 3648 ms
[info]   x53 / update : 3612 ms
[info]   x23 / update : 3383 ms
[info]   x35 / update : 3256 ms
[info]   x54 / update : 3186 ms
[info]   x12 / update : 3168 ms
[info]   x45 / update : 3101 ms
[info]   x10 / update : 3099 ms
[info]   x22 / update : 3090 ms
[info]   x24 / update : 3044 ms
[info]   x28 / update : 2999 ms
[info]   x47 / update : 2928 ms
[info]   x26 / update : 2923 ms
[info]   x21 / update : 2910 ms
[info]   x4 / update  : 2894 ms
[info]   x42 / update : 2862 ms
[info]   x18 / update : 2840 ms
[info]   x9 / update  : 2815 ms
[info]   x17 / update : 2810 ms
[info]   x59 / update : 2803 ms
[info]   x8 / update  : 2803 ms
[info]   x27 / update : 2776 ms
[info]   x1 / update  : 2767 ms
[info]   x50 / update : 2690 ms
[info]   x58 / update : 2670 ms
[info]   x11 / update : 2658 ms
[info]   x13 / update : 2656 ms
[info]   x38 / update : 2653 ms
[info]   x7 / update  : 2652 ms
[info]   x41 / update : 2633 ms
[info]   x56 / update : 2574 ms
[info]   x39 / update : 2568 ms
[info]   x36 / update : 2554 ms
[info]   x46 / update : 2545 ms
[info]   x32 / update : 2524 ms
[info]   x40 / update : 2513 ms
[info]   x15 / update : 2497 ms
[info]   x16 / update : 2493 ms
[info]   x48 / update : 2435 ms
[info]   x20 / update : 2431 ms
[info]   x44 / update : 2428 ms
[info]   x49 / update : 2292 ms
[info]   x29 / update : 2268 ms
[info]   x60 / update : 2243 ms
[info]   x55 / update : 2219 ms
[info]   x25 / update : 2117 ms
[info]   x2 / update  : 2084 ms
[info]   x5 / update  : 1959 ms
[info]   x37 / update : 1878 ms
[info]   x33 / update : 1857 ms
[info]   x52 / update : 1810 ms
[info]   util / update: 1783 ms
[info]   core / update: 1718 ms
[success] Total time: 22 s, completed Nov 9, 2022, 5:14:46 PM
[31.584s][info][gc,heap,exit] Heap
[31.584s][info][gc,heap,exit]  garbage-first heap   total 1613824K, used 1154474K [0x0000000700000000, 0x0000000800000000)
[31.584s][info][gc,heap,exit]   region size 2048K, 280 young (573440K), 33 survivors (67584K)
[31.584s][info][gc,heap,exit]  Metaspace       used 88207K, committed 88832K, reserved 1130496K
[31.584s][info][gc,heap,exit]   class space    used 12338K, committed 12608K, reserved 1048576K

________________________________________________________
Executed in   31.89 secs    fish           external
   usr time   69.92 secs    0.16 millis   69.92 secs
   sys time    6.74 secs    1.38 millis    6.74 secs

```

## 60 modules sbt 1.7.3 COURSIER_PROGRESS=false

```
export COURSIER_PROGRESS=false
time sbt update
[info] welcome to sbt 1.7.3 (Homebrew Java 17.0.4.1)
[info] loading project definition from /Users/joao/git/sbt-multi-module-sample/project
[info] Total time: 754 ms
[info] loading settings for project root from build.sbt ...
[info] resolving key references (48763 settings) ...
[info] set current project to Scala Seed Project (in build file:/Users/joao/git/sbt-multi-module-sample/)
[debug] not up to date. inChanged = false, force = true
[debug] Updating core...
[debug] not up to date. inChanged = false, force = true
[debug] Updating util...
[debug] Done updating util
[debug] Done updating core
[debug] not up to date. inChanged = false, force = true
[debug] Updating x27...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x56...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x38...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x43...
[debug] not up to date. inChanged = false, force = true
[debug] not up to date. inChanged = false, force = true
[debug] Updating x24...
[debug] Updating x21...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x14...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x11...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x17...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x8...
[debug] Done updating x56
[debug] Done updating x11
[debug] Done updating x17
[debug] Done updating x8
[debug] Done updating x38
[debug] Done updating x43
[debug] Done updating x14
[debug] Done updating x21
[debug] Done updating x24
[debug] Done updating x27
[debug] not up to date. inChanged = false, force = true
[debug] Updating x31...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x45...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x35...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x53...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x28...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x33...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x54...
[debug] not up to date. inChanged = false, force = true
[debug] not up to date. inChanged = false, force = true
[debug] Updating x23...
[debug] Updating x25...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x34...
[debug] Done updating x31
[debug] not up to date. inChanged = false, force = true
[debug] Updating x47...
[debug] Done updating x45
[debug] Done updating x35
[debug] Done updating x53
[debug] Done updating x25
[debug] Done updating x28
[debug] Done updating x34
[debug] Done updating x33
[debug] Done updating x54
[debug] not up to date. inChanged = false, force = true
[debug] Updating x18...
[debug] Done updating x23
[debug] not up to date. inChanged = false, force = true
[debug] Updating x50...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x7...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x4...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x1...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x51...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x60...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x42...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x15...
[debug] Done updating x47
[debug] not up to date. inChanged = false, force = true
[debug] Updating x3...
[debug] Done updating x18
[debug] Done updating x50
[debug] Done updating x7
[debug] not up to date. inChanged = false, force = true
[debug] Updating x57...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x10...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x20...
[debug] Done updating x15
[debug] Done updating x51
[debug] Done updating x4
[debug] Done updating x60
[debug] Done updating x1
[debug] Done updating x42
[debug] Done updating x3
[debug] not up to date. inChanged = false, force = true
[debug] Updating x32...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x2...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x52...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x6...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x12...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x26...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x59...
[debug] Done updating x57
[debug] Done updating x20
[debug] Done updating x10
[debug] not up to date. inChanged = false, force = true
[debug] Updating x41...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x44...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x19...
[debug] Done updating x32
[debug] Done updating x2
[debug] Done updating x6
[debug] Done updating x52
[debug] Done updating x12
[debug] not up to date. inChanged = false, force = true
[debug] Updating x30...
[debug] Done updating x26
[debug] Done updating x59
[debug] not up to date. inChanged = false, force = true
[debug] Updating x16...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x5...
[debug] Done updating x44
[debug] not up to date. inChanged = false, force = true
[debug] Updating x36...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x58...
[debug] Done updating x19
[debug] Done updating x41
[debug] not up to date. inChanged = false, force = true
[debug] Updating x49...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x39...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x46...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x22...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x29...
[debug] Done updating x30
[debug] not up to date. inChanged = false, force = true
[debug] Updating x40...
[debug] Done updating x16
[debug] Done updating x5
[debug] Done updating x49
[debug] Done updating x39
[debug] Done updating x36
[debug] Done updating x58
[debug] not up to date. inChanged = false, force = true
[debug] Updating x48...
[debug] Done updating x29
[debug] Done updating x46
[debug] Done updating x22
[debug] not up to date. inChanged = false, force = true
[debug] Updating x37...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x13...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x9...
[debug] not up to date. inChanged = false, force = true
[debug] Updating x55...
[debug] Done updating x40
[debug] Done updating x48
[debug] Done updating x37
[debug] Done updating x13
[debug] Done updating x9
[debug] Done updating x55
[debug] not up to date. inChanged = false, force = true
[debug] Updating ...
[debug] Done updating
[info] Total time: 8672 ms
[info]   core / update: 1647 ms
[info]   util / update: 1610 ms
[info]   x24 / update : 1581 ms
[info]   x27 / update : 1576 ms
[info]   x8 / update  : 1576 ms
[info]   x11 / update : 1573 ms
[info]   x38 / update : 1570 ms
[info]   x43 / update : 1570 ms
[info]   x17 / update : 1558 ms
[info]   x14 / update : 1554 ms
[info]   x21 / update : 1525 ms
[info]   x56 / update : 1303 ms
[info]   x23 / update : 1135 ms
[info]   x33 / update : 1125 ms
[info]   x34 / update : 1111 ms
[info]   x4 / update  : 1108 ms
[info]   x28 / update : 1087 ms
[info]   x54 / update : 1078 ms
[info]   x42 / update : 1065 ms
[info]   x51 / update : 1061 ms
[info]   x60 / update : 1050 ms
[info]   x25 / update : 1046 ms
[info]   x1 / update  : 1023 ms
[info]   x53 / update : 1023 ms
[info]   x45 / update : 1013 ms
[info]   x15 / update :  984 ms
[info]   x6 / update  :  982 ms
[info]   x12 / update :  972 ms
[info]   x2 / update  :  969 ms
[info]   x35 / update :  969 ms
[info]   x36 / update :  954 ms
[info]   x26 / update :  940 ms
[info]   x3 / update  :  938 ms
[info]   x52 / update :  938 ms
[info]   x58 / update :  920 ms
[info]   x39 / update :  911 ms
[info]   x18 / update :  906 ms
[info]   x5 / update  :  887 ms
[info]   x49 / update :  872 ms
[info]   x7 / update  :  863 ms
[info]   x50 / update :  863 ms
[info]   x47 / update :  834 ms
[info]   x59 / update :  818 ms
[success] Total time: 9 s, completed Nov 9, 2022, 5:06:48 PM
[18.714s][info][gc,heap,exit] Heap
[18.714s][info][gc,heap,exit]  garbage-first heap   total 2760704K, used 1291140K [0x0000000700000000, 0x0000000800000000)
[18.714s][info][gc,heap,exit]   region size 2048K, 90 young (184320K), 18 survivors (36864K)
[18.714s][info][gc,heap,exit]  Metaspace       used 89978K, committed 90624K, reserved 1130496K
[18.714s][info][gc,heap,exit]   class space    used 12948K, committed 13248K, reserved 1048576K

________________________________________________________
Executed in   19.13 secs    fish           external
   usr time   75.62 secs   84.00 micros   75.62 secs
   sys time    7.10 secs  884.00 micros    7.10 secs
```