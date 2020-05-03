run:
	@javac -encoding utf8 Story.java
	@java -Dfile.encoding=UTF8 Story
	#exit

test:
	javac -encoding utf8 -cp .:/usr/java/lib/hamcrest-core-1.3.jar:/usr/java/lib/junit-4.11.jar ${FILENAME}
	java -Dfile.encoding=UTF8 -cp .:/usr/java/lib/hamcrest-core-1.3.jar:/usr/java/lib/junit-4.11.jar org.junit.runner.JUnitCore ${CLASS_NAME}