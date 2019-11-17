node {
	stage ('SCM checkout'){
		git "https://github.com/sriram26041993"
		}
	stage ('Build'){
    	dir("CloudApllicationTest") {
	   sh "mvn clean install"
       }
}
}
