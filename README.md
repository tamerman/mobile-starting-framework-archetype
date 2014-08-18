mobile-starting-framework-archetype
===================================

Archetype companion project to mobile-starting-framework

1 - Building the source
=======================
Check out the source into a directoy
Build with the following command:
    mvn clean install
It should complete without errors

2 - Creating a tool
==============================
Navigate to the directory where you want to create the tool
Run the following command


mvn archetype:generate \
	-DarchetypeGroupId=org.kuali.mobility \
	-DarchetypeArtifactId=kme-tool-archetype \
	-DarchetypeVersion=2.2.1-SNAPSHOT \
	-DgroupId=org.kuali.mobility \
	-DartifactId=mytool \
	-DgroupPath=org/kuali/mobility \
	-DkmeVersion=3.0.0-SNAPSHOT \
	-DfileNamePrefix=MyTool \
	-DtoolNameShort=mytool
	-Dversion=1.0.0-SNAPSHOT


Press y at the prompt if all seems fine