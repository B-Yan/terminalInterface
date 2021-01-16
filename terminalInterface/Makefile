#Makefile version de base

.PHONY: run
run: ; mvn javafx:run

.PHONY: test
test: ; mvn clean install && mvn clean javafx:run

.PHONY: install
install: ; mvn install && mvn javafx:run

.PHONY: jar
jar: ;  mvn clean package shade:shade
