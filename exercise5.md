# Exercise5

## Log4J Test
 
### Info And Error

Only error and fatal logs show up in the console.

### log4j configuration file

you can find a template for the configuration in: [resources/xml/log4j2.xml.template](resources/xml/log4j2.xml.template)

### Why are logging libraries used?

Logging information during the execution of your application can help you understand what led to a bug or crash, giving you more context than you get from simply a report of a crash.

### What log levels are there in Log4J and what is it all about?

Log levels are a mechanism to categorise logs. Levels used for identifying the severity of an event. We can easily configure levels to specify which log details we want to see.

- Debug
- Error
- Fatal
- Info
- Trace
- Warn

### What configuration options does log4J offer you?

We can configure log4j by using configuration files like XML, JSON and YAML.   
You can also greate them programmatically.
 Log4j has the ability to automatically configure itself during initialization. It has an order to look for the configuration file in the application. Log4j will provide a default configuration if it cannot locate a configuration file.

[go to README.md](./README.md)