<h1>Pivotal Spring Boot Application for Google Cloud Platform</h1>

![alt tag](https://dl.dropboxusercontent.com/u/15829935/platform-demos/images/springboot-gcp-1.png)

<h3> Steps </h3>

Note: You will need Maven and Google Clpoud SDK installed

1. Set the correct config for your new empty project as shown below. Sign-in to Google Cloud Platform console and Create a new 
project as shown in the image below using your own name.

![alt tag](https://dl.dropboxusercontent.com/u/15829935/platform-demos/images/springboot-gcp-2.png)

```
pasapicella@pas-macbook:~/pivotal/GCP$ gcloud projects list
PROJECT_ID              NAME                    PROJECT_NUMBER
pas-spring-boot-on-gcp  Pas Spring Boot on GCP  1043917887789
proven-impact-143410    My First Project        736758822305

pasapicella@pas-macbook:~/pivotal/GCP$ gcloud config set project pas-spring-boot-on-gcp
```

2. Clone this project as shown below


<br />
<hr />
Pas Apicella [papicella at pivotal.io] is a Senior Platform Architect at Pivotal Australia