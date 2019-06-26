FROM ubuntu:18.04
ARG PACKAGE_VERSION
ARG APPLICATION_NAME
ARG PACKAGE_SHADDED
ENV PACKAGE_SHADDED ${PACKAGE_SHADDED}
ENV PACKAGE_VERSION ${PACKAGE_VERSION}
ENV APPLICATION_NAME ${APPLICATION_NAME}
COPY /aws-java-sdk-bundle/target/${PACKAGE_SHADDED} ${APPLICATION_NAME}-${PACKAGE_VERSION}.jar
EXPOSE 8880
CMD ["sh", "-c", "java -jar ${APPLICATION_NAME}-${PACKAGE_VERSION}.jar"]
