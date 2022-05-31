# Exercise6

## JavaDoc

### What is necessary to generate Maven site documentation?

site.xml and the right directory structure

### What different aspects, configurations information, etc. are configured in site.xml or pom.xml.

A POM is teh fundamental unit of work in Maven. It contains information about the project and configuration details used by Maven to build the project. It contains examples like the target directory. When executing a task or goal, Maven looks for the POM in the current directory. It reads the POM, gets the needed configuration information, then executes the goal.
Some of the configuration that can be specified in the POM are the project dependencies, the plugins or goals that can be executed, the build profiles, and so on. Other information such as the project version, description, developers, mailing lists and such can also be specified.

[go to README.md](./README.md)
