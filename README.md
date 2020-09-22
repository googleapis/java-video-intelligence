# Google Cloud Video Intelligence Client for Java

Java idiomatic client for [Cloud Video Intelligence][product-docs].

[![Maven][maven-version-image]][maven-version-link]
![Stability][stability-image]

- [Product Documentation][product-docs]
- [Client Library Documentation][javadocs]

## Quickstart

If you are using Maven with [BOM][libraries-bom], add this to your pom.xml file
```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.google.cloud</groupId>
      <artifactId>libraries-bom</artifactId>
      <version>10.1.0</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>

<dependencies>
  <dependency>
    <groupId>com.google.cloud</groupId>
    <artifactId>google-cloud-video-intelligence</artifactId>
  </dependency>

```

If you are using Maven without BOM, add this to your dependencies:

```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-video-intelligence</artifactId>
  <version>1.4.1</version>
</dependency>

```

[//]: # ({x-version-update-start:google-cloud-video-intelligence:released})

If you are using Gradle, add this to your dependencies
```Groovy
compile 'com.google.cloud:google-cloud-video-intelligence:1.4.2'
```
If you are using SBT, add this to your dependencies
```Scala
libraryDependencies += "com.google.cloud" % "google-cloud-video-intelligence" % "1.4.2"
```
[//]: # ({x-version-update-end})

## Authentication

See the [Authentication][authentication] section in the base directory's README.

## Getting Started

### Prerequisites

You will need a [Google Cloud Platform Console][developer-console] project with the Cloud Video Intelligence [API enabled][enable-api].
You will need to [enable billing][enable-billing] to use Google Cloud Video Intelligence.
[Follow these instructions][create-project] to get your project set up. You will also need to set up the local development environment by
[installing the Google Cloud SDK][cloud-sdk] and running the following commands in command line:
`gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

### Installation and setup

You'll need to obtain the `google-cloud-video-intelligence` library.  See the [Quickstart](#quickstart) section
to add `google-cloud-video-intelligence` as a dependency in your code.

## About Cloud Video Intelligence


[Cloud Video Intelligence][product-docs] allows developers to use Google video analysis technology as part of their applications.

See the [Cloud Video Intelligence client library docs][javadocs] to learn how to
use this Cloud Video Intelligence Client Library.





## Samples

Samples are in the [`samples/`](https://github.com/googleapis/java-video-intelligence/tree/master/samples) directory. The samples' `README.md`
has instructions for running the samples.

| Sample                      | Source Code                       | Try it |
| --------------------------- | --------------------------------- | ------ |
| None | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/generated/src/main/java/com/google/cloud/examples/videointelligence/v1p3beta1/VideoDetectLogoBeta.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/generated/src/main/java/com/google/cloud/examples/videointelligence/v1p3beta1/VideoDetectLogoBeta.java) |
| None | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/generated/src/main/java/com/google/cloud/examples/videointelligence/v1p3beta1/VideoDetectLogoGcsBeta.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/generated/src/main/java/com/google/cloud/examples/videointelligence/v1p3beta1/VideoDetectLogoGcsBeta.java) |
| Detect | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/Detect.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/Detect.java) |
| Detect Faces | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/DetectFaces.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/DetectFaces.java) |
| Detect Faces Gcs | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/DetectFacesGcs.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/DetectFacesGcs.java) |
| Detect Logo | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/DetectLogo.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/DetectLogo.java) |
| Detect Logo Gcs | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/DetectLogoGcs.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/DetectLogoGcs.java) |
| Detect Person | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/DetectPerson.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/DetectPerson.java) |
| Detect Person Gcs | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/DetectPersonGcs.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/DetectPersonGcs.java) |
| Streaming Annotation To Storage | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/StreamingAnnotationToStorage.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/StreamingAnnotationToStorage.java) |
| Streaming Auto Ml Classification | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/StreamingAutoMlClassification.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/StreamingAutoMlClassification.java) |
| Streaming Explicit Content Detection | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/StreamingExplicitContentDetection.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/StreamingExplicitContentDetection.java) |
| Streaming Label Detection | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/StreamingLabelDetection.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/StreamingLabelDetection.java) |
| Streaming Object Tracking | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/StreamingObjectTracking.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/StreamingObjectTracking.java) |
| Streaming Shot Change Detection | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/StreamingShotChangeDetection.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/StreamingShotChangeDetection.java) |
| Text Detection | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/TextDetection.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/TextDetection.java) |
| Track Objects | [source code](https://github.com/googleapis/java-video-intelligence/blob/master/samples/snippets/src/main/java/com/example/video/TrackObjects.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-video-intelligence&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/video/TrackObjects.java) |



## Troubleshooting

To get help, follow the instructions in the [shared Troubleshooting document][troubleshooting].

## Transport

Cloud Video Intelligence uses gRPC for the transport layer.

## Java Versions

Java 7 or above is required for using this client.

## Versioning


This library follows [Semantic Versioning](http://semver.org/).


## Contributing


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.

## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 7 | [![Kokoro CI][kokoro-badge-image-1]][kokoro-badge-link-1]
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

[product-docs]: https://cloud.google.com/video-intelligence/docs/
[javadocs]: https://googleapis.dev/java/google-cloud-video-intelligence/latest/
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-video-intelligence/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-video-intelligence/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-video-intelligence/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-video-intelligence/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-video-intelligence/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-video-intelligence/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-video-intelligence/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-video-intelligence/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-video-intelligence/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-video-intelligence/java11.html
[stability-image]: https://img.shields.io/badge/stability-ga-green
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-video-intelligence.svg
[maven-version-link]: https://search.maven.org/search?q=g:com.google.cloud%20AND%20a:google-cloud-video-intelligence&core=gav
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-sdk]: https://cloud.google.com/sdk/
[troubleshooting]: https://github.com/googleapis/google-cloud-common/blob/master/troubleshooting/readme.md#troubleshooting
[contributing]: https://github.com/googleapis/java-video-intelligence/blob/master/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/java-video-intelligence/blob/master/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/java-video-intelligence/blob/master/LICENSE
[enable-billing]: https://cloud.google.com/apis/docs/getting-started#enabling_billing
[enable-api]: https://console.cloud.google.com/flows/enableapi?apiid=videointelligence.googleapis.com
[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png
