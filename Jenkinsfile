node {
	stage ('SCM checkout'){
		git "https://github.com/sriram26041993/CloudApllicationTest"
		}
	stage ('Build'){
    	dir("/") {
	   sh "mvn clean install"
       }
}
}
