node {
	stage ('SCM checkout'){
		git "https://github.com/puithmk/punithmk/punithmk/punith-assignment-bdd-java/"
		}
	stage ('Build'){
    	dir("comtest") {
	   sh "mvn clean install -P dev"
       }
		}
}
