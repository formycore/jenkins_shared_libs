def call () {
	tools {
        maven '3.6.3'
    }
	sh 'mvn test'
}