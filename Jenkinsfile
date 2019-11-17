node {
	stage ('SCM checkout'){
		git "https://github.com/sriram26041993/CloudApllicationTest"
		}
	stage ('Build'){
		sh "mvn clean install"
       }
}
