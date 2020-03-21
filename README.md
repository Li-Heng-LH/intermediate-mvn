# intermediate-mvn
Walk through of Udemy tutorial: Java/Apache Maven: The Truth About Building Java Programs, and other hands on try-outs.


&nbsp;
----
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

##### Rules of Inheritance #####
* No, the property of <artifact.version> does not automatically resolve artifact version. It is just a placeholder.
* Yes, property can inherit from parent. 
* `<version>` can be inherited from `<dependencyManagement>` : if version is defined in the `<dependencyManagement>` of parent, 
 child no need to specify `<version>` in dependency. 

&nbsp;

##### How to override? #####
* No `<dependencyManagement>` and no properties: Need to state specific dependency fully. 
* No `<dependencyManagement>` but with properties: Override properties in children. 
* With `<dependencyManagement>` but no properties: Override by specifying version number. 
* With `<dependencyManagement>` and with properties: Override properties in children.

&nbsp;

#### How to override GrandParent in Parent? ####
* With `<dependencyManagement>` but no properties: Override with dependency in dependencyManagement of Parent. 
* With `<dependencyManagement>` and with properties: Override properties in Parent. 

&nbsp;

&nbsp;
----
### Useful links ###
* http://maven.apache.org/guides/introduction/introduction-to-the-pom.html#
* http://maven.apache.org/plugins/maven-compiler-plugin/examples/set-compiler-source-and-target.html
* [List of Built-in Lifecycle Bindings](http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

