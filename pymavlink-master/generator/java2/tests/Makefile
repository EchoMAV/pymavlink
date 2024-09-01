all: build

test:
	mkdir build
	find "built-apis/lib/" -name "*.java" > build/JAVA_SOURCES.txt
	javac -d build/JAVA_CLASSES @build/JAVA_SOURCES.txt
	kotlinc -cp build/JAVA_CLASSES -script BinaryTests.kts

testv2:
	mkdir build
	find "built-apis/libv2/" -name "*.java" > build/JAVA_SOURCES.txt
	javac -d build/JAVA_CLASSES @build/JAVA_SOURCES.txt
	kotlinc -cp build/JAVA_CLASSES -script BinaryTests.kts

clean:
	rm -rf build