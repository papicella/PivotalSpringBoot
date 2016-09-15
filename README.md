<h1>Pivotal Spring Boot Application for Google Cloud Platform</h1>

![alt tag](https://dl.dropboxusercontent.com/u/15829935/platform-demos/images/springboot-gcp-1.png)

<h3> Steps </h3>

Note: You will need Maven and Google Cloud SDK installed

- Set the correct config for your new empty project as shown below. Sign-in to Google Cloud Platform (GCP) console and Create a new 
project as shown in the image below using your own name.

![alt tag](https://dl.dropboxusercontent.com/u/15829935/platform-demos/images/springboot-gcp-2.png)

```
pasapicella@pas-macbook:~/pivotal/GCP$ gcloud projects list
PROJECT_ID              NAME                    PROJECT_NUMBER
pas-spring-boot-on-gcp  Pas Spring Boot on GCP  1043917887789
proven-impact-143410    My First Project        736758822305

pasapicella@pas-macbook:~/pivotal/GCP$ gcloud config set project pas-spring-boot-on-gcp
```

- Clone this project as shown below

```
git clone https://github.com/papicella/PivotalSpringBoot.git
```

- Edit the pom.xml and specify the location direcory of the GCP SDK

```
			<!-- START plugin -->
			<plugin>
				<groupId>com.google.appengine</groupId>
				<artifactId>gcloud-maven-plugin</artifactId>
				<version>2.0.9.111.v20160525</version>
				<configuration>
					<gcloud_directory>/Users/pasapicella/pivotal/GCP/sdk/google-cloud-sdk</gcloud_directory>
				</configuration>
			</plugin>
			<!-- END plugin -->
```

- Package as shown below

```
$ mvn package
```

- Deploy as shown below

```
$ mvn gcloud:deploy
```

Sample output of deploy

```
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building PivotalSpringBoot 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> gcloud-maven-plugin:2.0.9.111.v20160525:deploy (default-cli) > package @ pivotalspringboot >>>
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ pivotalspringboot ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 4 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ pivotalspringboot ---
[INFO] Nothing to compile - all classes are up to date

...

[INFO]
[INFO]
[INFO]
[INFO] Updating service [default]...
[INFO]
[INFO] Updating service [default]...done.
[INFO] Deployed service [default] to [https://pas-spring-boot-on-gcp.appspot.com]
[INFO]
[INFO] You can read logs from the command line by running:
[INFO]   $ gcloud app logs read
[INFO]
[INFO] To view your application in the web browser run:
[INFO]   $ gcloud app browse
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 09:50 min
[INFO] Finished at: 2016-09-15T22:18:21+10:00
[INFO] Final Memory: 24M/397M
[INFO] ------------------------------------------------------------------------
```

<br />
<hr />
Pas Apicella [papicella at pivotal.io] is a Senior Platform Architect at Pivotal Australia