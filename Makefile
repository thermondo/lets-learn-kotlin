.PHONY: all build clean lint test

all: clean build

build:
	./gradlew build

clean:
	./gradlew clean

lint:
	./gradlew detekt

test:
	./gradlew test
