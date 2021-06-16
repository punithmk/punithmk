node {
	stage ('SCM checkout'){
		git "https://github.com/punithmk/punithmk/tree/main/punith-assignment-bdd-java"
		}
	stage ('Build'){
    	dir("comtest") {
	   sh "mvn clean install -P dev"
       }
		}
}
