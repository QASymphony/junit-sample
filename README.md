jUnit Sample Demo 

This package includes sample java code integrate with JUnit testing framework.

This package can be compiled with Maven / Ant

JUnit Sample demo integrate with qTest Automation Host

How to use sample package to integrate with qTest Automation Host
- First, setup qTest Automation Host. And install JUnit for Java framework in qTest Automation Host.
- Download JUnit sample package and unzip in your directory (eg: D:\SampleDemo\junit-sample).
- Set up new agent with configure Agent below:

### Agent Configuration
###### Test Scripts
```sh
Directory: D:\SampleDemo\junit-sample
Scripting libs: D:\SampleDemo\junit-sample\libs
Include: **/*.class
```

###### Test Execution
```sh
Executable mode: Command
Executable home: C:\Program Files\Java\jdk1.7.0_21
Command: java
Command arguments: -cp D:\Demo\junit-sample\target\*;
```

Refer image below:

![Agent Configuration](/documentation/agent-configuration.png?raw=true)
