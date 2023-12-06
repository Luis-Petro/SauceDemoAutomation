FROM gradle:jdk11

RUN gradle --version && java -version
RUN mkdir -p /home/gradle/cache_home
ENV GRADLE_USER_HOME /home/gradle/cache_home
# Chrome-i

RUN apt-get -y update
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb 
RUN apt install ./google-chrome-stable_current_amd64.deb -y

#Copy automation files
COPY ./ /home/
WORKDIR /home

# Do the actual build
RUN gradle clean build -x test -i --stacktrace --no-daemon

