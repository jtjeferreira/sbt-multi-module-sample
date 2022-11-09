## Results

| run                                            | time |
|------------------------------------------------|------|
| 60 modules (sbt 1.5.8)                         | 36s  |
| 60 modules (sbt 1.5.8) COURSIER_PROGRESS=false | 25s  |

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
