#!/bin/bash
rm classes/*.class;
rm lib/*.jar;
#Client_itf
javac -d classes -classpath .:classes src/Client_itf.java;
cd classes;
jar cvf ../lib/Client_itf.jar Client_itf.class;
cd ..;
#ClientImpl
javac -d classes -classpath .:classes src/ClientImpl.java;
cd classes;
jar cvf ../lib/ClientImpl.jar ClientImpl.class;
cd ..;
#Registry_itf
javac -d classes -classpath .:classes src/Registry_itf.java;
cd classes;
jar cvf ../lib/Registry_itf.jar Registry_itf.class;
cd ..;
#RegistryImpl
javac -d classes -classpath .:classes src/RegistryImpl.java;
cd classes;
jar cvf ../lib/RegistryImpl.jar RegistryImpl.class;
cd ..;
#Message_itf
javac -d classes -classpath .:classes src/Message_itf.java;
cd classes;
jar cvf ../lib/Message_itf.jar Message_itf.class;
cd ..;
#MessageImpl
javac -d classes -classpath .:classes src/MessageImpl.java;
cd classes;
jar cvf ../lib/MessageImpl.jar MessageImpl.class;
cd ..;
#Autres
javac -d classes -cp .:classes:lib/Client_itf.jar:lib/ClientImpl.jar:lib/Registry_itf.jar:lib/RegistryImpl.jar:lib/Message_itf.jar:lib/MessageImpl.jar src/ServerChat.java;
javac -d classes -cp .:classes:lib/Client_itf.jar:lib/Registry_itf.jar:lib/Message_itf.jar src/ClientChat.java;