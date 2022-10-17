.PHONY: all build clean format lint report test

all: clean format lint test report build

build:
	./gradlew build

clean:
	./gradlew clean

format:
	./gradlew formatKotlin

lint:
	./gradlew detekt lintKotlin

report:
	./gradlew koverMergedReport

test:
	./gradlew test
