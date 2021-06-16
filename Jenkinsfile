node {
	stage ('SCM checkout'){
		git "https://github.com/punithmk/punithmk/tree/main"
		}
	stage ('Build'){
    	dir("comtest") {
	   sh "mvn clean install -P dev"
       }
		}
}
