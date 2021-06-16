node {
	stage ('SCM checkout'){
		git "https://github.com/puithmk/punithmk"
		}
	stage ('Build'){
    	dir("comtest") {
	   sh "mvn clean install -P dev"
       }
		}
}
