.PHONY: all build clean test

all: clean build

build:
	./gradlew build

clean:
	./gradlew clean

test:
	./gradlew test
