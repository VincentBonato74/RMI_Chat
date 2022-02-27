#!/bin/bash
java -classpath .:classes:lib/Client_itf.jar:lib/ClientImpl.jar:lib/Registry_itf.jar:lib/RegistryImpl.jar:lib/Message_itf.jar:lib/MessageImpl.jar ServerChat;