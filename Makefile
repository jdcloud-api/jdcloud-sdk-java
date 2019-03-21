all: test

test:
	set -e; \
	for f in */pom.xml; do \
		if [ $$f != "demo/pom.xml" ]; then \
			cd `dirname $$f` && mvn test -B && cd ..; \
		fi; \
	done
