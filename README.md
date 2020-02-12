# intermediate-mvn
Walk through of Udemy tutorial: Java/Apache Maven: The Truth About Building Java Programs, and other hands on try-outs.


&nbsp;
### Some Learning Notes ###
##### Project Aggregation #####
* Project Aggregation is not Project Inheritance. 
* To achieve project aggregation, module name = artifactId =  directory name
* Benefits of Project Aggregation: mvn commands that run on parent will be run on children as well. 
&nbsp;
    
##### Project Inheritance Plus Project Aggregation #####
* Benefits: 
  * Avoid redundancy with inheritance
  * Mvn run on parent only
&nbsp;

##### Plugins #####
* Recommend to always run `clean` plugin before default/build lifecycle. To make sure all old stuff is cleaned up
and will not affect the new builds. 
&nbsp;

##### Rules of Overriding #####
* No <dependencyManagement> and no properties: need to state specific dependency fully. 


&nbsp;
&nbsp;
### Useful links ###
* http://maven.apache.org/guides/introduction/introduction-to-the-pom.html#
* http://maven.apache.org/plugins/maven-compiler-plugin/examples/set-compiler-source-and-target.html
* [List of Built-in Lifecycle Bindings](http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

